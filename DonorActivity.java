package com.example.foodapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.foodapp.Adapters.FragmentsAdapter;
import com.example.foodapp.databinding.ActivityDonorBinding;

public class DonorActivity extends AppCompatActivity {
   ActivityDonorBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDonorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.viewpagerdonor.setAdapter(new FragmentsAdapter(getSupportFragmentManager()));
        binding.tablayoutdonor.setupWithViewPager(binding.viewpagerdonor);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.menu ,menu);
        return true;
    }
    public  boolean onOptionsItemSelected(MenuItem item){
        int id =item.getItemId();

        if(id == R.id.settings){
            Intent intent = new Intent(DonorActivity.this, SettingsActivity.class);
            startActivity(intent);
            return  true;
        }

        else if(id == R.id.privacy){
            Intent intent = new Intent(DonorActivity.this, PrivacyPolicyActivity.class);
            startActivity(intent);
            return  true;
        }
        else if(id == R.id.availablity){
            Intent intent = new Intent(DonorActivity.this, MapsActivity.class);
            startActivity(intent);
            return  true;
        }
        else if(id == R.id.message){
            Intent intent = new Intent(DonorActivity.this, MessageActivity.class);
            startActivity(intent);
            return  true;
        }
        return super.onOptionsItemSelected(item);
    }
}