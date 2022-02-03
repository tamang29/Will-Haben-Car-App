
package v2.vzdm.app.Models.Car;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class FacebookTrackingData {

    @SerializedName("vertical")
    @Expose
    private String vertical;
    @SerializedName("category1")
    @Expose
    private String category1;
    @SerializedName("category2")
    @Expose
    private String category2;

    public String getVertical() {
        return vertical;
    }

    public void setVertical(String vertical) {
        this.vertical = vertical;
    }

    public String getCategory1() {
        return category1;
    }

    public void setCategory1(String category1) {
        this.category1 = category1;
    }

    public String getCategory2() {
        return category2;
    }

    public void setCategory2(String category2) {
        this.category2 = category2;
    }

}
