
package v2.vzdm.app.Models.Car;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class P2ppOptions {

    @SerializedName("deliveryOptions")
    @Expose
    private List<Object> deliveryOptions = null;
    @SerializedName("parcelSizes")
    @Expose
    private List<Object> parcelSizes = null;
    @SerializedName("paymentOptions")
    @Expose
    private List<PaymentOption> paymentOptions = null;
    @SerializedName("sellerOnboardingDTO")
    @Expose
    private SellerOnboardingDTO sellerOnboardingDTO;
    @SerializedName("howToPayLiveryDTO")
    @Expose
    private HowToPayLiveryDTO howToPayLiveryDTO;
    @SerializedName("payLiveryInactiveDTO")
    @Expose
    private PayLiveryInactiveDTO payLiveryInactiveDTO;
    @SerializedName("contextLinkList")
    @Expose
    private ContextLinkList__3 contextLinkList;
    @SerializedName("attributes")
    @Expose
    private Attributes__1 attributes;

    public List<Object> getDeliveryOptions() {
        return deliveryOptions;
    }

    public void setDeliveryOptions(List<Object> deliveryOptions) {
        this.deliveryOptions = deliveryOptions;
    }

    public List<Object> getParcelSizes() {
        return parcelSizes;
    }

    public void setParcelSizes(List<Object> parcelSizes) {
        this.parcelSizes = parcelSizes;
    }

    public List<PaymentOption> getPaymentOptions() {
        return paymentOptions;
    }

    public void setPaymentOptions(List<PaymentOption> paymentOptions) {
        this.paymentOptions = paymentOptions;
    }

    public SellerOnboardingDTO getSellerOnboardingDTO() {
        return sellerOnboardingDTO;
    }

    public void setSellerOnboardingDTO(SellerOnboardingDTO sellerOnboardingDTO) {
        this.sellerOnboardingDTO = sellerOnboardingDTO;
    }

    public HowToPayLiveryDTO getHowToPayLiveryDTO() {
        return howToPayLiveryDTO;
    }

    public void setHowToPayLiveryDTO(HowToPayLiveryDTO howToPayLiveryDTO) {
        this.howToPayLiveryDTO = howToPayLiveryDTO;
    }

    public PayLiveryInactiveDTO getPayLiveryInactiveDTO() {
        return payLiveryInactiveDTO;
    }

    public void setPayLiveryInactiveDTO(PayLiveryInactiveDTO payLiveryInactiveDTO) {
        this.payLiveryInactiveDTO = payLiveryInactiveDTO;
    }

    public ContextLinkList__3 getContextLinkList() {
        return contextLinkList;
    }

    public void setContextLinkList(ContextLinkList__3 contextLinkList) {
        this.contextLinkList = contextLinkList;
    }

    public Attributes__1 getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes__1 attributes) {
        this.attributes = attributes;
    }

}
