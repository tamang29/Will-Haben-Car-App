
package v2.vzdm.app.Models.Car;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AdServiceLandingPageLinks {

    @SerializedName("adServiceLinks")
    @Expose
    private List<AdServiceLink> adServiceLinks = null;
    @SerializedName("widgetIcons")
    @Expose
    private WidgetIcons widgetIcons;

    public List<AdServiceLink> getAdServiceLinks() {
        return adServiceLinks;
    }

    public void setAdServiceLinks(List<AdServiceLink> adServiceLinks) {
        this.adServiceLinks = adServiceLinks;
    }

    public WidgetIcons getWidgetIcons() {
        return widgetIcons;
    }

    public void setWidgetIcons(WidgetIcons widgetIcons) {
        this.widgetIcons = widgetIcons;
    }

}
