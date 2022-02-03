
package v2.vzdm.app.Models.Car;

import java.util.List;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Experiment__1 {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("audienceConditions")
    @Expose
    private List<String> audienceConditions = null;
    @SerializedName("audienceIds")
    @Expose
    private List<String> audienceIds = null;
    @SerializedName("variations")
    @Expose
    private List<Variation__1> variations = null;
    @SerializedName("forcedVariations")
    @Expose
    private ForcedVariations__1 forcedVariations;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("layerId")
    @Expose
    private String layerId;
    @SerializedName("trafficAllocation")
    @Expose
    private List<TrafficAllocation__1> trafficAllocation = null;
    @SerializedName("id")
    @Expose
    private String id;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getAudienceConditions() {
        return audienceConditions;
    }

    public void setAudienceConditions(List<String> audienceConditions) {
        this.audienceConditions = audienceConditions;
    }

    public List<String> getAudienceIds() {
        return audienceIds;
    }

    public void setAudienceIds(List<String> audienceIds) {
        this.audienceIds = audienceIds;
    }

    public List<Variation__1> getVariations() {
        return variations;
    }

    public void setVariations(List<Variation__1> variations) {
        this.variations = variations;
    }

    public ForcedVariations__1 getForcedVariations() {
        return forcedVariations;
    }

    public void setForcedVariations(ForcedVariations__1 forcedVariations) {
        this.forcedVariations = forcedVariations;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLayerId() {
        return layerId;
    }

    public void setLayerId(String layerId) {
        this.layerId = layerId;
    }

    public List<TrafficAllocation__1> getTrafficAllocation() {
        return trafficAllocation;
    }

    public void setTrafficAllocation(List<TrafficAllocation__1> trafficAllocation) {
        this.trafficAllocation = trafficAllocation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
