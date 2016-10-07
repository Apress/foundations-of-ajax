package ajaxdashboard.domain;

public class SearchResult {
    private String title = "";
    private String url = "";
    private String summary = "";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title.replaceAll("&", "&amp;");
        this.title = this.title.replaceAll("\"", "'");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url.replaceAll("&", "&amp;");
        this.url = this.url.replaceAll("\"", "&quot;");
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary.replaceAll("&", "&amp;");
        this.summary = this.summary.replaceAll("\"", "&quot;");
    }
    
    public String toString() {
        StringBuffer buf = new StringBuffer();
        buf.append("Title: " + title)
            .append("\nURL: " + url)
            .append("\nSummary: " + summary);
        
        return buf.toString();
    }
}
