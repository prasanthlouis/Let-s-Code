package com.example.servi;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

public class FirstService extends Service {
	MediaPlayer mp;
	private static String TAG = "Here I Am";
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		mp=MediaPlayer.create(this, R.raw.abc);
	}
	
	@Override
	public void onStart(Intent intent, int startId) {
		// TODO Auto-generated method stub
		super.onStart(intent, startId);
		
		mp.start();
		Log.d(TAG, "FirstService started");
		
		
	}
	
   @Override
public void onDestroy() {
	// TODO Auto-generated method stub
	super.onDestroy();
	mp.stop();
	Log.d(TAG, "FirstService ended");

	
}
}
