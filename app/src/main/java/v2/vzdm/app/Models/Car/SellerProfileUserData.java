
package v2.vzdm.app.Models.Car;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class SellerProfileUserData {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("registerDate")
    @Expose
    private String registerDate;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("street")
    @Expose
    private Object street;
    @SerializedName("district")
    @Expose
    private Object district;
    @SerializedName("orgUUID")
    @Expose
    private Object orgUUID;
    @SerializedName("pictureUrl")
    @Expose
    private Object pictureUrl;
    @SerializedName("hasProfileImage")
    @Expose
    private Boolean hasProfileImage;
    @SerializedName("activeAdCount")
    @Expose
    private Integer activeAdCount;
    @SerializedName("private")
    @Expose
    private Boolean _private;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Object getStreet() {
        return street;
    }

    public void setStreet(Object street) {
        this.street = street;
    }

    public Object getDistrict() {
        return district;
    }

    public void setDistrict(Object district) {
        this.district = district;
    }

    public Object getOrgUUID() {
        return orgUUID;
    }

    public void setOrgUUID(Object orgUUID) {
        this.orgUUID = orgUUID;
    }

    public Object getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(Object pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Boolean getHasProfileImage() {
        return hasProfileImage;
    }

    public void setHasProfileImage(Boolean hasProfileImage) {
        this.hasProfileImage = hasProfileImage;
    }

    public Integer getActiveAdCount() {
        return activeAdCount;
    }

    public void setActiveAdCount(Integer activeAdCount) {
        this.activeAdCount = activeAdCount;
    }

    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

}
