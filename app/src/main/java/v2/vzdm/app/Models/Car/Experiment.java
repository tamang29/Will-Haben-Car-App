
package v2.vzdm.app.Models.Car;

import java.util.List;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Experiment {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("audienceConditions")
    @Expose
    private List<Object> audienceConditions = null;
    @SerializedName("audienceIds")
    @Expose
    private List<Object> audienceIds = null;
    @SerializedName("variations")
    @Expose
    private List<Variation> variations = null;
    @SerializedName("forcedVariations")
    @Expose
    private ForcedVariations forcedVariations;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("layerId")
    @Expose
    private String layerId;
    @SerializedName("trafficAllocation")
    @Expose
    private List<TrafficAllocation> trafficAllocation = null;
    @SerializedName("id")
    @Expose
    private String id;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Object> getAudienceConditions() {
        return audienceConditions;
    }

    public void setAudienceConditions(List<Object> audienceConditions) {
        this.audienceConditions = audienceConditions;
    }

    public List<Object> getAudienceIds() {
        return audienceIds;
    }

    public void setAudienceIds(List<Object> audienceIds) {
        this.audienceIds = audienceIds;
    }

    public List<Variation> getVariations() {
        return variations;
    }

    public void setVariations(List<Variation> variations) {
        this.variations = variations;
    }

    public ForcedVariations getForcedVariations() {
        return forcedVariations;
    }

    public void setForcedVariations(ForcedVariations forcedVariations) {
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

    public List<TrafficAllocation> getTrafficAllocation() {
        return trafficAllocation;
    }

    public void setTrafficAllocation(List<TrafficAllocation> trafficAllocation) {
        this.trafficAllocation = trafficAllocation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
