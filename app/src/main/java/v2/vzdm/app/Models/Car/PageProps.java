
package v2.vzdm.app.Models.Car;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class PageProps {

    @SerializedName("advertDetails")
    @Expose
    private AdvertDetails advertDetails;

    public AdvertDetails getAdvertDetails() {
        return advertDetails;
    }

    public void setAdvertDetails(AdvertDetails advertDetails) {
        this.advertDetails = advertDetails;
    }

}
