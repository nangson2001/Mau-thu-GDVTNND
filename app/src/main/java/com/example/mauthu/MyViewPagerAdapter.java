package com.example.mauthu;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.mauthu.fragment.Fragment1Of1;
import com.example.mauthu.fragment.Fragment2Of1;
import com.example.mauthu.fragment.Fragment3Of1;

public class MyViewPagerAdapter extends FragmentStateAdapter {


    public MyViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Fragment1Of1();
            case 1:
                return new Fragment2Of1();
            case 2:
                return new Fragment3Of1();
            default:
                return new Fragment1Of1();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
