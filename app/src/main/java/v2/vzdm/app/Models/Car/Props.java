
package v2.vzdm.app.Models.Car;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Props {

    @SerializedName("pageProps")
    @Expose
    private PageProps pageProps;
    @SerializedName("showVerificationAlert")
    @Expose
    private Boolean showVerificationAlert;
    @SerializedName("userAgent")
    @Expose
    private String userAgent;
    @SerializedName("isSSG")
    @Expose
    private Boolean isSSG;
    @SerializedName("toggles")
    @Expose
    private Toggles toggles;
    @SerializedName("initialOptimizelyDatafile")
    @Expose
    private InitialOptimizelyDatafile initialOptimizelyDatafile;
    @SerializedName("cookies")
    @Expose
    private Cookies cookies;
    @SerializedName("is404")
    @Expose
    private Boolean is404;
    @SerializedName("verticalsInfo")
    @Expose
    private VerticalsInfo verticalsInfo;

    public PageProps getPageProps() {
        return pageProps;
    }

    public void setPageProps(PageProps pageProps) {
        this.pageProps = pageProps;
    }

    public Boolean getShowVerificationAlert() {
        return showVerificationAlert;
    }

    public void setShowVerificationAlert(Boolean showVerificationAlert) {
        this.showVerificationAlert = showVerificationAlert;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Boolean getIsSSG() {
        return isSSG;
    }

    public void setIsSSG(Boolean isSSG) {
        this.isSSG = isSSG;
    }

    public Toggles getToggles() {
        return toggles;
    }

    public void setToggles(Toggles toggles) {
        this.toggles = toggles;
    }

    public InitialOptimizelyDatafile getInitialOptimizelyDatafile() {
        return initialOptimizelyDatafile;
    }

    public void setInitialOptimizelyDatafile(InitialOptimizelyDatafile initialOptimizelyDatafile) {
        this.initialOptimizelyDatafile = initialOptimizelyDatafile;
    }

    public Cookies getCookies() {
        return cookies;
    }

    public void setCookies(Cookies cookies) {
        this.cookies = cookies;
    }

    public Boolean getIs404() {
        return is404;
    }

    public void setIs404(Boolean is404) {
        this.is404 = is404;
    }

    public VerticalsInfo getVerticalsInfo() {
        return verticalsInfo;
    }

    public void setVerticalsInfo(VerticalsInfo verticalsInfo) {
        this.verticalsInfo = verticalsInfo;
    }

}
