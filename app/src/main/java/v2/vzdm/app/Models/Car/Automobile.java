
package v2.vzdm.app.Models.Car;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Automobile {

    @SerializedName("props")
    @Expose
    private Props props;
    @SerializedName("page")
    @Expose
    private String page;
    @SerializedName("query")
    @Expose
    private Query query;
    @SerializedName("runtimeConfig")
    @Expose
    private RuntimeConfig runtimeConfig;
    @SerializedName("appGip")
    @Expose
    private Boolean appGip;
    @SerializedName("buildId")
    @Expose
    private String buildId;
    @SerializedName("customServer")
    @Expose
    private Boolean customServer;
    @SerializedName("gip")
    @Expose
    private Boolean gip;
    @SerializedName("isFallback")
    @Expose
    private Boolean isFallback;

    public Props getProps() {
        return props;
    }

    public void setProps(Props props) {
        this.props = props;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public RuntimeConfig getRuntimeConfig() {
        return runtimeConfig;
    }

    public void setRuntimeConfig(RuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
    }

    public Boolean getAppGip() {
        return appGip;
    }

    public void setAppGip(Boolean appGip) {
        this.appGip = appGip;
    }

    public String getBuildId() {
        return buildId;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    public Boolean getCustomServer() {
        return customServer;
    }

    public void setCustomServer(Boolean customServer) {
        this.customServer = customServer;
    }

    public Boolean getGip() {
        return gip;
    }

    public void setGip(Boolean gip) {
        this.gip = gip;
    }

    public Boolean getIsFallback() {
        return isFallback;
    }

    public void setIsFallback(Boolean isFallback) {
        this.isFallback = isFallback;
    }

}
