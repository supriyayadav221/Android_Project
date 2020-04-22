 package com.example.sumup;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

 public class MainActivity extends AppCompatActivity {
     private Toolbar toolbar;
     private ViewPager viewPager;
     private view_page_adapter adapter;
     private TabLayout tabLayout;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         toolbar = findViewById(R.id.toolbar);
         setSupportActionBar(toolbar);
         viewPager = findViewById(R.id.pager);
         adapter = new view_page_adapter(getSupportFragmentManager());
         adapter.addFragment(new Fragment1(), "ONE");
         adapter.addFragment(new fragment2(), "TWO");
         viewPager.setAdapter(adapter);
         //adapter.notifyDataSetChanged();
         tabLayout = findViewById(R.id.tabs);
         tabLayout.setupWithViewPager(viewPager);
         viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

             @Override
             public void onPageSelected(int position) {
                 adapter.getItem(position).onResume();
             }

             @Override
             public void onPageScrolled(int arg0, float arg1, int arg2) {
             }

             @Override
             public void onPageScrollStateChanged(int arg0) {
             }
         });


     }





 }
