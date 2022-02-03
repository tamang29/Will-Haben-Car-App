
package v2.vzdm.app.Models.Car;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Vertical {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("nrOfAdverts")
    @Expose
    private Integer nrOfAdverts;
    @SerializedName("selfLink")
    @Expose
    private String selfLink;
    @SerializedName("searchConfigLink")
    @Expose
    private String searchConfigLink;
    @SerializedName("startPageLink")
    @Expose
    private String startPageLink;
    @SerializedName("taggingData")
    @Expose
    private TaggingData__1 taggingData;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNrOfAdverts() {
        return nrOfAdverts;
    }

    public void setNrOfAdverts(Integer nrOfAdverts) {
        this.nrOfAdverts = nrOfAdverts;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public String getSearchConfigLink() {
        return searchConfigLink;
    }

    public void setSearchConfigLink(String searchConfigLink) {
        this.searchConfigLink = searchConfigLink;
    }

    public String getStartPageLink() {
        return startPageLink;
    }

    public void setStartPageLink(String startPageLink) {
        this.startPageLink = startPageLink;
    }

    public TaggingData__1 getTaggingData() {
        return taggingData;
    }

    public void setTaggingData(TaggingData__1 taggingData) {
        this.taggingData = taggingData;
    }

}
