package com.psiuol21.prasanth.musicbound;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;

public class MyService extends Service {
    IBinder mybinder=new BinderClass();
    MediaPlayer mp;
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mybinder;
    }

    public void playmusic()
    {

        mp=MediaPlayer.create(getApplicationContext(),R.raw.abc);
        mp.start();
    }
    public void stopmusic()
    {
       mp.stop();
    }
    public class BinderClass extends Binder{
        public MyService getService()
        {
           return MyService.this;
        }
    }
}
