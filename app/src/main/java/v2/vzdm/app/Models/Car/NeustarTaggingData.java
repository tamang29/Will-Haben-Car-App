
package v2.vzdm.app.Models.Car;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class NeustarTaggingData {

    @SerializedName("mainCategory")
    @Expose
    private String mainCategory;
    @SerializedName("vertical")
    @Expose
    private String vertical;
    @SerializedName("device")
    @Expose
    private String device;

    public String getMainCategory() {
        return mainCategory;
    }

    public void setMainCategory(String mainCategory) {
        this.mainCategory = mainCategory;
    }

    public String getVertical() {
        return vertical;
    }

    public void setVertical(String vertical) {
        this.vertical = vertical;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

}
