package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class VolunteerFormActivity extends AppCompatActivity {

    private TextView TextViewPickup;
    private TextView TextViewDropoff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer_form);



        TextViewPickup=findViewById(R.id.textView_pickup);
        TextViewPickup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent= new Intent(VolunteerFormActivity.this, MapsActivity.class );

                startActivity(intent);
            }
        });

        TextViewDropoff=findViewById(R.id.textView_dropoff);
        TextViewDropoff.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent= new Intent(VolunteerFormActivity.this, MapsActivity.class );

                startActivity(intent);
            }
        });
    }

}