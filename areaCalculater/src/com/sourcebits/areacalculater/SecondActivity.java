package com.sourcebits.areacalculater;

import android.os.Bundle;
import android.util.Log;
import android.app.Activity;

public class SecondActivity extends Activity
{
	private static final String TAG = "SecondActivity";
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		//setContentView(R.layout.activity_main);
	}

	@Override
	protected void onDestroy() 
	{
		Log.i(TAG, "SecondActivity on destroy");
		super.onDestroy();
	}

	@Override
	protected void onPause() 
	{
		Log.i(TAG, "SecondActivity on pause");
		super.onPause();
	}

	@Override
	protected void onResume() 
	{
		Log.i(TAG, "SecondActivity on resume");
		super.onResume();
	}

	@Override
	protected void onStart()
	{
		Log.i(TAG, "SecondActivity on start");
		super.onStart();
	}

	@Override
	protected void onStop()
	{
		Log.i(TAG, "SecondActivity on stop");
		super.onStop();
	}
}
