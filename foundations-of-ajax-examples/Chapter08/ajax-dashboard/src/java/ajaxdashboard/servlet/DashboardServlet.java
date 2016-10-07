package ajaxdashboard.servlet;

import ajaxdashboard.Constants;
import ajaxdashboard.service.NewsService;
import ajaxdashboard.service.StockQuoteService;
import ajaxdashboard.service.WeatherForecastService;
import ajaxdashboard.ws.stockquote.GetQuotesResponse;
import ajaxdashboard.ws.stockquote.Quote;
import java.io.*;
import java.util.Collection;

import javax.servlet.*;
import javax.servlet.http.*;

public class DashboardServlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request
                                                , HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        getWeatherForecast(request, response);
        
        getStockQuotes(request, response);
        
        getNewsItems(request, response);
        
        request.getRequestDispatcher("/jsp/ajaxDashboard.jsp")
                                                .forward(request, response);
    }
    
    private void getWeatherForecast(HttpServletRequest request
            , HttpServletResponse response) throws ServletException, IOException {
        
        WeatherForecastService forecastService = new WeatherForecastService();
        request.setAttribute("forecastData"
            , forecastService.getForecastFor(Constants.DEFAULT_WEATHER_ZIP_CODE));
        
    }
    
    private void getStockQuotes(HttpServletRequest request
            , HttpServletResponse response) throws ServletException, IOException {

        GetQuotesResponse quotesResponse = 
                new StockQuoteService()
                    .getStockQuotesFor(Constants.DEFAULT_STOCK_TICKERS);
        
        Quote[] quotesArray = quotesResponse.getGetQuotesResult().getQuote();
        
        request.setAttribute("quotesArray", quotesArray);
    }
    
    private void getNewsItems(HttpServletRequest request
            , HttpServletResponse response) throws ServletException, IOException {
        
        Collection newsItems = new NewsService().getNewsItems();
        
        request.setAttribute("newsItems", newsItems);
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
