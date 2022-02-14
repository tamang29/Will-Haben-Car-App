package v2.vzdm.app.Utils;

import android.app.Activity;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import v2.vzdm.app.Activities.MainActivity;
import v2.vzdm.app.Models.NotificationCount;
import v2.vzdm.app.R;
import v2.vzdm.app.Webservices.ApiInterface;
import v2.vzdm.app.Webservices.ServiceGenerator;
import v2.vzdm.app.ui.home.HomeFragment;

public class Functions {
    private static final String TAG = "AutoApp";
    public static void updateNotification(Context context, TextView notificationCounter, View view, Activity activity){
        ApiInterface apiInterface = ServiceGenerator.createService(ApiInterface.class);
        Call<NotificationCount> call = apiInterface.getNotificationCount();
        call.enqueue(new Callback<NotificationCount>() {
            @Override
            public void onResponse(Call<NotificationCount> call, Response<NotificationCount> response) {
                if(response.isSuccessful()){
                    //showNotification();
                    if(context!=null) {
                        String notificationCount = response.body().getNotificationCount();
                        int noticount = Integer.parseInt(notificationCount);
                        Session session;
                        session = new Session(context);


                        Log.d(TAG,"notification number"+noticount);

                        if (noticount >9) {
                            notificationCounter.setText("9+");
                        }
                        else{
                            notificationCounter.setText(notificationCount);
                        }
                        if(!notificationCount.equals(session.getnotificationCount())){
                            ToneGenerator toneGenerator = new ToneGenerator(AudioManager.STREAM_MUSIC, 100);
                            toneGenerator.startTone(ToneGenerator.TONE_CDMA_PIP, 150);


                            //showNotification(view,activity);
                        }
                        session.setNotificationCount(notificationCount);





                    }

                }
            }

            @Override
            public void onFailure(Call<NotificationCount> call, Throwable t) {
                Log.d(TAG, "Fail to get noti");

            }
        });
    }
    public static void showNotification(View view, Activity activity){
        if(view.getContext()!=null) {
            NotificationManager mNotificationManager =
                    (NotificationManager)activity.getSystemService(Context.NOTIFICATION_SERVICE);
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                NotificationChannel channel = new NotificationChannel("YOUR_CHANNEL_ID",
                        "VZDM App",
                        NotificationManager.IMPORTANCE_DEFAULT);
                channel.setDescription("YOUR_NOTIFICATION_CHANNEL_DESCRIPTION");
                mNotificationManager.createNotificationChannel(channel);
            }
            NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(view.getContext(), "YOUR_CHANNEL_ID")
                    .setSmallIcon(R.drawable.call_button)
                    .setContentTitle("VZDM App")
                    .setContentText("New Car Available")
                    .setAutoCancel(true);
            Intent intent = new Intent(view.getContext(), MainActivity.class);
            PendingIntent pi = PendingIntent.getActivity(view.getContext(), 1, intent, PendingIntent.FLAG_UPDATE_CURRENT);

            mBuilder.setContentIntent(pi);
            mNotificationManager.notify(0, mBuilder.build());
        }
    }

}
