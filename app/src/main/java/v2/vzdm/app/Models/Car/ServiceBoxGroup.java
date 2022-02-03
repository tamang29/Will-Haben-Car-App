
package v2.vzdm.app.Models.Car;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ServiceBoxGroup {

    @SerializedName("groupData")
    @Expose
    private GroupData groupData;
    @SerializedName("promotions")
    @Expose
    private List<Promotion> promotions = null;

    public GroupData getGroupData() {
        return groupData;
    }

    public void setGroupData(GroupData groupData) {
        this.groupData = groupData;
    }

    public List<Promotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }

}
