/**
 * StockQuotes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package ajaxdashboard.ws.stockquote;

public interface StockQuotes extends javax.xml.rpc.Service {
    public java.lang.String getStockQuotesSoapAddress();

    public ajaxdashboard.ws.stockquote.StockQuotesSoap getStockQuotesSoap() throws javax.xml.rpc.ServiceException;

    public ajaxdashboard.ws.stockquote.StockQuotesSoap getStockQuotesSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
