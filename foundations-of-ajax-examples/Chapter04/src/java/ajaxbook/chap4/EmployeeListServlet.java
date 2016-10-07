package ajaxbook.chap4;

import java.io.*;
import java.net.*;
import java.util.Random;

import javax.servlet.*;
import javax.servlet.http.*;

public class EmployeeListServlet extends HttpServlet {
    
    protected void addEmployee(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        //Store the object in the database
        String uniqueID = storeEmployee();
        
        //Create the response XML
        StringBuffer xml = new StringBuffer("<result><uniqueID>");
        xml.append(uniqueID);
        xml.append("</uniqueID>");
        xml.append("<status>1</status>");
        xml.append("</result>");
        
        //Send the response back to the browser
        sendResponse(response, xml.toString());
    }
    
    protected void deleteEmployee(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        String id = request.getParameter("id");
        /* Assume that a call is made to delete the employee from the database */
        
        //Create the response XML
        StringBuffer xml = new StringBuffer("<result>");
        xml.append("<status>1</status>");
        xml.append("</result>");
        
        //Send the response back to the browser
        sendResponse(response, xml.toString());
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action.equals("add")) {
            addEmployee(request, response);
        }
        else if(action.equals("delete")) {
            deleteEmployee(request, response);
        }
    }
    
    private String storeEmployee() {
        /* Assume that the employee is saved to a database and the
         * database creates a unique ID. Return the unique ID to the 
         * calling method. In this case, make up a unique ID.
         */
        String uniqueID = "";
        Random randomizer = new Random(System.currentTimeMillis());
        for(int i = 0; i < 8; i++) {
            uniqueID += randomizer.nextInt(9);
        }
        
        return uniqueID;
    }
    
    private void sendResponse(HttpServletResponse response, String responseText) 
    throws IOException {
        response.setContentType("text/xml");
        response.getWriter().write(responseText);
    }
}
