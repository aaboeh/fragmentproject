package com.example.viikko11;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class TabPagerAdapter extends FragmentStateAdapter{
    public TabPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new MainPageFragment();
        } else if (position == 1) {
            return new AddGroceryFragment();
        } else if (position == 2) {
            return new ListGroceryFragment();
        } else {
            return new MainPageFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
