/**
 * StockQuotesSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package ajaxdashboard.ws.stockquote;

public interface StockQuotesSoap extends java.rmi.Remote {

    /**
     * Retrieves the latest(20 minutes delay) stock quote of a stock
     * ticker. To get multiple quotes enter Ticker symbols seperated by ,(eg.
     * MSFT,YHOO,GE) or space (eg. MSFT YHOO GE). <BR>Gives the company name
     * ,ticker,Stock Quote, Change,Open price ,Day's range(high and low),Volume,
     * the Market Cap and the Year range of the stock price.<BR><B>Powered
     * by Yahoo!'s stock Quotes service.Not for commerical use.</b>
     */
    public ajaxdashboard.ws.stockquote.GetQuotesResponse getStockQuotes(ajaxdashboard.ws.stockquote.GetQuotes parameters) throws java.rmi.RemoteException;
}
