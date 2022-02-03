package v2.vzdm.app.Utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Session {

    SharedPreferences prefs;
    SharedPreferences.Editor editor;

    public Session(Context context) {
        prefs = PreferenceManager.getDefaultSharedPreferences(context);
        editor = prefs.edit();
    }
    public void setUserEmail(String userEmail){
        prefs.edit().putString("userEmail",userEmail).apply();
    }
    public String getUserEmail(){
        String userEmail = prefs.getString("userEmail",null);
        return userEmail;
    }
    public void setRememberToken(String rememberToken){
        prefs.edit().putString("rememberToken",rememberToken).apply();
    }
    public String getRememberToken(){
        String rememberToken = prefs.getString("rememberToken",null);
        return rememberToken;
    }
    public String getnotificationCount(){
        String notification = prefs.getString("notificationCount",null);
        return notification;
    }
    public void setNotificationCount(String notificationCount){
        prefs.edit().putString("notificationCount",notificationCount).apply();
    }
    public void logout() {

        editor.putString("userEmail", null).commit();
        editor.putString("rememberToken",null).commit();
    }
}