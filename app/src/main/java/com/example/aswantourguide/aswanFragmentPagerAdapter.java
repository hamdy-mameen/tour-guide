package com.example.aswantourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class aswanFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context mContext ;
    public aswanFragmentPagerAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext=context;
        
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0)
        return new attractionsFragment();
        else if(position==1)
            return new hotelsFragment();
        else if (position==2)
            return new restaurantsFragment();
        else
            return new shoppingFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }


    public CharSequence getPageTitle(int position) {
        if (position==0)
        return mContext.getString(R.string.attractions_title) ;
        else if (position==1)
            return mContext.getString(R.string.hotels_title);
        else if (position==2)
            return mContext.getString(R.string.restaurants_title);
        else
            return mContext.getString(R.string.shopping_title);
    }
}
