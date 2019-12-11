package com.example.group12_f2019_mad3125_fp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.group12_f2019_mad3125_fp.R;

import static android.text.TextUtils.isEmpty;

public class LoginActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Name = (EditText) findViewById(R.id.txt_email);
        Password = (EditText) findViewById(R.id.txt_password);
        Login = (Button) findViewById(R.id.btn_login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }


    private void validate(String userName, String userPassword) {
        if ((userName.equals("user@employee.com")) && (userPassword.equals("s3cr3t"))) {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }


        if (userName.isEmpty() && userPassword.equals("s3cr3t")) {
            Name.setError("empty");
        } else if (userName.equals("user@employee.com") && userPassword.isEmpty()) {
            Password.setError("empty");
        } else if (userName.equals("user@employee.com") && userPassword != "s3cr3t") {
            Password.setError("invalid password");
        } else if (userName != "user@employee.com" && userPassword.equals("s3cr3t")) {
            Name.setError("invalid username");
        } else
        {

            Name.setError("invalid username");
            Password.setError("invalid password");

        }
    }
}
