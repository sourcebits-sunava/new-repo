package com.sourcebits.fragmentview.model;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class FragmentOne extends ListFragment 
{
	
	Fragcommunicator fragcommunicator;
	boolean mDualPane;
    int mCurCheckPosition = 0;
    private String[] COUNTRIES = {"India","Australia","USA","England"};

    @Override
    public void onActivityCreated(Bundle savedInstanceState) 
    {
        super.onActivityCreated(savedInstanceState);

        // Populate list with our static array of titles.
        setListAdapter((ListAdapter) new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_activated_1, COUNTRIES));

        // Check to see if we have a frame in which to embed the details
        // fragment directly in the containing UI.
        //View detailsFrame = getActivity().findViewById(R.id.Fragment_One);
        
       
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("curChoice", mCurCheckPosition);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id)
    {
    	
    	fragcommunicator.respond(position);
    	
    }

       
    
	@Override
	public void onAttach(Activity activity)
	{
		fragcommunicator = (Fragcommunicator)activity;
		super.onAttach(activity);
	}
	
	
	
	
	
	
}
