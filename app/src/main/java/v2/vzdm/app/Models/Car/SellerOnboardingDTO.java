
package v2.vzdm.app.Models.Car;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class SellerOnboardingDTO {

    @SerializedName("page1")
    @Expose
    private Page1 page1;

    public Page1 getPage1() {
        return page1;
    }

    public void setPage1(Page1 page1) {
        this.page1 = page1;
    }

}
