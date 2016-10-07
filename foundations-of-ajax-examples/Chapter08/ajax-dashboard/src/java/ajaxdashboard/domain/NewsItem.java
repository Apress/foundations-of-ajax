
package ajaxdashboard.domain;

public class NewsItem {

    private String guid;
    private String title;
    private String link;
    private String description;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String toString() {
        StringBuffer buf = new StringBuffer();
        buf.append("Guid: ")
            .append(guid)
            .append("\nnTitle: ")
            .append(title)
            .append("\nLink: ")
            .append(link)
            .append("\nDescription: ")
            .append(description);
        
        return buf.toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
