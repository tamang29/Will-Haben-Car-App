
package v2.vzdm.app.Models.Car;




import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class TmsDataValues__1 {

    @SerializedName("tmsData")
    @Expose
    private TmsData__1 tmsData;

    public TmsData__1 getTmsData() {
        return tmsData;
    }

    public void setTmsData(TmsData__1 tmsData) {
        this.tmsData = tmsData;
    }

}
