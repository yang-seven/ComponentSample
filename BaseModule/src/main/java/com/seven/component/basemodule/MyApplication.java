package com.seven.component.basemodule;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Time:2019/10/29
 * <p>
 * Author:wangzhou
 * <p>
 * Description:
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initARouter();

    }

    private void initARouter() {
        ARouter.openLog();
        ARouter.openDebug();
        ARouter.printStackTrace();
        ARouter.init(this);
    }
}
