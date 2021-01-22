package com.example.whatsapp_ui.adapters;



import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.whatsapp_ui.CallsFragment;
import com.example.whatsapp_ui.ChatsFragment;
import com.example.whatsapp_ui.StatusFragment;

import java.util.ArrayList;
import java.util.List;

public  class PagerAdapter extends FragmentStatePagerAdapter {

    private int numOfTabs;
    private List<String> stringList = new ArrayList<>();

    public PagerAdapter(@NonNull FragmentManager fm, int numOfTabs) {
        super(fm, numOfTabs);
        this.numOfTabs = numOfTabs;
        stringList.add(ChatsFragment.title);
        stringList.add(StatusFragment.title);
        stringList.add(CallsFragment.title);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new ChatsFragment() ;
            case 1 :
                return new StatusFragment();
            case 2 :
                return new CallsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return stringList.get(position);
    }

}
