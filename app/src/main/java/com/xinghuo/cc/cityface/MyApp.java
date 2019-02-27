package com.xinghuo.cc.cityface;

import android.app.Application;

import com.billy.cc.core.component.CC;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //正式发布关闭
        CC.enableVerboseLog(true);//开启CC调用日志跟踪
        CC.enableDebug(true);//开启debug模式
        CC.enableRemoteCC(false);//开启跨app组件调用
    }
}
