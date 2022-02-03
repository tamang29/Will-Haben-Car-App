
package v2.vzdm.app.Models.Car;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class TmsData__1 {

    @SerializedName("vertical_id")
    @Expose
    private String verticalId;
    @SerializedName("environment")
    @Expose
    private String environment;
    @SerializedName("vertical")
    @Expose
    private String vertical;
    @SerializedName("source")
    @Expose
    private String source;

    public String getVerticalId() {
        return verticalId;
    }

    public void setVerticalId(String verticalId) {
        this.verticalId = verticalId;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getVertical() {
        return vertical;
    }

    public void setVertical(String vertical) {
        this.vertical = vertical;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
