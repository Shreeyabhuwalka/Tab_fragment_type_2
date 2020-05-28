package com.developer.tabfragmentusingemptyactivity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdaptor extends FragmentPagerAdapter {
    private int noOfTabs;
    public PageAdaptor(@NonNull FragmentManager fm,int noOfTabs) {
        super(fm);
        this.noOfTabs = noOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                // sample fragment needs to be changed
                return new TabFragment1();
            case 1:
                // sample fragment needs to be changed
                return new TabFragment2();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}
