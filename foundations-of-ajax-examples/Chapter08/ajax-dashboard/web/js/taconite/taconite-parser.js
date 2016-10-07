String.prototype.trim = function() {
    //skip leading and trailing whitespace
    //and return everything in between
    var x=this;
    x=x.replace(/^\s*(.*)/, "$1");
    x=x.replace(/(.*?)\s*$/, "$1");
    return x;
};

function XhtmlToDOMParser(xml) {
    var CREATE_DOCUMENT_FRAGMENT = "var node0 = document.createDocumentFragment();";
    var CREATE_ELEMENT = "zero = document.createElement(\"one\");";
    var APPEND_CHILD = "zero.appendChild(one);";
    var APPEND_TEXT_NODE_CHILD = "zero.appendChild(document.createTextNode(\"one\"));";
    var SET_ATTRIBUTE = "zero.setAttribute(\"one\", \"two\");";
    var EVENT_HANDLER_ATTR = "zero.one = function () { two };";
    var SET_STYLE_CSSTEXT = "zero.style.cssText = \"one\";";

    var NODE_VAR_NAME = "node";

    var xmlDoc = xml;
    var parents = new Array();

    var elementIndex = 0;
    var highestNestingLevel = 0;
    var domJS = "";

   
    this.getJavaScript = function() {
        return domJS;
    };

    this.startParsing = function() {
        var start = new Date().getTime();
   
        domJS = domJS + getPrepend(xmlDoc);
        parseToJavaScript(xmlDoc);
        domJS = domJS + getAppend(xmlDoc);
    };

    function parseToJavaScript(element) {
        var nodeType = element.nodeType;

        switch(nodeType) {
            case 1:  //ELEMENT_NODE
                handleElement(element);
                break;
            case 3:  //TEXT_NODE
               handleTextNode(element);
               break;
            case 4:  //CDATA_SECTION_NODE
                break;
        }
    }

    function handleElement(elementNode) {
        elementIndex = getNewElementIndex();

        var tagName = elementNode.tagName.toLowerCase();

//        if(tagName == "taconite-root") {
        if(isTaconiteTag(elementNode)) {
            domJS = domJS + CREATE_DOCUMENT_FRAGMENT;
        }
        else if(isRadioButton(elementNode) && isIE()) {
            domJS = domJS + renderIERadioButton(elementNode);
        }
        else {
            var createVarToken = getNodeCreationToken(elementIndex);
            var createTokenParms = {zero: createVarToken, one: elementNode.tagName.toLowerCase()};
            var createToken = replaceParms(createTokenParms, CREATE_ELEMENT);
            domJS = domJS + createToken;

            //Add the element's attributes
            handleAttributes(elementNode);
        }
       

        if(parents.length > 0) {
            //Append this element to its parent
            var appendParms = {zero: NODE_VAR_NAME + peekFromParents(), one: NODE_VAR_NAME + elementIndex  };
            var appendToken = replaceParms(appendParms, APPEND_CHILD);
            domJS = domJS + appendToken;
        }

        //Set this element to be the current parent element
        parents.push(elementIndex);

        //Do all the elementNode's children
        for(var z = 0; z < elementNode.childNodes.length; z++) {
            parseToJavaScript(elementNode.childNodes[z]);
        }

       
        //Done with all this element's children
        parents.pop();

        //Decrement the elementIndex
        elementIndex = elementIndex - 1;
    }

   
    function handleAttributes(elementNode) {
        var attr = null;
        var attrParms;
        var name = "";
        var value = "";
        for(var x = 0; x < elementNode.attributes.length; x++) {
            attr = elementNode.attributes[x];
            name = attr.name.trim().toLowerCase();
            value = attr.value.trim();
           
            if(name == "style") {
                /* IE workaround */
                attrParms = {zero: getCurrentElementVarName(), one: value };
                domJS = domJS + replaceParms(attrParms, SET_STYLE_CSSTEXT);

                /* Standards compliant */
                attrParms = {zero: getCurrentElementVarName(), one: name, two: value };
                domJS = domJS + replaceParms(attrParms, SET_ATTRIBUTE);
            }
            else if(isEventHandler(attr.name)) {
                /* IE workaround for event handlers */
                attrParms = {zero: getCurrentElementVarName(), one: name, two: value  };
                domJS = domJS + replaceParms(attrParms, EVENT_HANDLER_ATTR);
            }
            else {
                /* Standards compliant */
                attrParms = {zero: getCurrentElementVarName(), one: name, two: value };
                domJS = domJS + replaceParms(attrParms, SET_ATTRIBUTE);
            }

            /* class attribute workaround for IE */
            if(name == "class") {
                attrParms = {zero: getCurrentElementVarName(), one: "className", two: value };
                domJS = domJS + replaceParms(attrParms, SET_ATTRIBUTE);
            }

        }
    }

    function handleTextNode(textNode) {
        var text = textNode.nodeValue.trim();
        if(text.length == 0) {
            return;
        }
        var parms = {zero: getCurrentElementVarName(), one: text };
        var appendTextToken = replaceParms(parms, APPEND_TEXT_NODE_CHILD);
        domJS = domJS + appendTextToken;
    }

    function getNewElementIndex() {
        if(parents.length == 0) {
            return 0;
        }
        return peekFromParents() + 1;
    }

    function peekFromParents() {
        var peek = parents.pop();
        parents.push(peek);
        return peek;
    }

    function getNodeCreationToken(currentIndex) {
        if(currentIndex > highestNestingLevel) {
            highestNestingLevel = currentIndex;
            return "var node" + currentIndex;
        }
        else {
            return "node" + currentIndex;
        }
    }

    function replaceParms(parms, str) {
        var temp = str;
        var key;
        for(var key in parms) {
            temp = temp.replace(key, parms[key]);
        }

        return temp;
    }

    function getCurrentElementVarName() {
        return NODE_VAR_NAME + elementIndex;
    }

    function isEventHandler(name) {
        return name.trim().toLowerCase().substring(0, 2) == "on";
    }

    function isRadioButton(node) {
        if(!node.tagName.trim().toLowerCase() == "input") {
            return false;
        }

        var attrs = node.attributes;
        var attr = null;
        for(var a = 0; a < attrs.length; a++) {
            attr = attrs[a];
           
            if(attr.name.toLowerCase().trim() == "type") {
                if(attr.value.toLowerCase().trim() == "radio") {
                    return true;
                }
            }
        }
        return false;
    }

    function isIE() {
        if(document.uniqueID) {
            return true;
        }
        else {
            return false;
        }
    }

    function renderIERadioButton(node) {
        var attrString = "";
        var name = "";
        var value = "";
        var attr = null;

        for(var q = 0; q < node.attributes.length; q++) {
            if(q > 0) {
                attrString = attrString + " ";
            }
            attr = node.attributes[q];
            name = attr.name.trim().toLowerCase();
            value = attr.value.trim();

            attrString = attrString + name + "='" + value + "'" ;
        }

        var radioButton = getCurrentElementVarName() + " = document.createElement(\"<input "  + attrString + ">\");" ;
       
        return radioButton;
    }

    function isTaconiteTag(node) {
        var name = node.tagName.trim();
        return name.substring(0, 9) == "taconite-";
    }

    function getPrepend(node) {
        return "";
    }

    function getAppend(node) {
        var tagName = node.tagName.toLowerCase().trim();
        var appendToken = "";
        switch (tagName) {
            case "taconite-append-as-children":
                appendToken = getAppendAsChildren(node);
                break;
            case "taconite-append-as-first-child":
                appendToken = getAppendAsFirstChild(node);
                break;
            case "taconite-delete":
                appendToken = getDelete(node);
                break;
            case "taconite-insert-after":
                appendToken = getInsertAfter(node);
                break;
            case "taconite-insert-before":
                appendToken = getInsertBefore(node);
                break;
            case "taconite-replace-children":
                appendToken = getReplaceChildren(node);
                break;
            case "taconite-replace":
                appendToken = getReplace(node);
                break;
        }

        return appendToken;
    }

    function getContextNodeID(node) {
        return node.getAttribute("contextNodeID");
    }

    function getContextNodeDOM(node) {
        var format = "document.getElementById(\"one\")";
        var parms = {one: getContextNodeID(node)  } ;
        return replaceParms(parms, format);
    }

    function getAppendAsChildren(node) {
        return getContextNodeDOM(node) + ".appendChild(node0);";
    }

    function getAppendAsFirstChild(node) {
        var format = "if(one.childNodes.length > 0) { "
            + "two.insertBefore(node0, three.childNodes[0]) ; }"
            + " else { four.appendChild(node0); } ";
       
        var parms = {one: getContextNodeDOM(node), two: getContextNodeDOM(node), three: getContextNodeDOM(node), four: getContextNodeDOM(node)  } ;

        return replaceParms(parms, format);
    }

    function getDelete(node) {
        var format = "one.parentNode.removeChild(two);";
        var parms = { one: getContextNodeDOM(node), two: getContextNodeDOM(node) };
        return replaceParms(parms, format);
    }

    function getInsertAfter(node) {
        var format = "var nextSibling = one.nextSibling;"
                + "if (nextSibling == null ) { "
                + "two.parentNode.appendChild(node0); } "
                + "else { "
                + "nextSibling.parentNode.insertBefore(node0, nextSibling); } ";

        var parms = { one: getContextNodeDOM(node), two: getContextNodeDOM(node) };
        return replaceParms(parms, format);
    }

    function getInsertBefore(node) {
        var format = "one.parentNode.insertBefore(node0, two);";

        var parms = { one: getContextNodeDOM(node), two: getContextNodeDOM(node) };
        return replaceParms(parms, format);
    }

    function getReplaceChildren(node) {
        var format =
                "while (one.childNodes.length > 0) {"
                + "two.removeChild(three.childNodes[0]); }"
                + "four.appendChild(node0);";

        var parms = { one: getContextNodeDOM(node), two: getContextNodeDOM(node), three: getContextNodeDOM(node), four: getContextNodeDOM(node) };

        return replaceParms(parms, format);
    }

    function getReplace(node) {
        var format = "one.parentNode.replaceChild(node0, two);";

        var parms = { one: getContextNodeDOM(node), two: getContextNodeDOM(node) };
        return replaceParms(parms, format);
    }
}
