package com.psiuol21.prasanth.musicbound;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {
MyService ms;
    Boolean isbound=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void startmusic(View v)
    {
        if(isbound)
        ms.playmusic();
    }

    public void startservice(View v)
    {
        if(!isbound) {
            isbound=true;
            Intent intent = new Intent(this, MyService.class);
            bindService(intent, sc, this.BIND_AUTO_CREATE);

        }
    }

    public void stopservice(View v)
    {
        if(isbound) {
            isbound=false;
            ms.stopmusic();
            unbindService(sc);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    ServiceConnection sc=new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            MyService.BinderClass bc=(MyService.BinderClass) service;
            ms=bc.getService();


        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.v("Service Crash","DONE");

        }
    };
}
