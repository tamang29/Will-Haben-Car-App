
package v2.vzdm.app.Models.Car;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AdvertAttachmentList {

    @SerializedName("advertAttachment")
    @Expose
    private List<Object> advertAttachment = null;

    public List<Object> getAdvertAttachment() {
        return advertAttachment;
    }

    public void setAdvertAttachment(List<Object> advertAttachment) {
        this.advertAttachment = advertAttachment;
    }

}
