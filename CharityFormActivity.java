package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class CharityFormActivity extends AppCompatActivity {
    Spinner qspinner;
    private TextView MtxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charity_form);

        qspinner = (Spinner) findViewById(R.id.Qfoodspinner);
        String quantity = qspinner.getSelectedItem().toString();

        MtxtView=findViewById(R.id.mapTextView);
        MtxtView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent= new Intent(CharityFormActivity.this, MapsActivity.class );

                startActivity(intent);
            }
        });
    }
}