package v2.vzdm.app.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import io.github.muddz.styleabletoast.StyleableToast;
import v2.vzdm.app.Models.User;
import v2.vzdm.app.R;
import v2.vzdm.app.Webservices.ApiInterface;
import v2.vzdm.app.Webservices.ServiceGenerator;

import v2.vzdm.app.Utils.Session;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "LoginActivity";
    ImageView backButton;
    TextView registration_link;
    EditText email, password;
    Button insert_button;


    private Session session;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        checkSession();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        insert_button = (Button) findViewById(R.id.requestLogin);
        insert_button.setOnClickListener(this);



        onBackPress();

    }

    public void checkSession(){
        session = new Session(getApplicationContext());
        if(session.getRememberToken() != null){
        Intent intent = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(intent);
        }
    }

    public void onBackPress() {
        backButton = findViewById(R.id.backBtn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                LoginActivity.super.onBackPressed();
            }
        });

    }

    @Override
    public void onClick(View view){
        if(view.getId() == R.id.requestLogin){
            if(!TextUtils.isEmpty(email.getText().toString()) && !TextUtils.isEmpty(password.getText().toString()))
            {

                final User user = new User();
                user.setEmail(email.getText().toString());
                user.setPassword(password.getText().toString());

                ApiInterface apiInterface = ServiceGenerator.createService(ApiInterface.class);
                Call<User> call = apiInterface.login(user);

                call.enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        if(response.isSuccessful()){


                                    session = new Session(getApplicationContext());
                                    session.setRememberToken(response.body().getRemember_token());

                            StyleableToast.makeText(LoginActivity.this,"Login Success",R.style.successToast).show();
                                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                                    intent.putExtra("email", email.getText().toString().trim());
                                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                    startActivity(intent);

                        }
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {

                        StyleableToast.makeText(LoginActivity.this,"Login Failed",R.style.failedToast).show();

//                        Toast toast = Toast.makeText(LoginActivity.this,"Login Failed",Toast.LENGTH_SHORT);
//
//
//                        View toastView = toast.getView();
//                        toastView.getBackground().setColorFilter(R.drawable.toast_drawable, PorterDuff.Mode.SRC_IN);
//
//                        toast.show();

                        //Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }
    }


//    public void onRegisterClick() {
//        registration_link = (TextView) findViewById(R.id.registration);
//        registration_link.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        });
//    }




}
