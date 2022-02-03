
package v2.vzdm.app.Models.Car;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Breadcrumb {

    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("seoUrl")
    @Expose
    private String seoUrl;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getSeoUrl() {
        return seoUrl;
    }

    public void setSeoUrl(String seoUrl) {
        this.seoUrl = seoUrl;
    }

}
