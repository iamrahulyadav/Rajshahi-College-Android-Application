package com.example.hppc.rcderectory.extra_curriculum;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hppc.rcderectory.R;

import java.util.ArrayList;
import java.util.List;

public class Rajshahi_College_Business_Club extends AppCompatActivity {

    private TabLayout myrcbc_tl;
    private ViewPager myrcbc_vp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi__college__business__club);

        myrcbc_vp = (ViewPager)findViewById(R.id.myrcbc_view_pager);
        myrcbc_tl = (TabLayout)findViewById(R.id.myrcbc_tabs);

        setUpMyViewPager(myrcbc_vp);
        myrcbc_tl.setupWithViewPager(myrcbc_vp);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    void setUpMyViewPager(ViewPager vp){

        ViewPagerAdapter vpa = new ViewPagerAdapter(getSupportFragmentManager());
        vpa.addMyFragment(new ABOUT_RCBC(), "ABOUT");
        vpa.addMyFragment(new ADVISER_RCBC(), "ADVISER");
        vpa.addMyFragment(new ACTIVITY_RCBC(), "ACTIVITY");
        vpa.addMyFragment(new MB_LIST_RCBC(), "MB_LIST");

        vp.setAdapter(vpa);
    }

    //Class for load view
    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> my_list = new ArrayList<Fragment>();
        private final List<String> my_titles = new ArrayList<String>();

        public ViewPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            return my_list.get(position);
        }

        @Override
        public int getCount() {
            return my_list.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return my_titles.get(position);
        }

        //Method for add Fragment
        void addMyFragment(Fragment f, String title){
            my_list.add(f);
            my_titles.add(title);
        }
    }
}
