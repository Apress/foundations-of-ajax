package ajaxdashboard.servlet;

import ajaxdashboard.service.WeatherForecastService;
import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class WeatherForecastServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request
                                            , HttpServletResponse response)
                                            throws ServletException, IOException {
        
        WeatherForecastService forecastService = new WeatherForecastService();
        request.setAttribute("forecastData", forecastService.getForecastFor("55431"));
        request.getRequestDispatcher("/jsp/ajaxDashboard.jsp").forward(request, response);
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
