
package v2.vzdm.app.Models.Car;

import java.util.List;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AdServiceDesktopLandingPageLinks {

    @SerializedName("adServiceLinks")
    @Expose
    private List<AdServiceLink__1> adServiceLinks = null;
    @SerializedName("widgetIcons")
    @Expose
    private WidgetIcons__1 widgetIcons;

    public List<AdServiceLink__1> getAdServiceLinks() {
        return adServiceLinks;
    }

    public void setAdServiceLinks(List<AdServiceLink__1> adServiceLinks) {
        this.adServiceLinks = adServiceLinks;
    }

    public WidgetIcons__1 getWidgetIcons() {
        return widgetIcons;
    }

    public void setWidgetIcons(WidgetIcons__1 widgetIcons) {
        this.widgetIcons = widgetIcons;
    }

}
