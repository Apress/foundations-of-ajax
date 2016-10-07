package ajaxdashboard.servlet;

import ajaxdashboard.service.WeatherForecastService;
import java.io.*;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.*;

public class UpdateWeatherForecastServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request
                                            , HttpServletResponse response)
                                            throws ServletException, IOException {
        
        String zipCode = request.getParameter("forecastZipCode");
        WeatherForecastService forecastService = new WeatherForecastService();
        request.setAttribute("forecastData"
                                    , forecastService.getForecastFor(zipCode));
        
        System.out.println("Weather updated at: " + new Date().toString());
        
        request.getRequestDispatcher("/jsp/weather/weatherForecastAjax.jsp")
                                                    .forward(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
}
