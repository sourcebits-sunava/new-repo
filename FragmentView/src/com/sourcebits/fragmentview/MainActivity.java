package com.sourcebits.fragmentview;
import com.sourcebits.fragmentview.model.Fragcommunicator;

import com.sourcebits.fragmentview.model.FragmentOne;
import com.sourcebits.fragmentview.model.FragmentTwo;

import android.app. Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;


public class MainActivity extends FragmentActivity implements Fragcommunicator
{
	//private static final String TAG = "MainActivity";
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		
		 if (savedInstanceState == null)
		 {
			 if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) 
			 {
				 setContentView(R.layout.activity_main);
				 FragmentOne frag = new FragmentOne();
				 getSupportFragmentManager().beginTransaction().add(R.id.Fragment_One, frag).commit();
			 }
			 if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) 
			 {
				 setContentView(R.layout.single_fragment);
				 FragmentOne frag = new FragmentOne();
				 getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, frag).commit();
			 }
		 }
		 else
		 {
			 if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) 
			 {
				 setContentView(R.layout.activity_main);
				 FragmentOne frag = new FragmentOne();
				 FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
				 transaction.replace(R.id.Fragment_One, frag);
				 transaction.commit();
			 }
			 if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) 
			 {
				 setContentView(R.layout.single_fragment);
				 FragmentOne frag = new FragmentOne();
				 FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
				 transaction.replace(R.id.fragment_container, frag);
				 transaction.commit();
			 }
		 }
		 
		
	}
	@Override
	public void respond(int position) 
	{
		 if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) 
		 {
			 FragmentTwo newFragment = new FragmentTwo();
			 Bundle args = new Bundle();
			 args.putInt(FragmentTwo.ARG_POSITION, position);
			 newFragment.setArguments(args);

			 FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

			 // Replace whatever is in the fragment_container view with this fragment
			 transaction.replace(R.id.fragment_Two, newFragment);
		
			 transaction.addToBackStack(null);
	
			 // Commit the transaction
			 transaction.commit();
		}
		 if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) 
		 {
			 FragmentTwo newFragment = new FragmentTwo();
			 Bundle args = new Bundle();
			 args.putInt(FragmentTwo.ARG_POSITION, position);
			 newFragment.setArguments(args);

			 FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

			 // Replace whatever is in the fragment_container view with this fragment
			 transaction.replace(R.id.fragment_container, newFragment);
		
			 transaction.addToBackStack(null);
	
			 // Commit the transaction
			 transaction.commit();
		 }

		
	}
	
	
}
