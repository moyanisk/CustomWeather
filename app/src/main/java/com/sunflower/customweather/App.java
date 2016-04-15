package com.sunflower.customweather;

import android.app.Application;
import android.content.Context;

import com.sunflower.androidlib.net.RequestManager;
import com.sunflower.androidlib.utils.LogUtils;
import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by yunlala-web on 2016/4/14.
 */
public class App extends Application {

    public static String TAG = "APP";

    public static Context sContext = null;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
        init();
        LogUtils.v(TAG, "------------------");
        LogUtils.v(TAG, "program app create!");
    }

    private void init() {
        RequestManager.init(this);
        LogUtils.setLogLevel(LogUtils.VERBOSE);
        CrashReport.initCrashReport(getApplicationContext(), "900025941", false);
    }


    /**
     * 提供一个全局的context
     * @return context
     */
    public static Context getContext() {
        return sContext;
    }
}
