
package v2.vzdm.app.Models.Car;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class OrganisationDetailLinkList {

    @SerializedName("contextLink")
    @Expose
    private List<ContextLink> contextLink = null;

    public List<ContextLink> getContextLink() {
        return contextLink;
    }

    public void setContextLink(List<ContextLink> contextLink) {
        this.contextLink = contextLink;
    }

}
