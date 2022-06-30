package com.nareshittechnologies.tabnavigation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private ViewPager vp;
    private TabLayout tl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp = findViewById(R.id.viewpager);
        tl = findViewById(R.id.tabLayout);
        vp.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        tl.setupWithViewPager(vp);
    }

    class ViewPagerAdapter extends FragmentStatePagerAdapter{

        public ViewPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new RedFragment();
                case 1:
                    return new BlueFragment();
                case 2:
                    return new GreenFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0: return "RED";
                case 1: return "BLUE";
                case 2: return "GREEN";
            }
            return super.getPageTitle(position);
        }
    }


    // TODO 1: Set up ViewPager (add viewPager to the activity_main.xml & connect it to vp on MainActivity.java)
    // TODO 2: Create Fragments so that you can enable swipe through screens.
    /**
     * Important note:
     * You cannot display an activity on top of another activity
     * That is why you can use fragments in the place of activities
     * Fragments can also be referred as portion of the UI that you want to display on an activity
     * Refer about fragments here https://developer.android.com/guide/fragments?gclid=CjwKCAjwk_WVBhBZEiwAUHQCmdvo9ZS-AxwVzmFDDCV6NRgJ8GVyVxBehDthlF5f52LQR13PNG7nJxoCrXUQAvD_BwE&gclsrc=aw.ds
     * Fragments also will be associated with xml files - so that you can display what ever is relevant
     * Fragments are sub parts of an Activity.
     * */
    // TODO 3: Create three fragments and their UIs
    //  to create a fragment Right click on the app -> new -> fragment -> fragment template
    // TODO 4: create an adapter (FragmentStatePagerAdapter) to populate the fragments on the ViewPager

    // TODO 5: set up the TabLayout and connect it
    // TODO 6: get the tablayout in sync with the viewpager (setUpWithViewPager())
    // TODO 7: Override getPageTitle(...) in the ViewPagerAdapter class

}