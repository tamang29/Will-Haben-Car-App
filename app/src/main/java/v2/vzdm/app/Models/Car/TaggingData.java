
package v2.vzdm.app.Models.Car;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class TaggingData {

    @SerializedName("taggingNames")
    @Expose
    private TaggingNames taggingNames;
    @SerializedName("tmsDataValues")
    @Expose
    private TmsDataValues tmsDataValues;
    @SerializedName("pulseData")
    @Expose
    private PulseData pulseData;
    @SerializedName("neustarTaggingData")
    @Expose
    private NeustarTaggingData neustarTaggingData;

    public TaggingNames getTaggingNames() {
        return taggingNames;
    }

    public void setTaggingNames(TaggingNames taggingNames) {
        this.taggingNames = taggingNames;
    }

    public TmsDataValues getTmsDataValues() {
        return tmsDataValues;
    }

    public void setTmsDataValues(TmsDataValues tmsDataValues) {
        this.tmsDataValues = tmsDataValues;
    }

    public PulseData getPulseData() {
        return pulseData;
    }

    public void setPulseData(PulseData pulseData) {
        this.pulseData = pulseData;
    }

    public NeustarTaggingData getNeustarTaggingData() {
        return neustarTaggingData;
    }

    public void setNeustarTaggingData(NeustarTaggingData neustarTaggingData) {
        this.neustarTaggingData = neustarTaggingData;
    }

}
