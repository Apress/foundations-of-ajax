var updateNewsItemsIntervalID = 0;

function updateNewsItems() {
    var ajaxRequest = new AjaxRequest("UpdateNewsItems");
    ajaxRequest.sendRequest();
}

function startUpdateNewsItemsInterval() {
    updateNewsItemsIntervalID = window.setInterval("updateNewsItems()", 90000);
}