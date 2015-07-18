package com.example.letscode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	//	setContentView(R.layout.activity_display_message);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		Intent intent=getIntent();
		String message=intent.getStringExtra(MainActivity.sending_message);
	//	String message=getResources().getString(R.string.app_name);
		TextView tv=new TextView(this);
		tv.setTextSize(40);
		tv.setText(message);
		setContentView(tv);

		
	}

	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	

}
