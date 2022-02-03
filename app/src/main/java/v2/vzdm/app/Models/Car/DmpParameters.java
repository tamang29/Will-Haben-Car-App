
package v2.vzdm.app.Models.Car;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class DmpParameters {

    @SerializedName("pagetype")
    @Expose
    private String pagetype;
    @SerializedName("motorcondition")
    @Expose
    private List<String> motorcondition = null;
    @SerializedName("adimageurl")
    @Expose
    private String adimageurl;
    @SerializedName("city")
    @Expose
    private List<String> city = null;
    @SerializedName("fuel")
    @Expose
    private List<String> fuel = null;
    @SerializedName("noofseats")
    @Expose
    private Integer noofseats;
    @SerializedName("AdImage")
    @Expose
    private Boolean adImage;
    @SerializedName("vertical")
    @Expose
    private String vertical;
    @SerializedName("noofdoors")
    @Expose
    private Integer noofdoors;
    @SerializedName("wheeldrive")
    @Expose
    private List<String> wheeldrive = null;
    @SerializedName("transmission")
    @Expose
    private List<String> transmission = null;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("willhabencode")
    @Expose
    private String willhabencode;
    @SerializedName("warranty")
    @Expose
    private Boolean warranty;
    @SerializedName("model")
    @Expose
    private List<String> model = null;
    @SerializedName("state")
    @Expose
    private List<String> state = null;
    @SerializedName("partnerid")
    @Expose
    private List<String> partnerid = null;
    @SerializedName("make")
    @Expose
    private List<String> make = null;
    @SerializedName("mileage")
    @Expose
    private Integer mileage;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("heading")
    @Expose
    private String heading;
    @SerializedName("registrationfirstyear")
    @Expose
    private Integer registrationfirstyear;
    @SerializedName("postcode")
    @Expose
    private List<Integer> postcode = null;
    @SerializedName("equipment")
    @Expose
    private List<String> equipment = null;
    @SerializedName("pt1")
    @Expose
    private String pt1;
    @SerializedName("orgid")
    @Expose
    private Integer orgid;
    @SerializedName("make_model")
    @Expose
    private List<String> makeModel = null;
    @SerializedName("pt5")
    @Expose
    private Integer pt5;
    @SerializedName("pt7")
    @Expose
    private Integer pt7;
    @SerializedName("pt6")
    @Expose
    private Integer pt6;
    @SerializedName("isAdSavedInFolder")
    @Expose
    private Boolean isAdSavedInFolder;
    @SerializedName("conditionreport")
    @Expose
    private Boolean conditionreport;
    @SerializedName("effect")
    @Expose
    private Integer effect;
    @SerializedName("district")
    @Expose
    private List<String> district = null;
    @SerializedName("colour_2")
    @Expose
    private List<String> colour2 = null;
    @SerializedName("registrationfirst")
    @Expose
    private Integer registrationfirst;
    @SerializedName("device")
    @Expose
    private String device;
    @SerializedName("registrationfirstmonth")
    @Expose
    private Integer registrationfirstmonth;
    @SerializedName("dealer_2")
    @Expose
    private List<String> dealer2 = null;
    @SerializedName("motor_level0")
    @Expose
    private String motorLevel0;
    @SerializedName("motor_level1")
    @Expose
    private List<String> motorLevel1 = null;

    public String getPagetype() {
        return pagetype;
    }

    public void setPagetype(String pagetype) {
        this.pagetype = pagetype;
    }

    public List<String> getMotorcondition() {
        return motorcondition;
    }

    public void setMotorcondition(List<String> motorcondition) {
        this.motorcondition = motorcondition;
    }

    public String getAdimageurl() {
        return adimageurl;
    }

    public void setAdimageurl(String adimageurl) {
        this.adimageurl = adimageurl;
    }

    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }

    public List<String> getFuel() {
        return fuel;
    }

    public void setFuel(List<String> fuel) {
        this.fuel = fuel;
    }

    public Integer getNoofseats() {
        return noofseats;
    }

    public void setNoofseats(Integer noofseats) {
        this.noofseats = noofseats;
    }

    public Boolean getAdImage() {
        return adImage;
    }

    public void setAdImage(Boolean adImage) {
        this.adImage = adImage;
    }

    public String getVertical() {
        return vertical;
    }

    public void setVertical(String vertical) {
        this.vertical = vertical;
    }

    public Integer getNoofdoors() {
        return noofdoors;
    }

    public void setNoofdoors(Integer noofdoors) {
        this.noofdoors = noofdoors;
    }

    public List<String> getWheeldrive() {
        return wheeldrive;
    }

    public void setWheeldrive(List<String> wheeldrive) {
        this.wheeldrive = wheeldrive;
    }

    public List<String> getTransmission() {
        return transmission;
    }

    public void setTransmission(List<String> transmission) {
        this.transmission = transmission;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getWillhabencode() {
        return willhabencode;
    }

    public void setWillhabencode(String willhabencode) {
        this.willhabencode = willhabencode;
    }

    public Boolean getWarranty() {
        return warranty;
    }

    public void setWarranty(Boolean warranty) {
        this.warranty = warranty;
    }

    public List<String> getModel() {
        return model;
    }

    public void setModel(List<String> model) {
        this.model = model;
    }

    public List<String> getState() {
        return state;
    }

    public void setState(List<String> state) {
        this.state = state;
    }

    public List<String> getPartnerid() {
        return partnerid;
    }

    public void setPartnerid(List<String> partnerid) {
        this.partnerid = partnerid;
    }

    public List<String> getMake() {
        return make;
    }

    public void setMake(List<String> make) {
        this.make = make;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public Integer getRegistrationfirstyear() {
        return registrationfirstyear;
    }

    public void setRegistrationfirstyear(Integer registrationfirstyear) {
        this.registrationfirstyear = registrationfirstyear;
    }

    public List<Integer> getPostcode() {
        return postcode;
    }

    public void setPostcode(List<Integer> postcode) {
        this.postcode = postcode;
    }

    public List<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<String> equipment) {
        this.equipment = equipment;
    }

    public String getPt1() {
        return pt1;
    }

    public void setPt1(String pt1) {
        this.pt1 = pt1;
    }

    public Integer getOrgid() {
        return orgid;
    }

    public void setOrgid(Integer orgid) {
        this.orgid = orgid;
    }

    public List<String> getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(List<String> makeModel) {
        this.makeModel = makeModel;
    }

    public Integer getPt5() {
        return pt5;
    }

    public void setPt5(Integer pt5) {
        this.pt5 = pt5;
    }

    public Integer getPt7() {
        return pt7;
    }

    public void setPt7(Integer pt7) {
        this.pt7 = pt7;
    }

    public Integer getPt6() {
        return pt6;
    }

    public void setPt6(Integer pt6) {
        this.pt6 = pt6;
    }

    public Boolean getIsAdSavedInFolder() {
        return isAdSavedInFolder;
    }

    public void setIsAdSavedInFolder(Boolean isAdSavedInFolder) {
        this.isAdSavedInFolder = isAdSavedInFolder;
    }

    public Boolean getConditionreport() {
        return conditionreport;
    }

    public void setConditionreport(Boolean conditionreport) {
        this.conditionreport = conditionreport;
    }

    public Integer getEffect() {
        return effect;
    }

    public void setEffect(Integer effect) {
        this.effect = effect;
    }

    public List<String> getDistrict() {
        return district;
    }

    public void setDistrict(List<String> district) {
        this.district = district;
    }

    public List<String> getColour2() {
        return colour2;
    }

    public void setColour2(List<String> colour2) {
        this.colour2 = colour2;
    }

    public Integer getRegistrationfirst() {
        return registrationfirst;
    }

    public void setRegistrationfirst(Integer registrationfirst) {
        this.registrationfirst = registrationfirst;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public Integer getRegistrationfirstmonth() {
        return registrationfirstmonth;
    }

    public void setRegistrationfirstmonth(Integer registrationfirstmonth) {
        this.registrationfirstmonth = registrationfirstmonth;
    }

    public List<String> getDealer2() {
        return dealer2;
    }

    public void setDealer2(List<String> dealer2) {
        this.dealer2 = dealer2;
    }

    public String getMotorLevel0() {
        return motorLevel0;
    }

    public void setMotorLevel0(String motorLevel0) {
        this.motorLevel0 = motorLevel0;
    }

    public List<String> getMotorLevel1() {
        return motorLevel1;
    }

    public void setMotorLevel1(List<String> motorLevel1) {
        this.motorLevel1 = motorLevel1;
    }

}
