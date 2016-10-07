package ajaxbook.chap3;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class PostingXMLExample extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        String xml = readXMLFromRequestBody(request);
        Document xmlDoc = null;
        try {
            xmlDoc = 
                    DocumentBuilderFactory.newInstance().newDocumentBuilder()
                    .parse(new ByteArrayInputStream(xml.getBytes()));
        }
        catch(ParserConfigurationException e) {
            System.out.println("ParserConfigurationException: " + e);
        }
        catch(SAXException e) {
            System.out.println("SAXException: " + e);
        }

        /* Note how the Java implementation of the W3C DOM has the same methods
         * as the JavaScript implementation, such as getElementsByTagName and 
         * getNodeValue.
         */
        NodeList selectedPetTypes = xmlDoc.getElementsByTagName("type");
        String type = null;
        String responseText = "Selected Pets: ";
        for(int i = 0; i < selectedPetTypes.getLength(); i++) {
           type = selectedPetTypes.item(i).getFirstChild().getNodeValue();
           responseText = responseText + " " + type;
        }
        
        response.setContentType("text/xml");
        response.getWriter().print(responseText);
    }
    
    private String readXMLFromRequestBody(HttpServletRequest request){
        StringBuffer xml = new StringBuffer();
        String line = null;
        try {
            BufferedReader reader = request.getReader();
            while((line = reader.readLine()) != null) {
                xml.append(line);
            }
        }
        catch(Exception e) {
            System.out.println("Error reading XML: " + e.toString());
        }
        return xml.toString();
    }
}
