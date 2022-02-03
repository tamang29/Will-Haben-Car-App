
package v2.vzdm.app.Models.Car;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class VerticalsInfo {

    @SerializedName("vertical")
    @Expose
    private List<Vertical> vertical = null;

    public List<Vertical> getVertical() {
        return vertical;
    }

    public void setVertical(List<Vertical> vertical) {
        this.vertical = vertical;
    }

}
