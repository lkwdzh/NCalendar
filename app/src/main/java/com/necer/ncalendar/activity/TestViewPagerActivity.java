package com.necer.ncalendar.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.necer.ncalendar.R;
import com.necer.ncalendar.adapter.ViewPagerAdapter;
import com.necer.ncalendar.fragment.Fragment1;
import com.necer.ncalendar.fragment.Fragment2;
import com.necer.ncalendar.fragment.Fragment3;

import java.util.ArrayList;
import java.util.List;

public class TestViewPagerActivity extends AppCompatActivity {


    private ViewPager viewPager;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tl_tabs);


        List<Fragment> fragments = new ArrayList<>();
        List<String> titles = new ArrayList<>();
        fragments.add(new Fragment1());
        fragments.add(new Fragment2());
        fragments.add(new Fragment3());
        titles.add("今天");
        titles.add("当月");
        titles.add("今年");

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), fragments, titles);

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
