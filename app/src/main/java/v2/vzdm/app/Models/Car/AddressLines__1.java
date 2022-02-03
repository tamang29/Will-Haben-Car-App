
package v2.vzdm.app.Models.Car;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AddressLines__1 {

    @SerializedName("value")
    @Expose
    private List<String> value = null;

    public List<String> getValue() {
        return value;
    }

    public void setValue(List<String> value) {
        this.value = value;
    }

}
