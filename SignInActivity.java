package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignInActivity extends AppCompatActivity {
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        getSupportActionBar().hide();


        login=findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SignInActivity.this, DonorActivity.class );

                startActivity(intent);
            }
        });
    }
}