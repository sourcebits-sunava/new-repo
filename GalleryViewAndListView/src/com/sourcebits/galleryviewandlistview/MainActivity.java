package com.sourcebits.galleryviewandlistview;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;
 
public class MainActivity extends Activity {
	
	//the images to display
	int[] images = {R.drawable.ic_launcher,R.drawable.pic1,R.drawable.pic2,R.drawable.pic4};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
			// Note that Gallery view is deprecated in Android 4.1---
			@SuppressWarnings("deprecation")
			Gallery gallery = (Gallery) findViewById(R.id.gallery1);
			CustomAdapter adapter = new CustomAdapter(this, images);
			gallery.setAdapter(adapter);
			gallery.setOnItemClickListener(new OnItemClickListener() {
				public void onItemClick(AdapterView<?> parent, View v, int position,long id)
		{
					Toast.makeText(getBaseContext(),"pic" + (position + 1) + " selected",
							Toast.LENGTH_SHORT).show();
					ImageView imageView = (ImageView) findViewById(R.id.image1);
					imageView.setImageResource(images[position]);
			}
		});
	}
}