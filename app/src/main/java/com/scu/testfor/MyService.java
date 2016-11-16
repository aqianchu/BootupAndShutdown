package com.scu.testfor;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by zhangqianchu on 2016/11/16.
 */
public class MyService extends Service{
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("mytag","My Service onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }
}
