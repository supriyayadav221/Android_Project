package com.example.sumup;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class view_page_adapter extends FragmentPagerAdapter {
    private final List<Fragment> mList = new ArrayList<>();
    private final List<String> mTitleList = new ArrayList<>();
    public view_page_adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
   notifyDataSetChanged();
        return mList.get(i);
    }
    public void addFragment(Fragment fragment, String title) {
        notifyDataSetChanged();
        mList.add(fragment);
        mTitleList.add(title);
    }
    @Override
    public int getCount() {
        return 2;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return mTitleList.get(position);
    }
}
