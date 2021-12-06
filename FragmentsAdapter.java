package com.example.foodapp.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.foodapp.fragments.CharityFragment;
import com.example.foodapp.fragments.DonationFragment;
import com.example.foodapp.fragments.VolunteerFragment;

public class FragmentsAdapter extends FragmentPagerAdapter {

    public FragmentsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new DonationFragment();
            case 1: return new VolunteerFragment();
            case 2: return new CharityFragment();
            default: return  new DonationFragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if(position==0){
            title= "DONATIONS";
        }
        if(position==1){
            title= "VOLUNTEER";
        }
        if(position==2){
            title= "CHARITY";
        }

        return title;
    }
}
