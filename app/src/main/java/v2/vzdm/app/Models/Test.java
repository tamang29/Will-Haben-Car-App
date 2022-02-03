package v2.vzdm.app.Models;

public class Test {

    private String imageUrl;



    private String modelName;
    private String modelDesc;

    public Test(String imageUrl, String modelName, String modelDesc) {
        this.imageUrl = imageUrl;
        this.modelName = modelName;
        this.modelDesc = modelDesc;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelDesc() {
        return modelDesc;
    }

    public void setModelDesc(String modelDesc) {
        this.modelDesc = modelDesc;
    }
    @Override
    public String toString() {
        return "Test{" +
                "imageUrl='" + imageUrl + '\'' +
                ", modelName='" + modelName + '\'' +
                ", modelDesc='" + modelDesc + '\'' +
                '}';
    }
}
