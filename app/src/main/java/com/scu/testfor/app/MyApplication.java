package com.scu.testfor.app;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;

import com.scu.testfor.MyService;
import com.scu.testfor.bcast.BootCompletedReceiver;
import com.scu.testfor.utils.PackageUtils;

/**
 * Created by zhangqianchu on 2016/11/16.
 */
public class MyApplication extends Application{

    @Override
    public void onCreate() {
        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle bundle) {
                PackageUtils.setComponentDefault(activity,BootCompletedReceiver.class.getName());
                Intent intent = new Intent(activity, MyService.class);
                startService(intent);
            }

            @Override
            public void onActivityStarted(Activity activity) {

            }

            @Override
            public void onActivityResumed(Activity activity) {

            }

            @Override
            public void onActivityPaused(Activity activity) {

            }

            @Override
            public void onActivityStopped(Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {
                PackageUtils.setComponentDefault(activity,BootCompletedReceiver.class.getName());
            }
        });
        super.onCreate();
    }
}
