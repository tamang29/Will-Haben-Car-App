
package v2.vzdm.app.Models.Car;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class TaggingNames__1 {

    @SerializedName("nameValuePair")
    @Expose
    private List<NameValuePair__1> nameValuePair = null;

    public List<NameValuePair__1> getNameValuePair() {
        return nameValuePair;
    }

    public void setNameValuePair(List<NameValuePair__1> nameValuePair) {
        this.nameValuePair = nameValuePair;
    }

}
