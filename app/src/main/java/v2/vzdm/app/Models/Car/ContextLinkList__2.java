
package v2.vzdm.app.Models.Car;

import java.util.List;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ContextLinkList__2 {

    @SerializedName("contextLink")
    @Expose
    private List<ContextLink__4> contextLink = null;

    public List<ContextLink__4> getContextLink() {
        return contextLink;
    }

    public void setContextLink(List<ContextLink__4> contextLink) {
        this.contextLink = contextLink;
    }

}
