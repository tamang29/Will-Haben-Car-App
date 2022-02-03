
package v2.vzdm.app.Models.Car;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Query {

    @SerializedName("seopath")
    @Expose
    private List<String> seopath = null;

    public List<String> getSeopath() {
        return seopath;
    }

    public void setSeopath(List<String> seopath) {
        this.seopath = seopath;
    }

}
