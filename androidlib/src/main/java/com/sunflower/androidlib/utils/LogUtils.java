package com.sunflower.androidlib.utils;

import android.util.Log;

/**
 * Created by yunlala-web on 2016/4/14.
 * Log日志类，通过制定LEVEL的值来控制Log的输出
 */
public class LogUtils {

    public static final int VERBOSE = 0;
    public static final int DEBUG = 1;
    public static final int INFO = 2;
    public static final int WARN = 3;
    public static final int ERROR = 4;
    public static final int NOTHING = 5;
    public static int LEVEL = 0;

    /**
     * 设置日志的显示级别
     * @param level int类型  设置为 NOTHING(5) 时不打印
     */
    public  static void setLogLevel (int level) {
        LEVEL = level;
    }

    public static void v(String tag, String msg) {
        if (LEVEL <= VERBOSE)
            Log.v(tag, msg);
    }

    public static void d(String tag, String msg) {
        if (LEVEL <= DEBUG)
            Log.d(tag, msg);
    }

    public static void i(String tag, String msg) {
        if (LEVEL <= INFO)
            Log.i(tag, msg);
    }

    public static void w(String tag, String msg) {
        if (LEVEL <= WARN)
            Log.w(tag, msg);
    }

    public static void e(String tag, String msg) {
        if (LEVEL <= ERROR)
            Log.e(tag, msg);
    }
}
