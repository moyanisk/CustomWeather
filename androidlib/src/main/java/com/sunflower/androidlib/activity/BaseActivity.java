package com.sunflower.androidlib.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.sunflower.androidlib.net.RequestManager;
import com.sunflower.androidlib.utils.LogUtils;

/**
 * Created by yunlala-web on 2016/4/14.
 */
public abstract class BaseActivity extends AppCompatActivity {

    private String TAG = this.getClass().getSimpleName();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        LogUtils.d(TAG, "onCreate! -------");
        initVariables();
        initViews(savedInstanceState);
        loadData();
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onPause() {
        //当前页暂停时终止所有的网络请求操作
        RequestManager.cancelAll(this);
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        LogUtils.d(TAG, "onDestroy! -------");
        super.onDestroy();
    }

    /**
     * 执行请求
     *
     * @param request 被执行的请求
     */
    protected void executeRequest(Request<?> request) {
        RequestManager.addRequest(request, this);
    }

    protected Response.ErrorListener errorListener() {
        return new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
//                Toast.makeText(activity, error.getMessage(), Toast.LENGTH_LONG).show();
//                LogUtils.e(TAG, error.toString());
            }
        };
    }

    //初始化Activity用到的变量
    protected abstract void initVariables();

    //初始化控件
    protected abstract void initViews(Bundle saveInstanceState);

    //加载数据
    protected abstract void loadData();

}
