
package v2.vzdm.app.Models.Car;

import java.util.List;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AdvertContactDetails {

    @SerializedName("contactDetail")
    @Expose
    private List<ContactDetail> contactDetail = null;

    public List<ContactDetail> getContactDetail() {
        return contactDetail;
    }

    public void setContactDetail(List<ContactDetail> contactDetail) {
        this.contactDetail = contactDetail;
    }

}
