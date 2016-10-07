package ajaxbook.chap4;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.*;
import javax.servlet.http.*;

public class YahooSearchGatewayServlet extends HttpServlet {
    private static final String YAHOO_SEARCH_URL = 
        "http://api.search.yahoo.com/WebSearchService/V1/webSearch?appid=thunderboltsoftware"
        + "&type=all";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        String url = YAHOO_SEARCH_URL + "&" + request.getQueryString();
        
        HttpURLConnection con = (HttpURLConnection)new URL(url).openConnection();
        con.setDoInput(true);
        con.setDoOutput(true);
        
        con.setRequestMethod("GET");
        
        //Send back the response to the browser
        response.setStatus(con.getResponseCode());
        response.setContentType("text/xml");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String input = null;
        OutputStream responseOutput = response.getOutputStream();
        
        while((input = reader.readLine()) != null) {
            responseOutput.write(input.getBytes());
        }
    
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
}
