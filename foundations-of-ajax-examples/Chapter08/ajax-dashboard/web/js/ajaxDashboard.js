function initDomDrag(handleID, rootID) {
    var handle = document.getElementById(handleID);
    var root = document.getElementById(rootID);
    Drag.init(handle, root);
}

//weather forecast
initDomDrag("handle", "root");

//stock quotes
initDomDrag("stockQuoteHandle", "stockQuoteRoot");

//headline news
initDomDrag("newsItemsHandle", "newsItemsRoot");

//search
initDomDrag("searchHandle", "searchRoot");

//start auto updating
handleZipCodeChange();
startUpdateStockQuoteInterval();
startUpdateNewsItemsInterval();

//set up autocomplete
AutocompleteManager.registerHandler(new AutocompleteHandler("searchTerm"
                                                        , "Search", 275, 3));
    
    
