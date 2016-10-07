package ajaxbook.chap4;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.*;
import javax.servlet.http.*;

public class ValidationServlet extends HttpServlet {    
    
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        boolean passed = validateDate(request.getParameter("birthDate"));
        response.setContentType("text/xml");
        response.setHeader("Cache-Control", "no-cache");
        String message = "You have entered an invalid date.";
        
        if (passed) {
            message = "You have entered a valid date.";
        }
        out.println("<response>");
        out.println("<passed>" + Boolean.toString(passed) + "</passed>");
        out.println("<message>" + message + "</message>");
        out.println("</response>");
        out.close();
     }
    
    /**
     * Checks to see whether the argument is a valid date.
     * A null date is considered invalid. This method
     * used the default data formatter and lenient
     * parsing.
     *
     * @param date a String representing the date to check
     * @return message a String represnting the outcome of the check
     */
    private boolean validateDate(String date) {
        
        boolean isValid = true;
        if(date != null) {
            SimpleDateFormat formatter= new SimpleDateFormat("MM/dd/yyyy");
            try {
                formatter.parse(date); 
            } catch (ParseException pe) {
                System.out.println(pe.toString());
                isValid = false;
            }
        } else {
            isValid = false;
        }
        return isValid;
    }
}
