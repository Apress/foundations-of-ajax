package ajaxbook.chap3;

import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetAndPostExample extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response, String method)
    throws ServletException, IOException {
        
        //Set content type of the response to text/xml
        response.setContentType("text/xml");
        
        //Get the user's input
        String firstName = request.getParameter("firstName");
        String middleName = request.getParameter("middleName");
        String birthday = request.getParameter("birthday");
        
        //Create the response text
        String responseText = "Hello " + firstName + " " + middleName
                + ". Your birthday is " + birthday + "."
                + " [Method: " + method + "]";
        
        //Write the response back to the browser
        PrintWriter out = response.getWriter();
        out.println(responseText);

        //Close the writer
        out.close();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        //Process the request in method processRequest
        processRequest(request, response, "GET");
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        //Process the request in method processRequest
        processRequest(request, response, "POST");
    }
}
