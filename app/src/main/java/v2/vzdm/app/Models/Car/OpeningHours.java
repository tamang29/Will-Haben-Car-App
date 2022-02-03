
package v2.vzdm.app.Models.Car;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class OpeningHours {

    @SerializedName("openingHoursByGroup")
    @Expose
    private List<Object> openingHoursByGroup = null;

    public List<Object> getOpeningHoursByGroup() {
        return openingHoursByGroup;
    }

    public void setOpeningHoursByGroup(List<Object> openingHoursByGroup) {
        this.openingHoursByGroup = openingHoursByGroup;
    }

}
