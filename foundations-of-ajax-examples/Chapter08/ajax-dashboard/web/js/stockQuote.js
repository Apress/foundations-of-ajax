var stockTickerUpdateIntervalID = 0;

function handleStockTickersChange() {
    clearStockTickerUpdateInterval();
}

function clearStockTickerUpdateInterval() {
    if(stockTickerUpdateIntervalID != 0) {
        window.clearInterval(stockTickerUpdateIntervalID);
    }

    document.getElementById("trackFlag").checked = false;
}

function updateStockQuote() {
    var ajaxRequest = new AjaxRequest("UpdateStockQuote");
    ajaxRequest.addFormElementsById("stockTickers");
    ajaxRequest.sendRequest();
}

function startUpdateStockQuoteInterval() {
    stockTickerUpdateIntervalID = window.setInterval("updateStockQuote()", 90000);
}

function handleTrackFlagClick() {
    var trackFlag = document.getElementById("trackFlag");

    if(trackFlag.checked) {
        updateStockQuote();
        startUpdateStockQuoteInterval();
    }
    else {
        clearStockTickerUpdateInterval();
    }
}

