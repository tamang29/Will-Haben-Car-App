
package v2.vzdm.app.Models.Car;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AdServiceLink__1 {

    @SerializedName("display")
    @Expose
    private String display;
    @SerializedName("adServiceGroupWidgetTypeEnum")
    @Expose
    private String adServiceGroupWidgetTypeEnum;
    @SerializedName("dmpTextlinkDescription")
    @Expose
    private String dmpTextlinkDescription;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("contextLinkList")
    @Expose
    private ContextLinkList__2 contextLinkList;

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getAdServiceGroupWidgetTypeEnum() {
        return adServiceGroupWidgetTypeEnum;
    }

    public void setAdServiceGroupWidgetTypeEnum(String adServiceGroupWidgetTypeEnum) {
        this.adServiceGroupWidgetTypeEnum = adServiceGroupWidgetTypeEnum;
    }

    public String getDmpTextlinkDescription() {
        return dmpTextlinkDescription;
    }

    public void setDmpTextlinkDescription(String dmpTextlinkDescription) {
        this.dmpTextlinkDescription = dmpTextlinkDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ContextLinkList__2 getContextLinkList() {
        return contextLinkList;
    }

    public void setContextLinkList(ContextLinkList__2 contextLinkList) {
        this.contextLinkList = contextLinkList;
    }

}
