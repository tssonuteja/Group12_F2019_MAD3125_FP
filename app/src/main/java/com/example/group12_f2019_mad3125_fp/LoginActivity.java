package com.example.group12_f2019_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText Email;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Email = (EditText) findViewById(R.id.txt_email);
        Password = (EditText) findViewById(R.id.txt_password);
        Login = (Button) findViewById(R.id.btn_login);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }


        });
    }
}

