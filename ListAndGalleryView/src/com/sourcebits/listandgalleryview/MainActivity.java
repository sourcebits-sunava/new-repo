package com.sourcebits.listandgalleryview;


import java.io.ByteArrayOutputStream;



import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener
{
	ListView l;
	customAdapter adapter; 
	int images[] = {R.drawable.india,R.drawable.australia,R.drawable.england,R.drawable.argentina};
	String countryName[] = {"India","Australia","England","Argentina"};
	String countryCode[] = {"IND","AUS","ENG","ARG"};
	int height,width;
	int size[] = new int[images.length];
	int position[] = new int[images.length];
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_LEFT_ICON);
		setContentView(R.layout.activity_main);
		for(int i=0;i<images.length;++i)
		{	
			Bitmap bm = BitmapFactory.decodeResource(getResources(), images[i]);
		
			width = bm.getWidth();
			height = bm.getHeight();
			int pixel[] = new int[height*width];
			size[i] = pixel.length;
			position[i] = i;
		}
	    
		l = (ListView)findViewById(R.id.listview); // activity_main.xml list view is attached with java code
		final customAdapter adapter = new customAdapter(this, countryName, images, countryCode,position);
		l.setAdapter(adapter);
			
		
		getWindow().setFeatureDrawableResource(Window.FEATURE_LEFT_ICON,R.drawable.ic_launcher);
		TextView view = (TextView)findViewById (android.R.id.title);
		view.setClickable(true);
	    view.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v)
			{
				
				adapter.sorting(size,position);
				adapter.notifyDataSetChanged();
			}
		});
	}
	@Override
	public void onClick(DialogInterface arg0, int arg1) 
	{
		// TODO Auto-generated method stub
		
	}

	
	
}
