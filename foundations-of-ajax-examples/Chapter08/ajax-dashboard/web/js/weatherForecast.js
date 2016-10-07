var weatherForecastIntervalID = 0;

function updateWeatherForecast() {
    var ajaxRequest = new AjaxRequest("UpdateWeatherForecast");
    ajaxRequest.addFormElementsById("forecastZipCode");
    ajaxRequest.sendRequest();
}

function handleZipCodeChange() {
    var zipCode = document.getElementById("forecastZipCode").value;
    if(isValidZipCode(zipCode)) {
        updateWeatherForecast();
        startWeatherUpdateInterval();
    }
    else {
        if(weatherForecastIntervalID != 0) {
            window.clearInterval(weatherForecastIntervalID);
            weatherForecastIntervalID = 0;
        }
    }
}

function startWeatherUpdateInterval() {
    weatherForecastIntervalID = window.setInterval("updateWeatherForecast()", 300000);
}

function isValidZipCode(zip) {
    if(zip.length == 5 && isAllDigits(zip)) {
        return true;
    }

    return false;
}

function isAllDigits(argvalue) {
    argvalue = argvalue.toString();
    var validChars = "0123456789";
    var startFrom = 0;

    for (var n = startFrom; n < argvalue.length; n++) {
        if (validChars.indexOf(argvalue.substring(n, n+1)) == -1) {
            return false;
        }
    }
    return true;
}

