
package v2.vzdm.app.Models.Car;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Suggestion {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("sortOrder")
    @Expose
    private Integer sortOrder;
    @SerializedName("contactFormText")
    @Expose
    private String contactFormText;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getContactFormText() {
        return contactFormText;
    }

    public void setContactFormText(String contactFormText) {
        this.contactFormText = contactFormText;
    }

}
