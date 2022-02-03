
package v2.vzdm.app.Models.Car;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AdvertDetails {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("uuid")
    @Expose
    private String uuid;
    @SerializedName("verticalId")
    @Expose
    private Integer verticalId;
    @SerializedName("adTypeId")
    @Expose
    private Integer adTypeId;
    @SerializedName("productId")
    @Expose
    private Integer productId;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("publishedDate")
    @Expose
    private String publishedDate;
    @SerializedName("firstPublishedDate")
    @Expose
    private String firstPublishedDate;
    @SerializedName("changedDate")
    @Expose
    private String changedDate;
    @SerializedName("advertiserReferenceNumber")
    @Expose
    private Object advertiserReferenceNumber;
    @SerializedName("attributes")
    @Expose
    private Attributes attributes;
    @SerializedName("advertImageList")
    @Expose
    private AdvertImageList advertImageList;
    @SerializedName("advertAttachmentList")
    @Expose
    private AdvertAttachmentList advertAttachmentList;
    @SerializedName("organisationDetails")
    @Expose
    private OrganisationDetails organisationDetails;
    @SerializedName("sellerProfileUserData")
    @Expose
    private SellerProfileUserData sellerProfileUserData;
    @SerializedName("advertAddressDetails")
    @Expose
    private AdvertAddressDetails advertAddressDetails;
    @SerializedName("advertContactDetails")
    @Expose
    private AdvertContactDetails advertContactDetails;
    @SerializedName("contextLinkList")
    @Expose
    private ContextLinkList contextLinkList;
    @SerializedName("taggingData")
    @Expose
    private TaggingData taggingData;
    @SerializedName("advertisingParameters")
    @Expose
    private AdvertisingParameters advertisingParameters;
    @SerializedName("advertisingParametersV2")
    @Expose
    private AdvertisingParametersV2 advertisingParametersV2;
    @SerializedName("dmpParameters")
    @Expose
    private DmpParameters dmpParameters;
    @SerializedName("dmpUserIdentities")
    @Expose
    private DmpUserIdentities dmpUserIdentities;
    @SerializedName("advertStatus")
    @Expose
    private AdvertStatus advertStatus;
    @SerializedName("advertEditStatusActionsList")
    @Expose
    private Object advertEditStatusActionsList;
    @SerializedName("seoMetaData")
    @Expose
    private SeoMetaData seoMetaData;
    @SerializedName("adServiceLandingPageLinks")
    @Expose
    private AdServiceLandingPageLinks adServiceLandingPageLinks;
    @SerializedName("adServiceDesktopLandingPageLinks")
    @Expose
    private AdServiceDesktopLandingPageLinks adServiceDesktopLandingPageLinks;
    @SerializedName("serviceBoxGroups")
    @Expose
    private List<ServiceBoxGroup> serviceBoxGroups = null;
    @SerializedName("daWidget")
    @Expose
    private DaWidget daWidget;
    @SerializedName("categoryTreeId")
    @Expose
    private Object categoryTreeId;
    @SerializedName("attributeInformation")
    @Expose
    private List<Object> attributeInformation = null;
    @SerializedName("facebookTrackingData")
    @Expose
    private FacebookTrackingData facebookTrackingData;
    @SerializedName("deleteReasonQueryParameter")
    @Expose
    private Object deleteReasonQueryParameter;
    @SerializedName("soldReasonQueryParameter")
    @Expose
    private Object soldReasonQueryParameter;
    @SerializedName("savedInFolder")
    @Expose
    private Boolean savedInFolder;
    @SerializedName("chatEnabled")
    @Expose
    private Boolean chatEnabled;
    @SerializedName("loginUUid")
    @Expose
    private String loginUUid;
    @SerializedName("tooltips")
    @Expose
    private List<Object> tooltips = null;
    @SerializedName("categoryXmlCode")
    @Expose
    private Object categoryXmlCode;
    @SerializedName("ownageTypeXmlCode")
    @Expose
    private Object ownageTypeXmlCode;
    @SerializedName("contactOption")
    @Expose
    private ContactOption contactOption;
    @SerializedName("breadcrumbs")
    @Expose
    private List<Breadcrumb> breadcrumbs = null;
    @SerializedName("inputSource")
    @Expose
    private Integer inputSource;
    @SerializedName("equipmentList")
    @Expose
    private EquipmentList equipmentList;
    @SerializedName("contactSuggestions")
    @Expose
    private ContactSuggestions contactSuggestions;
    @SerializedName("p2ppOptions")
    @Expose
    private P2ppOptions p2ppOptions;
    @SerializedName("disposed")
    @Expose
    private Integer disposed;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getVerticalId() {
        return verticalId;
    }

    public void setVerticalId(Integer verticalId) {
        this.verticalId = verticalId;
    }

    public Integer getAdTypeId() {
        return adTypeId;
    }

    public void setAdTypeId(Integer adTypeId) {
        this.adTypeId = adTypeId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getFirstPublishedDate() {
        return firstPublishedDate;
    }

    public void setFirstPublishedDate(String firstPublishedDate) {
        this.firstPublishedDate = firstPublishedDate;
    }

    public String getChangedDate() {
        return changedDate;
    }

    public void setChangedDate(String changedDate) {
        this.changedDate = changedDate;
    }

    public Object getAdvertiserReferenceNumber() {
        return advertiserReferenceNumber;
    }

    public void setAdvertiserReferenceNumber(Object advertiserReferenceNumber) {
        this.advertiserReferenceNumber = advertiserReferenceNumber;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public AdvertImageList getAdvertImageList() {
        return advertImageList;
    }

    public void setAdvertImageList(AdvertImageList advertImageList) {
        this.advertImageList = advertImageList;
    }

    public AdvertAttachmentList getAdvertAttachmentList() {
        return advertAttachmentList;
    }

    public void setAdvertAttachmentList(AdvertAttachmentList advertAttachmentList) {
        this.advertAttachmentList = advertAttachmentList;
    }

    public OrganisationDetails getOrganisationDetails() {
        return organisationDetails;
    }

    public void setOrganisationDetails(OrganisationDetails organisationDetails) {
        this.organisationDetails = organisationDetails;
    }

    public SellerProfileUserData getSellerProfileUserData() {
        return sellerProfileUserData;
    }

    public void setSellerProfileUserData(SellerProfileUserData sellerProfileUserData) {
        this.sellerProfileUserData = sellerProfileUserData;
    }

    public AdvertAddressDetails getAdvertAddressDetails() {
        return advertAddressDetails;
    }

    public void setAdvertAddressDetails(AdvertAddressDetails advertAddressDetails) {
        this.advertAddressDetails = advertAddressDetails;
    }

    public AdvertContactDetails getAdvertContactDetails() {
        return advertContactDetails;
    }

    public void setAdvertContactDetails(AdvertContactDetails advertContactDetails) {
        this.advertContactDetails = advertContactDetails;
    }

    public ContextLinkList getContextLinkList() {
        return contextLinkList;
    }

    public void setContextLinkList(ContextLinkList contextLinkList) {
        this.contextLinkList = contextLinkList;
    }

    public TaggingData getTaggingData() {
        return taggingData;
    }

    public void setTaggingData(TaggingData taggingData) {
        this.taggingData = taggingData;
    }

    public AdvertisingParameters getAdvertisingParameters() {
        return advertisingParameters;
    }

    public void setAdvertisingParameters(AdvertisingParameters advertisingParameters) {
        this.advertisingParameters = advertisingParameters;
    }

    public AdvertisingParametersV2 getAdvertisingParametersV2() {
        return advertisingParametersV2;
    }

    public void setAdvertisingParametersV2(AdvertisingParametersV2 advertisingParametersV2) {
        this.advertisingParametersV2 = advertisingParametersV2;
    }

    public DmpParameters getDmpParameters() {
        return dmpParameters;
    }

    public void setDmpParameters(DmpParameters dmpParameters) {
        this.dmpParameters = dmpParameters;
    }

    public DmpUserIdentities getDmpUserIdentities() {
        return dmpUserIdentities;
    }

    public void setDmpUserIdentities(DmpUserIdentities dmpUserIdentities) {
        this.dmpUserIdentities = dmpUserIdentities;
    }

    public AdvertStatus getAdvertStatus() {
        return advertStatus;
    }

    public void setAdvertStatus(AdvertStatus advertStatus) {
        this.advertStatus = advertStatus;
    }

    public Object getAdvertEditStatusActionsList() {
        return advertEditStatusActionsList;
    }

    public void setAdvertEditStatusActionsList(Object advertEditStatusActionsList) {
        this.advertEditStatusActionsList = advertEditStatusActionsList;
    }

    public SeoMetaData getSeoMetaData() {
        return seoMetaData;
    }

    public void setSeoMetaData(SeoMetaData seoMetaData) {
        this.seoMetaData = seoMetaData;
    }

    public AdServiceLandingPageLinks getAdServiceLandingPageLinks() {
        return adServiceLandingPageLinks;
    }

    public void setAdServiceLandingPageLinks(AdServiceLandingPageLinks adServiceLandingPageLinks) {
        this.adServiceLandingPageLinks = adServiceLandingPageLinks;
    }

    public AdServiceDesktopLandingPageLinks getAdServiceDesktopLandingPageLinks() {
        return adServiceDesktopLandingPageLinks;
    }

    public void setAdServiceDesktopLandingPageLinks(AdServiceDesktopLandingPageLinks adServiceDesktopLandingPageLinks) {
        this.adServiceDesktopLandingPageLinks = adServiceDesktopLandingPageLinks;
    }

    public List<ServiceBoxGroup> getServiceBoxGroups() {
        return serviceBoxGroups;
    }

    public void setServiceBoxGroups(List<ServiceBoxGroup> serviceBoxGroups) {
        this.serviceBoxGroups = serviceBoxGroups;
    }

    public DaWidget getDaWidget() {
        return daWidget;
    }

    public void setDaWidget(DaWidget daWidget) {
        this.daWidget = daWidget;
    }

    public Object getCategoryTreeId() {
        return categoryTreeId;
    }

    public void setCategoryTreeId(Object categoryTreeId) {
        this.categoryTreeId = categoryTreeId;
    }

    public List<Object> getAttributeInformation() {
        return attributeInformation;
    }

    public void setAttributeInformation(List<Object> attributeInformation) {
        this.attributeInformation = attributeInformation;
    }

    public FacebookTrackingData getFacebookTrackingData() {
        return facebookTrackingData;
    }

    public void setFacebookTrackingData(FacebookTrackingData facebookTrackingData) {
        this.facebookTrackingData = facebookTrackingData;
    }

    public Object getDeleteReasonQueryParameter() {
        return deleteReasonQueryParameter;
    }

    public void setDeleteReasonQueryParameter(Object deleteReasonQueryParameter) {
        this.deleteReasonQueryParameter = deleteReasonQueryParameter;
    }

    public Object getSoldReasonQueryParameter() {
        return soldReasonQueryParameter;
    }

    public void setSoldReasonQueryParameter(Object soldReasonQueryParameter) {
        this.soldReasonQueryParameter = soldReasonQueryParameter;
    }

    public Boolean getSavedInFolder() {
        return savedInFolder;
    }

    public void setSavedInFolder(Boolean savedInFolder) {
        this.savedInFolder = savedInFolder;
    }

    public Boolean getChatEnabled() {
        return chatEnabled;
    }

    public void setChatEnabled(Boolean chatEnabled) {
        this.chatEnabled = chatEnabled;
    }

    public String getLoginUUid() {
        return loginUUid;
    }

    public void setLoginUUid(String loginUUid) {
        this.loginUUid = loginUUid;
    }

    public List<Object> getTooltips() {
        return tooltips;
    }

    public void setTooltips(List<Object> tooltips) {
        this.tooltips = tooltips;
    }

    public Object getCategoryXmlCode() {
        return categoryXmlCode;
    }

    public void setCategoryXmlCode(Object categoryXmlCode) {
        this.categoryXmlCode = categoryXmlCode;
    }

    public Object getOwnageTypeXmlCode() {
        return ownageTypeXmlCode;
    }

    public void setOwnageTypeXmlCode(Object ownageTypeXmlCode) {
        this.ownageTypeXmlCode = ownageTypeXmlCode;
    }

    public ContactOption getContactOption() {
        return contactOption;
    }

    public void setContactOption(ContactOption contactOption) {
        this.contactOption = contactOption;
    }

    public List<Breadcrumb> getBreadcrumbs() {
        return breadcrumbs;
    }

    public void setBreadcrumbs(List<Breadcrumb> breadcrumbs) {
        this.breadcrumbs = breadcrumbs;
    }

    public Integer getInputSource() {
        return inputSource;
    }

    public void setInputSource(Integer inputSource) {
        this.inputSource = inputSource;
    }

    public EquipmentList getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(EquipmentList equipmentList) {
        this.equipmentList = equipmentList;
    }

    public ContactSuggestions getContactSuggestions() {
        return contactSuggestions;
    }

    public void setContactSuggestions(ContactSuggestions contactSuggestions) {
        this.contactSuggestions = contactSuggestions;
    }

    public P2ppOptions getP2ppOptions() {
        return p2ppOptions;
    }

    public void setP2ppOptions(P2ppOptions p2ppOptions) {
        this.p2ppOptions = p2ppOptions;
    }

    public Integer getDisposed() {
        return disposed;
    }

    public void setDisposed(Integer disposed) {
        this.disposed = disposed;
    }

}
