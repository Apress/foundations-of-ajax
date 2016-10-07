 package ajaxdashboard.servlet;

import ajaxdashboard.service.StockQuoteService;
import ajaxdashboard.ws.stockquote.GetQuotesResponse;
import ajaxdashboard.ws.stockquote.Quote;
import java.io.*;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.*;

public class UpdateStockQuoteServlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request
                                            , HttpServletResponse response)
                                            throws ServletException, IOException {
        
        String stockTickers = request.getParameter("stockTickers").toUpperCase();
        
        GetQuotesResponse quotesResponse = 
                       new StockQuoteService().getStockQuotesFor(stockTickers);
        
        Quote[] quotesArray = quotesResponse.getGetQuotesResult().getQuote();
        
        request.setAttribute("quotesArray", quotesArray);
        
        System.out.println("\n\n****\nStock quotes updated at: " 
                                                        + new Date().toString());
        
        request.getRequestDispatcher("/jsp/stockQuote/stockQuoteAjax.jsp")
                                                .forward(request, response);

    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
