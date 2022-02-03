
package v2.vzdm.app.Models.Car;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Attributes {

    @SerializedName("attribute")
    @Expose
    private List<Attribute> attribute = null;

    public List<Attribute> getAttribute() {
        return attribute;
    }

    public void setAttribute(List<Attribute> attribute) {
        this.attribute = attribute;
    }

}
