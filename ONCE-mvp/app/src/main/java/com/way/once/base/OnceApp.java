package com.way.once.base;

import android.support.multidex.MultiDexApplication;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by pc on 2016/8/17.
 */

public class OnceApp extends MultiDexApplication {

    @Override public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
