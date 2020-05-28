package com.developer.tabfragmentusingemptyactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout mTabLayout;
    TabItem tabCurrent,tabRequest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabLayout = findViewById(R.id.tabLayoutId);
        tabCurrent = findViewById(R.id.tab_current_menu);
        tabRequest = findViewById(R.id.tab_requests);

        final ViewPager viewPager = findViewById(R.id.view_pager);
        PageAdaptor pagerAdaptor = new PageAdaptor(
                getSupportFragmentManager(),mTabLayout.getTabCount());
        viewPager.setAdapter(pagerAdaptor);
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
