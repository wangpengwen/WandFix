package com.miqt.demo;

import android.app.Application;

import com.miqt.wand.Wand;

public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        //可以在application中初始化一次即可
        Wand.getInstance(this).init(true);
    }
}
