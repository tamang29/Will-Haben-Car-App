
package v2.vzdm.app.Models.Car;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class WidgetIcons {

    @SerializedName("contextLink")
    @Expose
    private List<ContextLink__3> contextLink = null;

    public List<ContextLink__3> getContextLink() {
        return contextLink;
    }

    public void setContextLink(List<ContextLink__3> contextLink) {
        this.contextLink = contextLink;
    }

}
