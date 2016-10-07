package ajaxdashboard.servlet;

import ajaxdashboard.domain.NewsItem;
import ajaxdashboard.service.NewsService;
import java.io.*;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.*;
import javax.servlet.http.*;

public class UpdateNewsItemsServlet extends HttpServlet {
    private static final String AJAX_CONTENT = "/jsp/news/newsItemsAjax.jsp";
    
    protected void processRequest(HttpServletRequest request
                                            , HttpServletResponse response)
                                            throws ServletException, IOException {

        Collection newsItems = new NewsService().getNewsItems();
        
        cleanLinks(newsItems);
        
        request.setAttribute("newsItems", newsItems);
        
        System.out.println("\n\n========\nUpdating news items at: " 
                                                        + new Date().toString());
        
        request.getRequestDispatcher(AJAX_CONTENT).forward(request, response);
    }
    
    private void cleanLinks(Collection newsItems) {
        NewsItem newsItem = null;
        for(Iterator it = newsItems.iterator(); it.hasNext();) {
            newsItem = (NewsItem)it.next();
            newsItem.setLink(newsItem.getLink().replaceAll("&", "&amp;"));
//            System.out.println("Link: " + newsItem.getLink());
        }
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
