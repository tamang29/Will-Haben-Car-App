
package v2.vzdm.app.Models.Car;

import java.util.List;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class PulseData {

    @SerializedName("pulseEvents")
    @Expose
    private List<PulseEvent> pulseEvents = null;

    public List<PulseEvent> getPulseEvents() {
        return pulseEvents;
    }

    public void setPulseEvents(List<PulseEvent> pulseEvents) {
        this.pulseEvents = pulseEvents;
    }

}
