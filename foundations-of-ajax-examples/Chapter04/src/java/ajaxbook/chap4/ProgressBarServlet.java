/*
 * ProgressBar.java
 *
 * Created on June 20, 2005, 7:11 PM
 */

package ajaxbook.chap4;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author nate
 * @version
 */
public class ProgressBarServlet extends HttpServlet {
    private int counter = 1;
    
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String task = request.getParameter("task");
        String res = "";
        
        if (task.equals("create")) {
            res = "<key>1</key>";
            counter = 1;
        }
        else {
            String percent = "";
            switch (counter) {
                case 1: percent = "10"; break;
                case 2: percent = "23"; break;
                case 3: percent = "35"; break;
                case 4: percent = "51"; break;
                case 5: percent = "64"; break;
                case 6: percent = "73"; break;
                case 7: percent = "89"; break;
                case 8: percent = "100"; break;
            }
            counter++;
                
            res = "<percent>" + percent + "</percent>";
        }
        
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
