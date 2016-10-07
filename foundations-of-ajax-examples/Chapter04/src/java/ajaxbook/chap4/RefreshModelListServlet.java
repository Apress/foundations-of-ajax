package ajaxbook.chap4;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

public class RefreshModelListServlet extends HttpServlet {

    private static List availableModels = new ArrayList();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        int modelYear = Integer.parseInt(request.getParameter("modelYear"));
        String make = request.getParameter("make");
        
        StringBuffer results = new StringBuffer("<models>");
        MakeModelYear availableModel = null;
        for(Iterator it = availableModels.iterator(); it.hasNext();) {
            availableModel = (MakeModelYear)it.next();
            if(availableModel.modelYear == modelYear) {
                if(availableModel.make.equals(make)) {
                    results.append("<model>");
                    results.append(availableModel.model);
                    results.append("</model>");
                }
            }
        }
        results.append("</models>");
        
        response.setContentType("text/xml");
        response.getWriter().write(results.toString());
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    
    public void init() throws ServletException {
        availableModels.add(new MakeModelYear(2006, "Dodge", "Charger"));
        availableModels.add(new MakeModelYear(2006, "Dodge", "Magnum"));
        availableModels.add(new MakeModelYear(2006, "Dodge", "Ram"));
        availableModels.add(new MakeModelYear(2006, "Dodge", "Viper"));
        availableModels.add(new MakeModelYear(1995, "Dodge", "Avenger"));
        availableModels.add(new MakeModelYear(1995, "Dodge", "Intrepid"));
        availableModels.add(new MakeModelYear(1995, "Dodge", "Neon"));
        availableModels.add(new MakeModelYear(1995, "Dodge", "Spirit"));
        availableModels.add(new MakeModelYear(1985, "Dodge", "Aries"));
        availableModels.add(new MakeModelYear(1985, "Dodge", "Daytona"));
        availableModels.add(new MakeModelYear(1985, "Dodge", "Diplomat"));
        availableModels.add(new MakeModelYear(1985, "Dodge", "Omni"));
        availableModels.add(new MakeModelYear(1970, "Dodge", "Challenger"));
        availableModels.add(new MakeModelYear(1970, "Dodge", "Charger"));
        availableModels.add(new MakeModelYear(1970, "Dodge", "Coronet"));
        availableModels.add(new MakeModelYear(1970, "Dodge", "Dart"));

        availableModels.add(new MakeModelYear(2006, "Chevrolet", "Colorado"));
        availableModels.add(new MakeModelYear(2006, "Chevrolet", "Corvette"));
        availableModels.add(new MakeModelYear(2006, "Chevrolet", "Equinox"));
        availableModels.add(new MakeModelYear(2006, "Chevrolet", "Monte Carlo"));
        availableModels.add(new MakeModelYear(1995, "Chevrolet", "Beretta"));
        availableModels.add(new MakeModelYear(1995, "Chevrolet", "Camaro"));
        availableModels.add(new MakeModelYear(1995, "Chevrolet", "Cavalier"));
        availableModels.add(new MakeModelYear(1995, "Chevrolet", "Lumina"));
        availableModels.add(new MakeModelYear(1985, "Chevrolet", "Cavalier"));
        availableModels.add(new MakeModelYear(1985, "Chevrolet", "Chevette"));
        availableModels.add(new MakeModelYear(1985, "Chevrolet", "Celebrity"));
        availableModels.add(new MakeModelYear(1985, "Chevrolet", "Citation II"));
        availableModels.add(new MakeModelYear(1970, "Chevrolet", "Bel Air"));
        availableModels.add(new MakeModelYear(1970, "Chevrolet", "Caprice"));
        availableModels.add(new MakeModelYear(1970, "Chevrolet", "Chevelle"));
        availableModels.add(new MakeModelYear(1970, "Chevrolet", "Monte Carlo"));

        availableModels.add(new MakeModelYear(2006, "Pontiac", "G6"));
        availableModels.add(new MakeModelYear(2006, "Pontiac", "Grand Prix"));
        availableModels.add(new MakeModelYear(2006, "Pontiac", "Solstice"));
        availableModels.add(new MakeModelYear(2006, "Pontiac", "Vibe"));
        availableModels.add(new MakeModelYear(1995, "Pontiac", "Bonneville"));
        availableModels.add(new MakeModelYear(1995, "Pontiac", "Grand Am"));
        availableModels.add(new MakeModelYear(1995, "Pontiac", "Grand Prix"));
        availableModels.add(new MakeModelYear(1995, "Pontiac", "Firebird"));
        availableModels.add(new MakeModelYear(1985, "Pontiac", "6000"));
        availableModels.add(new MakeModelYear(1985, "Pontiac", "Fiero"));
        availableModels.add(new MakeModelYear(1985, "Pontiac", "Grand Prix"));
        availableModels.add(new MakeModelYear(1985, "Pontiac", "Parisienne"));
        availableModels.add(new MakeModelYear(1970, "Pontiac", "Catalina"));
        availableModels.add(new MakeModelYear(1970, "Pontiac", "GTO"));
        availableModels.add(new MakeModelYear(1970, "Pontiac", "LeMans"));
        availableModels.add(new MakeModelYear(1970, "Pontiac", "Tempest"));
    }

    private static class MakeModelYear {
        private int modelYear;
        private String make;
        private String model;
        
        public MakeModelYear(int modelYear, String make, String model) {
            this.modelYear = modelYear;
            this.make = make;
            this.model = model;
        }
    }
}
