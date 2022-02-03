
package v2.vzdm.app.Models.Car;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class GroupData {

    @SerializedName("landingTitle")
    @Expose
    private String landingTitle;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("sort")
    @Expose
    private Integer sort;
    @SerializedName("landingPageCountPixel")
    @Expose
    private String landingPageCountPixel;
    @SerializedName("detailHeading")
    @Expose
    private String detailHeading;
    @SerializedName("landingLinkText")
    @Expose
    private String landingLinkText;
    @SerializedName("landingPageHeading")
    @Expose
    private String landingPageHeading;
    @SerializedName("landingPageText")
    @Expose
    private String landingPageText;
    @SerializedName("hasImageIcon")
    @Expose
    private Boolean hasImageIcon;
    @SerializedName("textLinkWidgetType")
    @Expose
    private String textLinkWidgetType;
    @SerializedName("dmpTextlinkDescription")
    @Expose
    private String dmpTextlinkDescription;

    public String getLandingTitle() {
        return landingTitle;
    }

    public void setLandingTitle(String landingTitle) {
        this.landingTitle = landingTitle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getLandingPageCountPixel() {
        return landingPageCountPixel;
    }

    public void setLandingPageCountPixel(String landingPageCountPixel) {
        this.landingPageCountPixel = landingPageCountPixel;
    }

    public String getDetailHeading() {
        return detailHeading;
    }

    public void setDetailHeading(String detailHeading) {
        this.detailHeading = detailHeading;
    }

    public String getLandingLinkText() {
        return landingLinkText;
    }

    public void setLandingLinkText(String landingLinkText) {
        this.landingLinkText = landingLinkText;
    }

    public String getLandingPageHeading() {
        return landingPageHeading;
    }

    public void setLandingPageHeading(String landingPageHeading) {
        this.landingPageHeading = landingPageHeading;
    }

    public String getLandingPageText() {
        return landingPageText;
    }

    public void setLandingPageText(String landingPageText) {
        this.landingPageText = landingPageText;
    }

    public Boolean getHasImageIcon() {
        return hasImageIcon;
    }

    public void setHasImageIcon(Boolean hasImageIcon) {
        this.hasImageIcon = hasImageIcon;
    }

    public String getTextLinkWidgetType() {
        return textLinkWidgetType;
    }

    public void setTextLinkWidgetType(String textLinkWidgetType) {
        this.textLinkWidgetType = textLinkWidgetType;
    }

    public String getDmpTextlinkDescription() {
        return dmpTextlinkDescription;
    }

    public void setDmpTextlinkDescription(String dmpTextlinkDescription) {
        this.dmpTextlinkDescription = dmpTextlinkDescription;
    }

}
