
package v2.vzdm.app.Models.Car;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class HowToPayLiveryDTO {

    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("headline")
    @Expose
    private String headline;
    @SerializedName("subHeadline")
    @Expose
    private String subHeadline;
    @SerializedName("subline")
    @Expose
    private String subline;
    @SerializedName("payLiveryAdvantageDTOList")
    @Expose
    private List<PayLiveryAdvantageDTO> payLiveryAdvantageDTOList = null;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getSubHeadline() {
        return subHeadline;
    }

    public void setSubHeadline(String subHeadline) {
        this.subHeadline = subHeadline;
    }

    public String getSubline() {
        return subline;
    }

    public void setSubline(String subline) {
        this.subline = subline;
    }

    public List<PayLiveryAdvantageDTO> getPayLiveryAdvantageDTOList() {
        return payLiveryAdvantageDTOList;
    }

    public void setPayLiveryAdvantageDTOList(List<PayLiveryAdvantageDTO> payLiveryAdvantageDTOList) {
        this.payLiveryAdvantageDTOList = payLiveryAdvantageDTOList;
    }

}
