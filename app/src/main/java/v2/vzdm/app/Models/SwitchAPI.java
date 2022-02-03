package v2.vzdm.app.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SwitchAPI {
    @SerializedName("isOn")
    @Expose
    private Boolean isOn;

    public Boolean getOn() {
        return isOn;
    }

    public void setOn(Boolean on) {
        isOn = on;
    }
}
