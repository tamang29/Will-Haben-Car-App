
package v2.vzdm.app.Models.Car;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class PayLiveryInactiveDTO {

    @SerializedName("headline")
    @Expose
    private String headline;
    @SerializedName("modalHeadline")
    @Expose
    private String modalHeadline;
    @SerializedName("modalText")
    @Expose
    private String modalText;
    @SerializedName("selfShippingButtonLabel")
    @Expose
    private String selfShippingButtonLabel;
    @SerializedName("selfShippingAndPayLiveryButtonLabel")
    @Expose
    private String selfShippingAndPayLiveryButtonLabel;
    @SerializedName("payLiveryAdvantageDTOList")
    @Expose
    private List<PayLiveryAdvantageDTO__1> payLiveryAdvantageDTOList = null;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getModalHeadline() {
        return modalHeadline;
    }

    public void setModalHeadline(String modalHeadline) {
        this.modalHeadline = modalHeadline;
    }

    public String getModalText() {
        return modalText;
    }

    public void setModalText(String modalText) {
        this.modalText = modalText;
    }

    public String getSelfShippingButtonLabel() {
        return selfShippingButtonLabel;
    }

    public void setSelfShippingButtonLabel(String selfShippingButtonLabel) {
        this.selfShippingButtonLabel = selfShippingButtonLabel;
    }

    public String getSelfShippingAndPayLiveryButtonLabel() {
        return selfShippingAndPayLiveryButtonLabel;
    }

    public void setSelfShippingAndPayLiveryButtonLabel(String selfShippingAndPayLiveryButtonLabel) {
        this.selfShippingAndPayLiveryButtonLabel = selfShippingAndPayLiveryButtonLabel;
    }

    public List<PayLiveryAdvantageDTO__1> getPayLiveryAdvantageDTOList() {
        return payLiveryAdvantageDTOList;
    }

    public void setPayLiveryAdvantageDTOList(List<PayLiveryAdvantageDTO__1> payLiveryAdvantageDTOList) {
        this.payLiveryAdvantageDTOList = payLiveryAdvantageDTOList;
    }

}
