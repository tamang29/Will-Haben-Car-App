
package v2.vzdm.app.Models.Car;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class PulseEvent {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("contentId")
    @Expose
    private Integer contentId;
    @SerializedName("adId")
    @Expose
    private Integer adId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("adType")
    @Expose
    private String adType;
    @SerializedName("publisherType")
    @Expose
    private String publisherType;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("priceAsNumber")
    @Expose
    private Integer priceAsNumber;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("publisherUuid")
    @Expose
    private String publisherUuid;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("publisher")
    @Expose
    private Publisher publisher;
    @SerializedName("telephone")
    @Expose
    private Object telephone;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdType() {
        return adType;
    }

    public void setAdType(String adType) {
        this.adType = adType;
    }

    public String getPublisherType() {
        return publisherType;
    }

    public void setPublisherType(String publisherType) {
        this.publisherType = publisherType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getPriceAsNumber() {
        return priceAsNumber;
    }

    public void setPriceAsNumber(Integer priceAsNumber) {
        this.priceAsNumber = priceAsNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPublisherUuid() {
        return publisherUuid;
    }

    public void setPublisherUuid(String publisherUuid) {
        this.publisherUuid = publisherUuid;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Object getTelephone() {
        return telephone;
    }

    public void setTelephone(Object telephone) {
        this.telephone = telephone;
    }

}
