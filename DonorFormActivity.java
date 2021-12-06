package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DonorFormActivity extends AppCompatActivity {
    Spinner qspinner;
    Spinner tspinner;
    private TextView MtxtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_form);

        qspinner = (Spinner) findViewById(R.id.Qfoodspinner);
        String quantity = qspinner.getSelectedItem().toString();

        tspinner = (Spinner) findViewById(R.id.Tfoodspinner);
        String type = qspinner.getSelectedItem().toString();

        MtxtView=findViewById(R.id.mapTextView);
        MtxtView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent= new Intent(DonorFormActivity.this, MapsActivity.class );

                startActivity(intent);
            }
        });


    }



}