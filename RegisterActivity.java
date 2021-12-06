package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {
    private Button login;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();

        login=findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent= new Intent(RegisterActivity.this, SignInActivity.class );
                startActivity(intent);
            }
        });
        register=findViewById(R.id.btn_register);
        register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent= new Intent(RegisterActivity.this, SignUpActivity.class );
                startActivity(intent);
            }
        });
    }
} 