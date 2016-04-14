package com.sunflower.androidlib.net;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by yunlala-web on 2016/4/14.
 * 管理数据的请求
 */
public class RequestManager {


    private static RequestQueue mRequestQueue;

    public static void init(Context context){
        mRequestQueue = Volley.newRequestQueue(context);
    }

    /**
     * 返回请求队列
     * @return RequestQueue
     */
    public static RequestQueue getRequestQueue() {
        if (mRequestQueue != null) {
            return mRequestQueue;
        } else {
            throw new IllegalStateException("RequestManager is not initialized");
        }
    }

    public static void addRequest(Request<?> request) throws Exception {
        addRequest(request, null);
    }

    public static void addRequest(Request<?> request, Object obj){
        if (mRequestQueue == null) {
            throw new IllegalStateException("RequestManager is not init");
        }

        if (obj != null) {
            request.setTag(obj);
        }
        mRequestQueue.add(request);
    }

    public static void cancelAll(Object tag) {
        if (mRequestQueue != null)
            mRequestQueue.cancelAll(tag);
    }

}
