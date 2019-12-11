package com.example.group12_f2019_mad3125_fp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.group12_f2019_mad3125_fp.R;

import static android.text.TextUtils.isEmpty;

public class LoginActivity extends AppCompatActivity {

    private String username;
    private String password;
    private EditText Email;
    private EditText Password;
    private Button Login;
    Preference preference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        preference = new Preference(this);

        Email = (EditText) findViewById(R.id.txt_email);
        Password = (EditText) findViewById(R.id.txt_password);
        Login = (Button) findViewById(R.id.btn_login);

    }

    public void onLoginClick(View view){
        String sEmail = Email.getText().toString();
        String sPswd = Password.getText().toString();
        if (isEmpty(sEmail) || isEmpty(sPswd)){
            Toast.makeText(this, "Fields cannot be empty", Toast.LENGTH_SHORT).show();
        } else {
            if (!Patterns.EMAIL_ADDRESS.matcher(sEmail).matches()){
                Email.setError("Invalid email");
            } else {
                if (sEmail.equals(username) && sPswd.equals(password)){
                    loginSuccess();
                } else {
                    Toast.makeText(this, "Invalid email/password", Toast.LENGTH_SHORT).show();
                    Email.requestFocus();
                }
            }
        }

    }

    private void loginSuccess() {

        //preference.put("isLoggedIn", true);
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}



