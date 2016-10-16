package com.akazam.mdcoordinator.activity;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.akazam.mdcoordinator.R;

public class DemoActivity extends AppCompatActivity {

    private FrameLayout mMainFlTitle;
    private CollapsingToolbarLayout mCollapsinglayout;
    private AppBarLayout mAppbarlayout;
    private TextView mMainTvToolbarTitle;
    private Toolbar mMainTbToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        initView();
    }

    private void initView() {
        mMainFlTitle = (FrameLayout) findViewById(R.id.main_fl_title);
        mCollapsinglayout = (CollapsingToolbarLayout) findViewById(R.id.collapsinglayout);
        mAppbarlayout = (AppBarLayout) findViewById(R.id.appbarlayout);
        mMainTvToolbarTitle = (TextView) findViewById(R.id.main_tv_toolbar_title);
        mMainTbToolbar = (Toolbar) findViewById(R.id.main_tb_toolbar);
        CoordinatorLayout.LayoutParams lp = new CoordinatorLayout.LayoutParams(CoordinatorLayout.LayoutParams.MATCH_PARENT,CoordinatorLayout.LayoutParams.WRAP_CONTENT);
        lp.setAnchorId(R.id.main_fl_title);
        mMainTbToolbar.setLayoutParams(lp);
    }
}
