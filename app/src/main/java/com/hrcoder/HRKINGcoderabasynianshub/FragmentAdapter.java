package com.hrcoder.HRKINGcoderabasynianshub;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0: return new event_fragment();
            case 1: return new gpa_Fragment();
            case 2: return new pp_fragment();
            default: return new event_fragment();


        }
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title=null;
        if (position==0)
        {
            title="Home";
        }
        else if(position==1)
        {
            title="Calculate";
        }
        else if(position==2)
        {
            title="Study Point";
        }
        return title;
    }
}
