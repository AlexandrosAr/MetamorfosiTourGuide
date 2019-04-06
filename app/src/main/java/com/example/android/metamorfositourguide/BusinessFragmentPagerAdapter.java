package com.example.android.metamorfositourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class BusinessFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public BusinessFragmentPagerAdapter(Context context, FragmentManager fm){

        super(fm);
        mContext = context;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return mContext.getString(R.string.tab_to_eat);
        } else if(position==1){
            return mContext.getString(R.string.tab_to_drink);
        } else if(position==2){
            return mContext.getString(R.string.tab_to_sleep);
        } else {
            return mContext.getString(R.string.tab_to_visit);
        }
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new ToEatFragment();
        } else if(position == 1){
            return new ToDrinkFragment();
        } else if(position == 2){
            return new ToSleepFragment();
        } else {
            return new ToVisitFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
