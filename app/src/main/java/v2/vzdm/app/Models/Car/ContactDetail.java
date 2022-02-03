
package v2.vzdm.app.Models.Car;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ContactDetail {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("contactDetailField")
    @Expose
    private List<ContactDetailField> contactDetailField = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ContactDetailField> getContactDetailField() {
        return contactDetailField;
    }

    public void setContactDetailField(List<ContactDetailField> contactDetailField) {
        this.contactDetailField = contactDetailField;
    }

}
