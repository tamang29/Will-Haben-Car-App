
package v2.vzdm.app.Models.Car;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class OrganisationDetails {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("uuid")
    @Expose
    private String uuid;
    @SerializedName("partnerId")
    @Expose
    private String partnerId;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("organisationDetailLinkList")
    @Expose
    private OrganisationDetailLinkList organisationDetailLinkList;
    @SerializedName("orgName")
    @Expose
    private Object orgName;
    @SerializedName("orgPhone")
    @Expose
    private Object orgPhone;
    @SerializedName("orgEmail")
    @Expose
    private Object orgEmail;
    @SerializedName("orgLogoUrl")
    @Expose
    private Object orgLogoUrl;
    @SerializedName("addressLines")
    @Expose
    private AddressLines addressLines;
    @SerializedName("postCode")
    @Expose
    private Object postCode;
    @SerializedName("country")
    @Expose
    private Object country;
    @SerializedName("countryId")
    @Expose
    private Integer countryId;
    @SerializedName("openingHours")
    @Expose
    private OpeningHours openingHours;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OrganisationDetailLinkList getOrganisationDetailLinkList() {
        return organisationDetailLinkList;
    }

    public void setOrganisationDetailLinkList(OrganisationDetailLinkList organisationDetailLinkList) {
        this.organisationDetailLinkList = organisationDetailLinkList;
    }

    public Object getOrgName() {
        return orgName;
    }

    public void setOrgName(Object orgName) {
        this.orgName = orgName;
    }

    public Object getOrgPhone() {
        return orgPhone;
    }

    public void setOrgPhone(Object orgPhone) {
        this.orgPhone = orgPhone;
    }

    public Object getOrgEmail() {
        return orgEmail;
    }

    public void setOrgEmail(Object orgEmail) {
        this.orgEmail = orgEmail;
    }

    public Object getOrgLogoUrl() {
        return orgLogoUrl;
    }

    public void setOrgLogoUrl(Object orgLogoUrl) {
        this.orgLogoUrl = orgLogoUrl;
    }

    public AddressLines getAddressLines() {
        return addressLines;
    }

    public void setAddressLines(AddressLines addressLines) {
        this.addressLines = addressLines;
    }

    public Object getPostCode() {
        return postCode;
    }

    public void setPostCode(Object postCode) {
        this.postCode = postCode;
    }

    public Object getCountry() {
        return country;
    }

    public void setCountry(Object country) {
        this.country = country;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public OpeningHours getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(OpeningHours openingHours) {
        this.openingHours = openingHours;
    }

}
