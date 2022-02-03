
package v2.vzdm.app.Models.Car;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Page1 {

    @SerializedName("headerIconUrlPng")
    @Expose
    private String headerIconUrlPng;
    @SerializedName("headerIconUrlSvg")
    @Expose
    private String headerIconUrlSvg;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("buttonText")
    @Expose
    private String buttonText;

    public String getHeaderIconUrlPng() {
        return headerIconUrlPng;
    }

    public void setHeaderIconUrlPng(String headerIconUrlPng) {
        this.headerIconUrlPng = headerIconUrlPng;
    }

    public String getHeaderIconUrlSvg() {
        return headerIconUrlSvg;
    }

    public void setHeaderIconUrlSvg(String headerIconUrlSvg) {
        this.headerIconUrlSvg = headerIconUrlSvg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

}
