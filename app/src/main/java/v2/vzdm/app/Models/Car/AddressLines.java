
package v2.vzdm.app.Models.Car;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AddressLines {

    @SerializedName("value")
    @Expose
    private List<Object> value = null;

    public List<Object> getValue() {
        return value;
    }

    public void setValue(List<Object> value) {
        this.value = value;
    }

}
