package ajaxdashboard.service;
import ajaxdashboard.domain.NewsItem;
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
import org.jdom.input.SAXBuilder;



public class NewsService {
    private static final String NEWS_URL =
            "http://rss.news.yahoo.com/rss/topstories";
    
    
    public Collection getNewsItems() {
        Document newsXML = getNewsItemsXML();
        return parseNewsItems(newsXML);
    }
    
    private InputStream getNewsServiceInputStream() {
        InputStream newsInputStream = null;
        
        try {
            HttpURLConnection con =
                    (HttpURLConnection)new URL(NEWS_URL).openConnection();
            con.setDoInput(true);
            con.setDoOutput(true);

            con.setRequestMethod("GET");
            
            newsInputStream = con.getInputStream();
        }
        catch(Exception e) {
            System.out.println("Exception retrieving news: " + e.toString());
        }
        
        return newsInputStream;
        
    }
    
    private Document getNewsItemsXML() {
        SAXBuilder builder = new SAXBuilder();
        
        InputStream newsInputStream = getNewsServiceInputStream();
        
        Document news = null;
        
        try {
            news = builder.build(newsInputStream);
        } 
        catch (JDOMException ex) {
            System.out.println("Error: " + ex);
        } 
        catch (IOException ex) {
            System.out.println("Error: ");
        }
        
        return news;
        
    }
    
    private Collection parseNewsItems(Document news) {
        Collection newsItems = new ArrayList();
        
        Element root = news.getRootElement();
        
        List items = root.getChild("channel").getChildren("item");
        Element item = null;
        NewsItem newsItem = null;
        for(Iterator it = items.iterator(); it.hasNext();) {
            item = (Element)it.next();
            
            newsItem = new NewsItem();
            newsItem.setGuid(item.getChildText("guid"));
            newsItem.setTitle(item.getChildText("title"));
            newsItem.setLink(item.getChildText("link"));
            newsItem.setDescription(item.getChildText("description"));
            
            newsItems.add(newsItem);
        }
        
        return newsItems;
    }
    
}
