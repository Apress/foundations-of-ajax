package ajaxdashboard.servlet;

import ajaxdashboard.service.StockQuoteService;
import ajaxdashboard.ws.stockquote.GetQuotesResponse;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class StockQuoteServlet extends HttpServlet {
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        /* TODO output your page here
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet StockQuoteServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet StockQuoteServlet at " + request.getContextPath () + "</h1>");
        out.println("</body>");
        out.println("</html>");
         */
        
        GetQuotesResponse quotesResponse = new StockQuoteService().getStockQuotesFor("DCX");
        request.setAttribute("quotesResponse", quotesResponse);
        request.getRequestDispatcher("/stockQuote.jsp").forward(request, response);
//        out.close();
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
