
package v2.vzdm.app.Models.Car;

import java.util.List;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class InitialOptimizelyDatafile {

    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("rollouts")
    @Expose
    private List<Rollout> rollouts = null;
    @SerializedName("typedAudiences")
    @Expose
    private List<TypedAudience> typedAudiences = null;
    @SerializedName("anonymizeIP")
    @Expose
    private Boolean anonymizeIP;
    @SerializedName("projectId")
    @Expose
    private String projectId;
    @SerializedName("variables")
    @Expose
    private List<Object> variables = null;
    @SerializedName("featureFlags")
    @Expose
    private List<FeatureFlag> featureFlags = null;
    @SerializedName("experiments")
    @Expose
    private List<Experiment__1> experiments = null;
    @SerializedName("audiences")
    @Expose
    private List<Audience> audiences = null;
    @SerializedName("groups")
    @Expose
    private List<Object> groups = null;
    @SerializedName("sdkKey")
    @Expose
    private String sdkKey;
    @SerializedName("environmentKey")
    @Expose
    private String environmentKey;
    @SerializedName("attributes")
    @Expose
    private List<Attribute__1> attributes = null;
    @SerializedName("botFiltering")
    @Expose
    private Boolean botFiltering;
    @SerializedName("accountId")
    @Expose
    private String accountId;
    @SerializedName("events")
    @Expose
    private List<Event> events = null;
    @SerializedName("revision")
    @Expose
    private String revision;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<Rollout> getRollouts() {
        return rollouts;
    }

    public void setRollouts(List<Rollout> rollouts) {
        this.rollouts = rollouts;
    }

    public List<TypedAudience> getTypedAudiences() {
        return typedAudiences;
    }

    public void setTypedAudiences(List<TypedAudience> typedAudiences) {
        this.typedAudiences = typedAudiences;
    }

    public Boolean getAnonymizeIP() {
        return anonymizeIP;
    }

    public void setAnonymizeIP(Boolean anonymizeIP) {
        this.anonymizeIP = anonymizeIP;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public List<Object> getVariables() {
        return variables;
    }

    public void setVariables(List<Object> variables) {
        this.variables = variables;
    }

    public List<FeatureFlag> getFeatureFlags() {
        return featureFlags;
    }

    public void setFeatureFlags(List<FeatureFlag> featureFlags) {
        this.featureFlags = featureFlags;
    }

    public List<Experiment__1> getExperiments() {
        return experiments;
    }

    public void setExperiments(List<Experiment__1> experiments) {
        this.experiments = experiments;
    }

    public List<Audience> getAudiences() {
        return audiences;
    }

    public void setAudiences(List<Audience> audiences) {
        this.audiences = audiences;
    }

    public List<Object> getGroups() {
        return groups;
    }

    public void setGroups(List<Object> groups) {
        this.groups = groups;
    }

    public String getSdkKey() {
        return sdkKey;
    }

    public void setSdkKey(String sdkKey) {
        this.sdkKey = sdkKey;
    }

    public String getEnvironmentKey() {
        return environmentKey;
    }

    public void setEnvironmentKey(String environmentKey) {
        this.environmentKey = environmentKey;
    }

    public List<Attribute__1> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute__1> attributes) {
        this.attributes = attributes;
    }

    public Boolean getBotFiltering() {
        return botFiltering;
    }

    public void setBotFiltering(Boolean botFiltering) {
        this.botFiltering = botFiltering;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

}
