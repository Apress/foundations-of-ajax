
package ajaxdashboard.service;
import ajaxdashboard.domain.SearchResult;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;

/**
 *
 * @author Owner
 */
public class SearchService {
    private static final String YAHOO_SEARCH_URL = 
        "http://api.search.yahoo.com/WebSearchService/V1/webSearch" 
            + "?appid=thunderboltsoftware"
            + "&type=all"
            + "&results=10"
            + "&query=";

    private InputStream getResultsInputStream(String searchTerm) throws Exception {
        String url = YAHOO_SEARCH_URL + searchTerm;
        System.out.println("url: " + url);
        HttpURLConnection con = (HttpURLConnection)new URL(url).openConnection();
        con.setDoInput(true);
        con.setDoOutput(true);
        
        con.setRequestMethod("GET");
        
        return con.getInputStream();
    }
    
    public Collection search(String searchTerm) {
        Document resultsXML = getSearchResultsXML(searchTerm);
        return parseResults(resultsXML);
    }
    
    private Document getSearchResultsXML(String searchTerm) {
        SAXBuilder builder = new SAXBuilder();
        Document news = null;
        
        try {
            InputStream searchResultsInputStream = getResultsInputStream(searchTerm);
            news = builder.build(searchResultsInputStream);
        } 
        catch (JDOMException ex) {
            System.out.println("Error: " + ex.toString());
        } 
        catch (IOException ex) {
            System.out.println("Error: " + ex.toString());
        }
        catch(Exception ex) {
            System.out.println("Exception: " + ex.toString());
        }
        
        return news;
        
    }
    
    private Collection parseResults(Document results) {
        Collection searchResults = new ArrayList();
        Namespace ns = Namespace.getNamespace("urn:yahoo:srch");
        
        Element root = results.getRootElement();
        
        List items = root.getChildren("Result", ns);
        System.out.println("res size: " + items.size());
        Element item = null;
        SearchResult result = null;
        for(Iterator it = items.iterator(); it.hasNext();) {
            item = (Element)it.next();
            result = new SearchResult();

            result.setTitle(item.getChildText("Title", ns));
            result.setSummary(item.getChildText("Summary", ns));
            result.setUrl(item.getChildText("Url", ns));
            searchResults.add(result);
        }
        
        return searchResults;
    }
    
}
 