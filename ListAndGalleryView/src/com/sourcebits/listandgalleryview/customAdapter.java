package com.sourcebits.listandgalleryview;

import java.util.Comparator;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customAdapter extends ArrayAdapter
{
	Context context;
	int[] images;
	String countryName[];
	String countryCode[];
	int sortposition[];


	public customAdapter(Context context,String titles[],int img[],String description[],int position[]) //taking title and image array as a parameter
	{
		super(context,R.layout.single_row,R.id.textview2,description);
		this.context = context;
		this.images = img;
		this.countryName = titles;
		this.countryCode = description;
		this.sortposition = position;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		LayoutInflater inflater = ((Activity)context).getLayoutInflater();
		View row = inflater.inflate(R.layout.single_row,parent,false);
		
		
		ImageView myImage = (ImageView) row.findViewById(R.id.imageview);
		TextView country = (TextView) row.findViewById(R.id.textview1);
		TextView code = (TextView) row.findViewById(R.id.textview2);
		myImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
		myImage.setPadding(10, 10, 10, 10);;
	    
		myImage.setImageResource(images[sortposition[position]]);
		country.setText(countryName[sortposition[position]]); 	
		code.setText(countryCode[sortposition[position]]); 
		
		return row ;// this is the final view we want
	}
	
	public void sorting(int size[],int position[] ) 
	{
		sortposition = position;
		int l= size.length;
		for(int i=0;i<l;++i)
		{
			for(int j=0;j<l-i-1;++j)
			{
				if(size[j]>size[j+1])
				{
					int temp = size[j];
					size[j] = size[j+1];
					size[j+1] = temp;
					temp = sortposition[j];
					sortposition[j] = sortposition[j+1];
					sortposition[j+1] = temp;
				}
			}
		}
		
	
	}
	
}
