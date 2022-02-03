
package v2.vzdm.app.Models.Car;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AdvertAddressDetails {

    @SerializedName("addressLines")
    @Expose
    private AddressLines__1 addressLines;
    @SerializedName("postCode")
    @Expose
    private String postCode;
    @SerializedName("postalName")
    @Expose
    private String postalName;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("province")
    @Expose
    private String province;
    @SerializedName("district")
    @Expose
    private String district;

    public AddressLines__1 getAddressLines() {
        return addressLines;
    }

    public void setAddressLines(AddressLines__1 addressLines) {
        this.addressLines = addressLines;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPostalName() {
        return postalName;
    }

    public void setPostalName(String postalName) {
        this.postalName = postalName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

}
