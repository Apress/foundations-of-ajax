function doRequest(textboxID, url) {
    setOffsets(textboxID);
    var textbox = document.getElementById(textboxID);
    if(textbox.value.length > 1) {
        var ajaxRequest = new AjaxRequest(url);
        ajaxRequest.addNamedFormElements(textboxID);
        ajaxRequest.setPostRequest(showPopup);
        ajaxRequest.sendRequest();
    }
    else if(textbox.value.length == 0) {
        clearPopup();
    }
}

function showPopup(ajaxRequest) {
    document.getElementById("popup").style.display = "";
}
    
function setOffsets(textboxID) {
    var inputField = document.getElementById(textboxID);
    var end = inputField.offsetWidth;
    var left = calculateOffsetLeft(inputField);
    var top = calculateOffsetTop(inputField) + inputField.offsetHeight;

    var popup = document.getElementById("popup");
    popup.style.border = "black 1px solid";
    popup.style.left = left + "px";
    popup.style.top = top + "px";
    popup.style.width = "250px";
    popup.style.height = "200px";
}

function calculateOffsetLeft(field) {
    return calculateOffset(field, "offsetLeft");
}

function calculateOffsetTop(field) {
    return calculateOffset(field, "offsetTop");
}

function calculateOffset(field, attr) {
    var offset = 0;
    while(field) {
        offset += field[attr]; 
        field = field.offsetParent;
    }
    return offset;
}
    
    
function clearPopup() {
    var popup = document.getElementById("popup");
    while(popup.childNodes.length > 0) {
        popup.removeChild(popup.firstChild);
    }
    
    popup.style.display = "none";
}


function addSelection(code, text) {
    var popup = document.getElementById("popup");
  
    opener.addToSelectedSuppliersSelect(code, text);
    
    clearPopup();
    AutocompleteManager.stopRunningInterval();
    hideAutoComplete();
    
    document.getElementById("supplierName").value = "";
}


var AutocompleteManager = new AutocompleteManagerImpl();

function AutocompleteManagerImpl() {
    this.textboxes = new Object();
    
    this.startTheInterval = function(id) {
        
        var handler = this.textboxes[id];

        if(handler.state == "running") {
            return;
        }
        
        var functionString = "handleInterval('" + id + "');" ;

        handler.timeoutID = window.setInterval(functionString, handler.interval);
        handler.state = "running";

    }

    this.getHandlerFor = function(id) {
        return this.textboxes[id];
    }

    this.stopTheInterval = function(id) {
        var handler = this.getHandlerFor(id);
        window.clearInterval(handler.timeoutID);
        handler.state = "stopped";
    }
    
    this.stopRunningInterval = function() {
        var handler = null;
        for(var i = 0; i < this.textboxes.length; i++) {
            handler = this.textboxes[i];
            if(handler.state == "running") {
                window.clearInterval(handler.timeoutID);
                break;
            }
        }
    }

    this.registerHandler = function(handler) {
        this.textboxes[handler.id] = handler;
    }
    
}

function AutocompleteHandler(id, url, interval, minLength) {
    this.id = id;
    this.url = url;
    this.interval = interval;
    this.minLength = minLength;
    this.lastSearchString = "";
    this.timeoutID;
    this.state = "stopped";
}


function handleInterval(id) {
    var searchString = document.getElementById(id).value;
    var handler = AutocompleteManager.getHandlerFor(id);

    if(searchString.length < handler.minLength || searchString.length == 0) {
        clearPopup();
        hideAutoComplete();
        return;
    }

    if(searchString == handler.lastSearchString) {
        return;
    }

    //Made it this far so make the request
    doRequest(id, handler.url);
    
    //Remember the last search string
    handler.lastSearchString = document.getElementById(id).value;
}

function emptyAutoComplete() {
    var popup = document.getElementById("popup");
    while(popup.hasChildNodes()) {
        popup.removeChild(popup.firstChild);
    }
}

function hideAutoComplete() {
    document.getElementById("popup").style.display = "none";
}

function onFocusFunction(id) {
    AutocompleteManager.startTheInterval(id);
}
