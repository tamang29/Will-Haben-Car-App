
package v2.vzdm.app.Models.Car;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class SeoMetaData {

    @SerializedName("canonicalUrl")
    @Expose
    private String canonicalUrl;
    @SerializedName("alternateUrl")
    @Expose
    private String alternateUrl;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("keywords")
    @Expose
    private String keywords;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("linkGroups")
    @Expose
    private List<LinkGroup> linkGroups = null;
    @SerializedName("orgId")
    @Expose
    private Object orgId;

    public String getCanonicalUrl() {
        return canonicalUrl;
    }

    public void setCanonicalUrl(String canonicalUrl) {
        this.canonicalUrl = canonicalUrl;
    }

    public String getAlternateUrl() {
        return alternateUrl;
    }

    public void setAlternateUrl(String alternateUrl) {
        this.alternateUrl = alternateUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<LinkGroup> getLinkGroups() {
        return linkGroups;
    }

    public void setLinkGroups(List<LinkGroup> linkGroups) {
        this.linkGroups = linkGroups;
    }

    public Object getOrgId() {
        return orgId;
    }

    public void setOrgId(Object orgId) {
        this.orgId = orgId;
    }

}
