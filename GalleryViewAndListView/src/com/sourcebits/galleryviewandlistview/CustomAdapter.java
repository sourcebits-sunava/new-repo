package com.sourcebits.galleryviewandlistview;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class CustomAdapter extends BaseAdapter
{
	private Context context;
	int image[];
	
	public CustomAdapter(Context context,int []image)
	{
		this.context = context ;
		this.image = image;
		
	}
	// returns the number of images
	public int getCount() {
		return image.length;
	}
	// returns the ID of an item
	public Object getItem(int position) {
		return position;
	}
	// returns the ID of an item
	public long getItemId(int position) {
		return position;
	}
	// returns an ImageView view
	public View getView(int position, View convertView, ViewGroup parent) 
	{
		ImageView imageView = new ImageView(context);
		imageView.setImageResource(image[position]);
		imageView.setLayoutParams(new Gallery.LayoutParams(100, 100));
		imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
		return imageView;
	}

}
