package ajaxbook.chap3;

import java.io.*;
import java.net.*;
import java.text.ParseException;
import javax.servlet.*;
import javax.servlet.http.*;
import org.json.JSONObject;

public class JSONExample extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String json = readJSONStringFromRequestBody(request);
        
        //Use the JSON-Java binding library to create a JSON object in Java
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(json);
        }
        catch(ParseException pe) {
            System.out.println("ParseException: " + pe.toString());
        }
        
        String responseText = "You have a " + jsonObject.getInt("year") + " "
            + jsonObject.getString("make") + " " + jsonObject.getString("model")
            + " " + " that is " + jsonObject.getString("color") + " in color.";
        
        response.setContentType("text/xml");
        response.getWriter().print(responseText);
    }

    private String readJSONStringFromRequestBody(HttpServletRequest request){
        StringBuffer json = new StringBuffer();
        String line = null;
        try {
            BufferedReader reader = request.getReader();
            while((line = reader.readLine()) != null) {
                json.append(line);
            }
        }
        catch(Exception e) {
            System.out.println("Error reading JSON string: " + e.toString());
        }
        return json.toString();
    }
}
