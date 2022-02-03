
package v2.vzdm.app.Models.Car;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class TaggingData__1 {

    @SerializedName("taggingNames")
    @Expose
    private TaggingNames__1 taggingNames;
    @SerializedName("tmsDataValues")
    @Expose
    private TmsDataValues__1 tmsDataValues;
    @SerializedName("pulseData")
    @Expose
    private Object pulseData;
    @SerializedName("neustarTaggingData")
    @Expose
    private Object neustarTaggingData;

    public TaggingNames__1 getTaggingNames() {
        return taggingNames;
    }

    public void setTaggingNames(TaggingNames__1 taggingNames) {
        this.taggingNames = taggingNames;
    }

    public TmsDataValues__1 getTmsDataValues() {
        return tmsDataValues;
    }

    public void setTmsDataValues(TmsDataValues__1 tmsDataValues) {
        this.tmsDataValues = tmsDataValues;
    }

    public Object getPulseData() {
        return pulseData;
    }

    public void setPulseData(Object pulseData) {
        this.pulseData = pulseData;
    }

    public Object getNeustarTaggingData() {
        return neustarTaggingData;
    }

    public void setNeustarTaggingData(Object neustarTaggingData) {
        this.neustarTaggingData = neustarTaggingData;
    }

}
