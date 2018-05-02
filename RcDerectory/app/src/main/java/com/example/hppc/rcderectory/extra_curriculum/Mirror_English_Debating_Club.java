package com.example.hppc.rcderectory.extra_curriculum;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

import com.example.hppc.rcderectory.R;

import java.util.ArrayList;
import java.util.List;

public class Mirror_English_Debating_Club extends AppCompatActivity {

    private TabLayout mymedc_tl;
    private ViewPager mymedc_vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mirror__english__debating__club);

        mymedc_vp = (ViewPager)findViewById(R.id.mymedc_view_pager);
        mymedc_tl = (TabLayout) findViewById(R.id.mymedc_tabs);

        setUpMyViewPager(mymedc_vp);
        mymedc_tl.setupWithViewPager(mymedc_vp);

        //for back to home activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    void setUpMyViewPager(ViewPager vp){

        ViewPagerAdapter vpa = new ViewPagerAdapter(getSupportFragmentManager());
        vpa.addMyFragment(new ABOUT_MEDC(), "ABOUT");
        vpa.addMyFragment(new ADVISERS_MEDC(), "ADVISER");
        vpa.addMyFragment(new ACTIVITY_MEDC(), "ACTIVITY");
        vpa.addMyFragment(new MB_LIST_MEDC(), "MB_LIST");

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
