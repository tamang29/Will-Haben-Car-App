
package v2.vzdm.app.Models.Car;

import java.util.List;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class FeatureFlag {

    @SerializedName("experimentIds")
    @Expose
    private List<String> experimentIds = null;
    @SerializedName("rolloutId")
    @Expose
    private String rolloutId;
    @SerializedName("variables")
    @Expose
    private List<Variable__1> variables = null;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("key")
    @Expose
    private String key;

    public List<String> getExperimentIds() {
        return experimentIds;
    }

    public void setExperimentIds(List<String> experimentIds) {
        this.experimentIds = experimentIds;
    }

    public String getRolloutId() {
        return rolloutId;
    }

    public void setRolloutId(String rolloutId) {
        this.rolloutId = rolloutId;
    }

    public List<Variable__1> getVariables() {
        return variables;
    }

    public void setVariables(List<Variable__1> variables) {
        this.variables = variables;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
