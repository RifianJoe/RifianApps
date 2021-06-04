package com.rifiandev.rifianapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class walkthrough extends AppCompatActivity {
    private ViewPager pager;
    private PagerAdapter pagerAdapter;

    TextView tv_page_counter;
    Button button1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);

        List<Fragment> List = new ArrayList<>();
        List.add(new walkthrough1());
        List.add(new walkthrough2());
        List.add(new walkthrough3());

        tv_page_counter = findViewById(R.id.defaultPager);


        pager = findViewById(R.id.viewPager);
        pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(),List);

        pager.setAdapter(pagerAdapter);


    }

    public void pindahHome(View view){
        Intent intent2 = new Intent(walkthrough.this,Menu.class);
        startActivity(intent2);
        finish();

    }

}