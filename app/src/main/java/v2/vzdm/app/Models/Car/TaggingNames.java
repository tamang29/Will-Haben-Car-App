
package v2.vzdm.app.Models.Car;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class TaggingNames {

    @SerializedName("nameValuePair")
    @Expose
    private List<NameValuePair> nameValuePair = null;

    public List<NameValuePair> getNameValuePair() {
        return nameValuePair;
    }

    public void setNameValuePair(List<NameValuePair> nameValuePair) {
        this.nameValuePair = nameValuePair;
    }

}
