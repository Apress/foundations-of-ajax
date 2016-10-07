/*
 * ToolTipServlet.java
 *
 * Created on June 30, 2005, 8:29 PM
 */

package ajaxbook.chap4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author nate
 * @version
 */
public class ToolTipServlet extends HttpServlet {
    
    private Map courses = new HashMap();

    public void init(ServletConfig config) throws ServletException {
        CourseData augusta = new CourseData(72, 7290);
        CourseData pinehurst = new CourseData(70, 7214);
        CourseData standrews = new CourseData(72, 6566);
        CourseData baltusrol = new CourseData(70, 7392);
        courses.put(new Integer(1), augusta);
        courses.put(new Integer(2), pinehurst);
        courses.put(new Integer(3), standrews);
        courses.put(new Integer(4), baltusrol);
    }
    
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        Integer key = Integer.valueOf(request.getParameter("key"));
        CourseData data = (CourseData) courses.get(key);
        
        PrintWriter out = response.getWriter();

        response.setContentType("text/xml");
        response.setHeader("Cache-Control", "no-cache");

        out.println("<response>");
        out.println("<par>" + data.getPar() + "</par>");
        out.println("<length>" + data.getLength() + "</length>");
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
    
    private class CourseData {
        private int par;
        private int length;
        
        public CourseData(int par, int length) {
            this.par = par;
            this.length = length;
        }
        
        public int getPar() {
            return this.par;
        }
        
        public int getLength() {
            return this.length;
        }
    }
}