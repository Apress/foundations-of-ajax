/*
 * AutoCompleteServlet.java
 *
 * Created on June 20, 2005, 7:24 PM
 */

package ajaxbook.chap4;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author nate
 * @version
 */
public class AutoCompleteServlet extends HttpServlet {

    private List names = new ArrayList();

    public void init(ServletConfig config) throws ServletException {
        names.add("Abe");
        names.add("Abel");
        names.add("Abigail");
        names.add("Abner");
        names.add("Abraham");
        names.add("Marcus");
        names.add("Marcy");
        names.add("Marge");
        names.add("Marie");
    }
    
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String prefix = request.getParameter("names");
        NameService service = NameService.getInstance(names);
        List matching = service.findNames(prefix);

        if (matching.size() > 0) {
            PrintWriter out = response.getWriter();

            response.setContentType("text/xml");
            response.setHeader("Cache-Control", "no-cache");

            out.println("<response>");
            Iterator iter = matching.iterator();
            while(iter.hasNext()) {
                String name = (String) iter.next();
                out.println("<name>" + name + "</name>");
            }
            out.println("</response>");
            matching = null;
            service = null;
            out.close();
        } else {
            response.setStatus(HttpServletResponse.SC_NO_CONTENT);
            //response.flushBuffer();
        }

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
