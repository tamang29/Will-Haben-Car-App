
package v2.vzdm.app.Models.Car;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Publisher {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("accountId")
    @Expose
    private String accountId;
    @SerializedName("type")
    @Expose
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
