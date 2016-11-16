package com.scu.testfor.bcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.scu.testfor.MyService;

/**
 *@author coolszy
 *@date 2011-6-14
 *@blog http://blog.csdn.net/coolszy
 */

public class BootCompletedReceiver extends BroadcastReceiver
{

	@Override
	public void onReceive(Context context, Intent intent)
	{
		Intent intent1 = new Intent(context, MyService.class);
		context.startService(intent1);
		Toast.makeText(context,"TestFor BootCompletedReceiver",Toast.LENGTH_SHORT).show();
		Log.i("mytag", "系统启动完毕");
	}
}
