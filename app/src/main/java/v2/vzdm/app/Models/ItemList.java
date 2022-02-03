package v2.vzdm.app.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ItemList {

    @SerializedName("Product")
    private List<Item> products;

    public List<Item> getProducts() {
        return products;
    }

    public void setProducts(List<Item> products) {
        this.products = products;
    }


}
