package com.rifiandev.rifianapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {

    private ViewPager pager;
    private PagerAdapter pagerAdapter;

    TextView tv_page_counter;
    Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        List<Fragment> List = new ArrayList<>();
        List.add(new Home());
        List.add(new Daily());
        List.add(new Gallery());
        List.add(new Favorite());
        List.add(new Profile());




        pager = findViewById(R.id.viewPager2);
        pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(),List);

        pager.setAdapter(pagerAdapter);

        BottomNavigationView bn = findViewById(R.id.bottomNavigation);
        bn.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;
             switch (item.getItemId()) {
                 case R.id.home:
                     ;
                     fragment = new Home();
                     break;

                 case R.id.daily:
                     ;
                     fragment = new Daily();
                     break;

                 case R.id.gallery:
                     ;
                     fragment = new Gallery();
                     break;

                 case R.id.favorite:
                     ;
                     fragment = new Favorite();
                     break;

                 case R.id.profile:
                     ;
                     fragment = new Profile();
                     break;

             }
             return getFragmentPage(fragment);


             }
        });



    }

    private boolean getFragmentPage(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.defaultPager2, fragment)
                    .commit();
            return true;
        }
        return false;


    }
}