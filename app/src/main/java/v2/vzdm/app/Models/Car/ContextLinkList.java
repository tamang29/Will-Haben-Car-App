
package v2.vzdm.app.Models.Car;

import java.util.List;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ContextLinkList {

    @SerializedName("contextLink")
    @Expose
    private List<ContextLink__1> contextLink = null;

    public List<ContextLink__1> getContextLink() {
        return contextLink;
    }

    public void setContextLink(List<ContextLink__1> contextLink) {
        this.contextLink = contextLink;
    }

}
