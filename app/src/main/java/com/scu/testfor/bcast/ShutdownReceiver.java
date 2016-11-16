package com.scu.testfor.bcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.scu.testfor.utils.PackageUtils;

/**
 *@author coolszy
 *@date 2011-6-14
 *@blog http://blog.csdn<a href="http://lib.csdn.net/base/dotnet" class='replace_word' title=".NET知识库" target='_blank' style='color:#df3434; font-weight:bold;'>.NET</a>/coolszy
 */

public class ShutdownReceiver extends BroadcastReceiver
{

	@Override
	public void onReceive(Context context, Intent intent)
	{
		Log.i("mytag", "启动关闭中...");
		PackageUtils.setComponentDefault(context,BootCompletedReceiver.class.getName());
	}
}
