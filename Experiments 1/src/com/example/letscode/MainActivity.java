package com.example.letscode;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
	public int x=0;
public final static String sending_message="com.example.letscode.message";
public final static String STATE_SCORE="hello";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (savedInstanceState != null) {
	        // Restore value of members from saved state
	      x = savedInstanceState.getInt(STATE_SCORE);
	  
	    } 
		setContentView(R.layout.activity_main);
		setUpActionBar();
		
	}
	
	
private void setUpActionBar() {
    // Make sure we're running on Honeycomb or higher to use ActionBar APIs
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void sendmessage(View v)
	{
		Intent intent=new Intent(this,DisplayMessageActivity.class);
		EditText edittext=(EditText)findViewById(R.id.editText1);
		String message=edittext.getText().toString();
		intent.putExtra(sending_message, message);
		startActivity(intent);
		
	}
	
	public void onSaveInstanceState(Bundle savedInstanceState) {
	    // Save the user's current game state
	    savedInstanceState.putInt(STATE_SCORE, x);

	    
	    // Always call the superclass so it can save the view hierarchy state
	    super.onSaveInstanceState(savedInstanceState);
	}
	
	public void counter(View v)
	{
		x=x+1;
		Toast.makeText(getApplicationContext(), x+"", Toast.LENGTH_SHORT).show();
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		switch(id)
		{
		case R.id.action_settings: {
			return true;
		}
		case R.id.search_button:{
			return true;
		}
		default: return super.onOptionsItemSelected(item);
		}
	}



}
