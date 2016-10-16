package com.akazam.mdcoordinator.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.akazam.mdcoordinator.R;
import com.akazam.mdcoordinator.fragment.BlankFragment;

import java.util.ArrayList;

public class TabLayoutActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tablayout;
    private ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        initView();
        initViewpager();
    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tablayout = (TabLayout) findViewById(R.id.tablayout);
        viewpager = (ViewPager) findViewById(R.id.viewpager);

        //替换ActivityBar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void initViewpager() {
        viewpager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager()));
        tablayout.setupWithViewPager(viewpager);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }

    /**
     *
     */
    private class MyViewPagerAdapter extends FragmentPagerAdapter {
        private ArrayList<Fragment> mFragments = new ArrayList<>();

        public MyViewPagerAdapter(FragmentManager manager) {
            super(manager);
            mFragments.add(BlankFragment.getInstace(0));
            mFragments.add(BlankFragment.getInstace(1));
            mFragments.add(BlankFragment.getInstace(2));
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            String[] strs = {"流式", "线性", "网格"};
            return strs[position];
        }
    }
}
