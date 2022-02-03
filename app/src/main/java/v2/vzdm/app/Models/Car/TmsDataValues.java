
package v2.vzdm.app.Models.Car;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class TmsDataValues {

    @SerializedName("tmsData")
    @Expose
    private TmsData tmsData;

    public TmsData getTmsData() {
        return tmsData;
    }

    public void setTmsData(TmsData tmsData) {
        this.tmsData = tmsData;
    }

}
