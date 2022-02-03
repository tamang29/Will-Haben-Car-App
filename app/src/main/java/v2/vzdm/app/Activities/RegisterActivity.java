package v2.vzdm.app.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import v2.vzdm.app.R;
import v2.vzdm.app.Models.User;
import v2.vzdm.app.Utils.Session;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;



public class RegisterActivity extends AppCompatActivity {

    private TextInputLayout textUserLayout;
    private TextInputLayout textEmailLayout;
    private TextInputLayout textPasswordLayout;
    private TextInputLayout textConfirmLayout;
    private Button signup;
    private ProgressDialog loadingScreen;
    private Session session;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        checkSession();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        textUserLayout = findViewById(R.id.username_input_layout);
        textEmailLayout = findViewById(R.id.email_input_layout);
        textPasswordLayout = findViewById(R.id.password_input_layout);
        textConfirmLayout = findViewById(R.id.confirm_input_layout);
        loadingScreen = new ProgressDialog(this);
        signup = findViewById(R.id.signupBtn);

        signup.setOnClickListener(v -> confirmInput());
        showTextInColor();
        onClickLogin();
//        onBackPress();


    }
    public void checkSession(){
        session = new Session(getApplicationContext());
        if(session.getUserEmail() != null){
            Intent intent = new Intent(RegisterActivity.this,MainActivity.class);
            startActivity(intent);
        }
    }
//    public void onBackPress() {
//        ImageView backButton = findViewById(R.id.backBtn);
//        backButton.setOnClickListener(v -> RegisterActivity.super.onBackPressed());
//
//    }

    private void onClickLogin() {
        TextView question = (TextView)findViewById(R.id.question);
        String text = question.getText().toString().trim();

        SpannableString ss = new SpannableString(text);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);

            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.rgb(214,39,81));
                ds.setUnderlineText(false);
            }
        };
        ss.setSpan(clickableSpan,20,30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        question.setText(ss);
        question.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void showTextInColor() {
        TextView terms = findViewById(R.id.termsAndCondition);
        String text = terms.getText().toString().trim();

        SpannableString ss = new SpannableString(text);

        ForegroundColorSpan fcRed = new ForegroundColorSpan(Color.rgb(214,39,81));
        ForegroundColorSpan fcRedSame = new ForegroundColorSpan(Color.rgb(214,39,81));

        ss.setSpan(fcRed,38,57, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(fcRedSame,84,98,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        terms.setText(ss);

    }

    private boolean validateUsername(){
        String username = textUserLayout.getEditText().getText().toString().trim();

        if(username.isEmpty()){
            textUserLayout.setError("Field can't be empty");
            return false;
        }
        else if(username.length()>20){
            textUserLayout.setError("Username too long");
            return false;
        }
        else {
            textUserLayout.setError(null);
            return true;
        }
    }

    private boolean validateEmail(){
        String email = textEmailLayout.getEditText().getText().toString().trim();
        if(email.isEmpty()){
            textEmailLayout.setError("Field can't be empty");
            return false;
        }
        else if(email.length()>50){
            textEmailLayout.setError("too long");
            return false;
        }
        else {
            textEmailLayout.setError(null);
            return true;
        }
    }

    private boolean validatePassword(){
        String password = textPasswordLayout.getEditText().getText().toString().trim();
        if(password.isEmpty()){
            textPasswordLayout.setError("Field can't be empty");
            return false;
        }else if(password.length()<8){
            textPasswordLayout.setError("Password length should atleast be 8");
            return false;
        }
        else {
            textPasswordLayout.setError(null);
            return true;
        }
    }

    private boolean validateConfirmPassword(){
        String password = textPasswordLayout.getEditText().getText().toString().trim();
        String confirm = textConfirmLayout.getEditText().getText().toString().trim();

        if(confirm.isEmpty()){
            textConfirmLayout.setError("Field can't be empty");
            return false;
        }else if(!confirm.equals(password)){
            textConfirmLayout.setError("Confirm password doesn't match");
            return false;
        }
        else {
            textConfirmLayout.setError(null);
            return true;
        }
    }

    public void confirmInput(){

        if(!validateUsername() |!validateEmail() | !validatePassword() | !validateConfirmPassword()){
            return;
        }else{


            String username = textUserLayout.getEditText().getText().toString();
            String email = textEmailLayout.getEditText().getText().toString();
            String password = textPasswordLayout.getEditText().getText().toString();
            String confirm = textConfirmLayout.getEditText().getText().toString();


            final User user = new User();
            user.setUsername(username);
            user.setEmail(email);
            user.setPassword(password);
            user.setConfirm_password(confirm);
            //saveSighupDb(user);


        }
    }

//    private void saveSighupDb(final User user) {
//        final String TAG = RegisterActivity.class.getSimpleName();
//
//
//        final DatabaseReference RootRef;
//        final FirebaseAuth firebaseAuth;
//        firebaseAuth = FirebaseAuth.getInstance();
//        RootRef = FirebaseDatabase.getInstance().getReference("User");
//
//
//        firebaseAuth.createUserWithEmailAndPassword(user.getEmail(), user.getPassword())
//                .addOnCompleteListener(task -> {
//                    if(task.isSuccessful()) {
//
//                        RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
//                            @Override
//                            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                                if((snapshot.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child(user.getUsername()).exists())){
//                                    Toast.makeText(RegisterActivity.this,"This username already exists.",Toast.LENGTH_LONG).show();
//
//                                }
//                                else {
//                                    RootRef.child(FirebaseAuth.getInstance().getCurrentUser().getUid())
//                                            .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
//                                        @Override
//                                        public void onComplete(@NonNull Task<Void> task) {
//                                            Toast.makeText(RegisterActivity.this, "Congratulations your account has been created.", Toast.LENGTH_LONG).show();
//                                            Intent intent = new Intent(RegisterActivity.this, MainActivity  .class);
//                                            startActivity(intent);
//                                            finish();
//                                        }
//                                    });
//                                }
//                            }
//
//
//                            @Override
//                            public void onCancelled(@NonNull DatabaseError error) {
//
//                            }
//                        });
//                    }
//
//
//                    else{
//                        Toast.makeText(RegisterActivity.this, "Username or Email already exists", Toast.LENGTH_LONG).show();
//                    }
//                });
//
//    }
}