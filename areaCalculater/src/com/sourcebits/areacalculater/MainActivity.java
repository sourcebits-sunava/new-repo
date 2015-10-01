package com.sourcebits.areacalculater;

import com.sourcebits.areacalculater.model.Circle;
import com.sourcebits.areacalculater.model.Rectangle;
import com.sourcebits.areacalculater.model.Square;
import com.sourcebits.areacalculater.model.Triangle;

import android.os.Bundle;
import android.util.Log;
//import android.view.Menu;
//import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity 
{
	boolean next = false;
	private static final String TAG = "MainActivity";
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		Circle objectCircle = new Circle(8);
		Square objectSquare = new Square(8);
		Rectangle objectRectangle = new Rectangle(8,10);
		Triangle objectTriangle = new Triangle(8,10);
		Log.i(TAG,"Circle area"+objectCircle.shape());
		Log.i(TAG,"Square area"+objectSquare.shape());
		Log.i(TAG,"Rectangle area"+objectRectangle.shape());
		Log.i(TAG,"Triangle area"+objectTriangle.shape());
		
		
		//setContentView(R.layout.activity_main);
	}

	@Override
	protected void onDestroy() 
	{
		Log.i(TAG, "MainActivity on destroy");
		super.onDestroy();
	}

	@Override
	protected void onPause() 
	{
		Log.i(TAG, "MainActivity on pause");
		super.onPause();
	}

	@Override
	protected void onResume() 
	{
		if(!next)
		{
			Intent intent = new Intent(this, SecondActivity.class);
			startActivity(intent);
			Log.i(TAG, "MainActivity on resume");
			super.onResume();
		}
		
	}

	@Override
	protected void onStart()
	{
		Log.i(TAG, "MainActivity on start");
		super.onStart();
	}

	@Override
	protected void onStop()
	{
		Log.i(TAG, "MainActivity on stop");
		super.onStop();
	}

	
}
