/*
 * DynamicUpdateServlet.java
 *
 * Created on June 26, 2005, 2:39 PM
 */

package ajaxbook.chap4;

import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author nate
 * @version
 */
public class DynamicUpdateServlet extends HttpServlet {
    private int counter = 1;
    
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String res = "";
        String task = request.getParameter("task");
        String message = "";        
        
        if (task.equals("reset")) {
            counter = 1;
        } else {
            switch (counter) {
                case 1: message = "Steve walks on stage"; break;
                case 2: message = "iPods rock"; break;
                case 3: message = "Steve says Macs rule"; break;
                case 4: message = "Change is coming"; break;
                case 5: message = "Yes, OS X runs on Intel - has for years"; break;
                case 6: message = "Macs will soon have Intel chips"; break;
                case 7: message = "done"; break;
            }
            counter++;
        }

        res = "<message>" + message + "</message>";
        
        PrintWriter out = response.getWriter();
        response.setContentType("text/xml");
        response.setHeader("Cache-Control", "no-cache");
        out.println("<response>");
        out.println(res);
        out.println("</response>");
        out.close();
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        doGet(request, response);
    }
    

    /** Returns a short description of the servlet.
     */
    public String getServletInfo() {
        return "Short description";
    }
}
