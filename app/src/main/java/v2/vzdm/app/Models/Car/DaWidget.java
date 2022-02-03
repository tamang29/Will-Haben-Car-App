
package v2.vzdm.app.Models.Car;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class DaWidget {

    @SerializedName("headline1")
    @Expose
    private String headline1;
    @SerializedName("headline2")
    @Expose
    private String headline2;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("buttonText")
    @Expose
    private String buttonText;
    @SerializedName("logoText")
    @Expose
    private String logoText;
    @SerializedName("widgetTypeId")
    @Expose
    private Integer widgetTypeId;
    @SerializedName("countPixel")
    @Expose
    private String countPixel;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("logoSvg")
    @Expose
    private String logoSvg;
    @SerializedName("organisationName")
    @Expose
    private String organisationName;

    public String getHeadline1() {
        return headline1;
    }

    public void setHeadline1(String headline1) {
        this.headline1 = headline1;
    }

    public String getHeadline2() {
        return headline2;
    }

    public void setHeadline2(String headline2) {
        this.headline2 = headline2;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public String getLogoText() {
        return logoText;
    }

    public void setLogoText(String logoText) {
        this.logoText = logoText;
    }

    public Integer getWidgetTypeId() {
        return widgetTypeId;
    }

    public void setWidgetTypeId(Integer widgetTypeId) {
        this.widgetTypeId = widgetTypeId;
    }

    public String getCountPixel() {
        return countPixel;
    }

    public void setCountPixel(String countPixel) {
        this.countPixel = countPixel;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogoSvg() {
        return logoSvg;
    }

    public void setLogoSvg(String logoSvg) {
        this.logoSvg = logoSvg;
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

}
