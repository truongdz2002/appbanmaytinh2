package com.example.appbanmaytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.appbanmaytinh.Package.RegisterActivity;
import com.example.appbanmaytinh.computer.database.khDBHelper;

public class MainActivitylogin extends AppCompatActivity {
    Button login , btnRegister;
    EditText edGmailLogin, edPasswordLogin;
    khDBHelper khDBHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitylogin);
        login = findViewById(R.id.login);
        btnRegister = findViewById(R.id.Register);
        edGmailLogin = findViewById(R.id.edGmailLogin);
        edPasswordLogin = findViewById(R.id.edPasswordLogin);

        khDBHelper = new khDBHelper(MainActivitylogin.this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivitylogin.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivitylogin.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

//    private void checkValidateForm() {
//        if (gmail.getText().toString().trim().matches(emailPattern) && password.getText().toString().trim().equals(rePassword.getText().toString().trim()) && !password.getText().toString().trim().equals("") && !rePassword.getText().toString().trim().equals("")) {
//            btnRegister.setEnabled(true);
//        } else {
//            btnRegister.setEnabled(false);
//        }
//    }
}