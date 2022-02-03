
package v2.vzdm.app.Models.Car;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AdvertImageList {

    @SerializedName("advertImage")
    @Expose
    private List<AdvertImage> advertImage = null;

    public List<AdvertImage> getAdvertImage() {
        return advertImage;
    }

    public void setAdvertImage(List<AdvertImage> advertImage) {
        this.advertImage = advertImage;
    }

}
