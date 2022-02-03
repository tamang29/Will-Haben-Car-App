
package v2.vzdm.app.Models.Car;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Promotion {

    @SerializedName("maxDeliveryCount")
    @Expose
    private Integer maxDeliveryCount;
    @SerializedName("deliveryCount")
    @Expose
    private Integer deliveryCount;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("organisationName")
    @Expose
    private String organisationName;
    @SerializedName("organisationUrl")
    @Expose
    private Object organisationUrl;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private Object url;
    @SerializedName("countPixelUrl")
    @Expose
    private String countPixelUrl;
    @SerializedName("countPixelUrlNoScript")
    @Expose
    private String countPixelUrlNoScript;
    @SerializedName("serviceBoxCountPixel")
    @Expose
    private String serviceBoxCountPixel;
    @SerializedName("detailLinkText")
    @Expose
    private String detailLinkText;
    @SerializedName("detailLink")
    @Expose
    private String detailLink;
    @SerializedName("landingTitle")
    @Expose
    private String landingTitle;
    @SerializedName("landingText")
    @Expose
    private String landingText;
    @SerializedName("landingLogo")
    @Expose
    private String landingLogo;
    @SerializedName("landingLinkText1")
    @Expose
    private String landingLinkText1;
    @SerializedName("landingLink1")
    @Expose
    private String landingLink1;
    @SerializedName("landingLinkText2")
    @Expose
    private Object landingLinkText2;
    @SerializedName("landingLink2")
    @Expose
    private Object landingLink2;
    @SerializedName("landingLinkText3")
    @Expose
    private Object landingLinkText3;
    @SerializedName("landingLink3")
    @Expose
    private Object landingLink3;
    @SerializedName("landingRetargetingScript")
    @Expose
    private Object landingRetargetingScript;
    @SerializedName("groupId")
    @Expose
    private Integer groupId;

    public Integer getMaxDeliveryCount() {
        return maxDeliveryCount;
    }

    public void setMaxDeliveryCount(Integer maxDeliveryCount) {
        this.maxDeliveryCount = maxDeliveryCount;
    }

    public Integer getDeliveryCount() {
        return deliveryCount;
    }

    public void setDeliveryCount(Integer deliveryCount) {
        this.deliveryCount = deliveryCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    public Object getOrganisationUrl() {
        return organisationUrl;
    }

    public void setOrganisationUrl(Object organisationUrl) {
        this.organisationUrl = organisationUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }

    public String getCountPixelUrl() {
        return countPixelUrl;
    }

    public void setCountPixelUrl(String countPixelUrl) {
        this.countPixelUrl = countPixelUrl;
    }

    public String getCountPixelUrlNoScript() {
        return countPixelUrlNoScript;
    }

    public void setCountPixelUrlNoScript(String countPixelUrlNoScript) {
        this.countPixelUrlNoScript = countPixelUrlNoScript;
    }

    public String getServiceBoxCountPixel() {
        return serviceBoxCountPixel;
    }

    public void setServiceBoxCountPixel(String serviceBoxCountPixel) {
        this.serviceBoxCountPixel = serviceBoxCountPixel;
    }

    public String getDetailLinkText() {
        return detailLinkText;
    }

    public void setDetailLinkText(String detailLinkText) {
        this.detailLinkText = detailLinkText;
    }

    public String getDetailLink() {
        return detailLink;
    }

    public void setDetailLink(String detailLink) {
        this.detailLink = detailLink;
    }

    public String getLandingTitle() {
        return landingTitle;
    }

    public void setLandingTitle(String landingTitle) {
        this.landingTitle = landingTitle;
    }

    public String getLandingText() {
        return landingText;
    }

    public void setLandingText(String landingText) {
        this.landingText = landingText;
    }

    public String getLandingLogo() {
        return landingLogo;
    }

    public void setLandingLogo(String landingLogo) {
        this.landingLogo = landingLogo;
    }

    public String getLandingLinkText1() {
        return landingLinkText1;
    }

    public void setLandingLinkText1(String landingLinkText1) {
        this.landingLinkText1 = landingLinkText1;
    }

    public String getLandingLink1() {
        return landingLink1;
    }

    public void setLandingLink1(String landingLink1) {
        this.landingLink1 = landingLink1;
    }

    public Object getLandingLinkText2() {
        return landingLinkText2;
    }

    public void setLandingLinkText2(Object landingLinkText2) {
        this.landingLinkText2 = landingLinkText2;
    }

    public Object getLandingLink2() {
        return landingLink2;
    }

    public void setLandingLink2(Object landingLink2) {
        this.landingLink2 = landingLink2;
    }

    public Object getLandingLinkText3() {
        return landingLinkText3;
    }

    public void setLandingLinkText3(Object landingLinkText3) {
        this.landingLinkText3 = landingLinkText3;
    }

    public Object getLandingLink3() {
        return landingLink3;
    }

    public void setLandingLink3(Object landingLink3) {
        this.landingLink3 = landingLink3;
    }

    public Object getLandingRetargetingScript() {
        return landingRetargetingScript;
    }

    public void setLandingRetargetingScript(Object landingRetargetingScript) {
        this.landingRetargetingScript = landingRetargetingScript;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

}
