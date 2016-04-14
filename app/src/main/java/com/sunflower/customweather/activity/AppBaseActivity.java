package com.sunflower.customweather.activity;

import android.os.Bundle;

import com.sunflower.androidlib.activity.BaseActivity;

/**
 * Created by yunlala-web on 2016/4/14.
 */
public abstract class AppBaseActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
