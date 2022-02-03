
package v2.vzdm.app.Models.Car;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class TrafficAllocation__1 {

    @SerializedName("entityId")
    @Expose
    private String entityId;
    @SerializedName("endOfRange")
    @Expose
    private Integer endOfRange;

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public Integer getEndOfRange() {
        return endOfRange;
    }

    public void setEndOfRange(Integer endOfRange) {
        this.endOfRange = endOfRange;
    }

}
