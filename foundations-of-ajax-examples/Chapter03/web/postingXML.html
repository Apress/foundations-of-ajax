<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Sending an XML Request</title>

<script type="text/javascript">

var xmlHttp;

function createXMLHttpRequest() {
    if (window.ActiveXObject) {
        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
    } 
    else if (window.XMLHttpRequest) {
        xmlHttp = new XMLHttpRequest();
    }
}
    
function createXML() {
    var xml = "<pets>";
    
    var options = document.getElementById("petTypes").childNodes;
    var option = null;
    for(var i = 0; i < options.length; i++) {
        option = options[i];
        if(option.selected) {
            xml = xml + "<type>" + option.value + "<\/type>";
        }
    }
    
    xml = xml + "<\/pets>";
    return xml;
}

function sendPetTypes() {
    createXMLHttpRequest();
    
    var xml = createXML();
    var url = "PostingXMLExample?timeStamp=" + new Date().getTime();
    
    xmlHttp.open("POST", url, true);
    xmlHttp.onreadystatechange = handleStateChange;
    xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");    
    xmlHttp.send(xml);
}
    
function handleStateChange() {
    if(xmlHttp.readyState == 4) {
        if(xmlHttp.status == 200) {
            parseResults();
        }
    }
}

function parseResults() {
    var responseDiv = document.getElementById("serverResponse");
    if(responseDiv.hasChildNodes()) {
        responseDiv.removeChild(responseDiv.childNodes[0]);
    }
    
    var responseText = document.createTextNode(xmlHttp.responseText);
    responseDiv.appendChild(responseText);
}


</script>
</head>

<body>
  <h1>Select the types of pets in your home:</h1>
  
  <form action="#">
    <select id="petTypes" size="6" multiple="true">
        <option value="cats">Cats</option>
        <option value="dogs">Dogs</option>
        <option value="fish">Fish</option>
        <option value="birds">Birds</option>
        <option value="hamsters">Hamsters</option>
        <option value="rabbits">Rabbits</option>
    </select>
    
    <br/><br/>
    <input type="button" value="Submit Pets" onclick="sendPetTypes();"/>
  </form>

  <h2>Server Response:</h2>

  <div id="serverResponse"></div>

</body>
</html>
