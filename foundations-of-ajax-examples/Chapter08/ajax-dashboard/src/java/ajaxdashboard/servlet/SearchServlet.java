package ajaxdashboard.servlet;

import ajaxdashboard.domain.SearchResult;
import ajaxdashboard.service.SearchService;
import java.io.*;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.*;
import javax.servlet.http.*;

public class SearchServlet extends HttpServlet {
    private static final String AJAX_JSP = "/jsp/search/searchAutocomplete.jsp";
    
    protected void processRequest(HttpServletRequest request
                                            , HttpServletResponse response)
                                            throws ServletException, IOException {
        String searchTerm = request.getParameter("searchTerm");
        System.out.println("\n\n\n==========Searching: " + searchTerm);
        SearchService searchService = new SearchService();
        Collection results = searchService.search(searchTerm);
        
//        for(Iterator it = results.iterator(); it.hasNext();) {
//            System.out.println(((SearchResult)it.next()).toString());
//        }
        
        request.setAttribute("results", results);
        request.getRequestDispatcher(AJAX_JSP).forward(request, response);
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
