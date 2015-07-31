package com.example.servi;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class FirstService extends Service {

	private static String TAG = "Here I Am";
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void onStart(Intent intent, int startId) {
		// TODO Auto-generated method stub
		super.onStart(intent, startId);
		Log.d(TAG, "FirstService started");
		
	}
	
   @Override
public void onDestroy() {
	// TODO Auto-generated method stub
	super.onDestroy();
	Log.d(TAG, "FirstService ended");
}
}
