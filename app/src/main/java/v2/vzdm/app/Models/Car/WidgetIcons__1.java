
package v2.vzdm.app.Models.Car;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class WidgetIcons__1 {

    @SerializedName("contextLink")
    @Expose
    private List<ContextLink__5> contextLink = null;

    public List<ContextLink__5> getContextLink() {
        return contextLink;
    }

    public void setContextLink(List<ContextLink__5> contextLink) {
        this.contextLink = contextLink;
    }

}
