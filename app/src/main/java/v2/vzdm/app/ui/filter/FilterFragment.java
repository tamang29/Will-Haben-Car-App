package v2.vzdm.app.ui.filter;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

import v2.vzdm.app.Activities.LoginActivity;
import v2.vzdm.app.Models.SwitchAPI;
import v2.vzdm.app.R;
import v2.vzdm.app.Utils.Session;
import v2.vzdm.app.Webservices.ApiInterface;
import v2.vzdm.app.Webservices.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class FilterFragment extends PreferenceFragmentCompat {
    private Session session;
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences,rootKey);

        Preference myPref = (Preference) findPreference("api_preference");
        Preference logout = (Preference) findPreference("logout_preference");
        myPref.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                if(preference.getSharedPreferences().getBoolean("api_preference",true)){
                                    ApiInterface apiInterface = ServiceGenerator.createService(ApiInterface.class);
                Call<SwitchAPI> call = apiInterface.getApiStatus();
                call.enqueue(new Callback<SwitchAPI>() {
                    @Override
                    public void onResponse(Call<SwitchAPI> call, Response<SwitchAPI> response) {
                        if(response.isSuccessful()){
                                SwitchAPI obj = response.body();
                                try {
                                    if (obj.getOn()) {
                                        Log.d(getTag(), "msg" + obj.getOn());
                                        Toast.makeText(getContext(), "Api On", Toast.LENGTH_SHORT).show();
                                    }
                                }catch (Exception ex){
                                    Log.d(getTag(),""+ex);
                                }


                        }
                    }

                    @Override
                    public void onFailure(Call<SwitchAPI> call, Throwable t) {
                        //Toast.makeText(getContext(),"Failed",Toast.LENGTH_SHORT).show();
                    }
                });
                }
                else{
                    Toast.makeText(getContext(),"Disabled",Toast.LENGTH_SHORT).show();
                }


                return false;
            }
        });

        logout.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                endSession();
                return true;
            }
        });
    }
    public void endSession() {

        session = new Session(getContext());
        if(session.getRememberToken() != null) {
            session.logout();
        }
        Toast.makeText(getContext() , "Logged Out", Toast.LENGTH_SHORT).show();


        Intent intent = new Intent(getContext(), LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);



    }
}