package v2.vzdm.app.Webservices;



import v2.vzdm.app.Models.Item;
import v2.vzdm.app.Models.NotificationCount;
import v2.vzdm.app.Models.SwitchAPI;
import v2.vzdm.app.Models.User;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {


    @GET("car")
    Call <List<Item>> getItemList();

    @POST("login")
    Call<User> login(@Body User user);

    @GET("countnoti")
    Call<NotificationCount> getNotificationCount();

    @GET("notification")
    Call <List<Item>> getNoticationList();

    @GET("switchapi")
    Call <SwitchAPI> getApiStatus();


}
