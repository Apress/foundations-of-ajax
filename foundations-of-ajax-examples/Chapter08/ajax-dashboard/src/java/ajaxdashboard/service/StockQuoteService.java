package ajaxdashboard.service;

import ajaxdashboard.ws.stockquote.GetQuotes;
import ajaxdashboard.ws.stockquote.GetQuotesResponse;
import ajaxdashboard.ws.stockquote.Quote;
import ajaxdashboard.ws.stockquote.StockQuotesLocator;
import ajaxdashboard.ws.stockquote.StockQuotesSoap;
import javax.xml.rpc.ServiceException;

public class StockQuoteService {

    public GetQuotesResponse getStockQuotesFor(String ticker) {
        GetQuotes quotes = new GetQuotes(ticker);
        GetQuotesResponse quotesResponse = null;
        try {
            quotesResponse = getStockQuotesSoap().getStockQuotes(quotes);
        } catch(java.rmi.RemoteException ex) {
            // TODO handle remote exception
        }
        
        Quote[] quotesArray = quotesResponse.getGetQuotesResult().getQuote();
        Quote quote = null;
        for(int i = 0; i < quotesArray.length; i++) {
            quote = quotesArray[i];
//            System.out.println("Quote for: " + quote.getCompanyName()
//                + " (" + quote.getStockTicker()+ ")"
//                + "\nQuote:" + quote.getStockQuote()
//                + "\nLastUpdate:" + quote.getLastUpdated()
//                + "\nChange:" + quote.getChange());
        }

        return quotesResponse;
    }

    private StockQuotesSoap getStockQuotesSoap() {
        StockQuotesSoap stockQuotesSoap = null;
        try {
            stockQuotesSoap = new StockQuotesLocator().getStockQuotesSoap();
        } catch (ServiceException ex) {
            ex.printStackTrace();
        }
        return stockQuotesSoap;
    }
}
