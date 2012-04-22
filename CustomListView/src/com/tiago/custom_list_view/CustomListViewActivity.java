package com.tiago.custom_list_view;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;

public class CustomListViewActivity extends Activity implements OnItemClickListener , OnItemLongClickListener
{
	
	List<ItemToShow> listOfItemToShow;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		ListView list = (ListView) findViewById(R.id.ListView01);
		list.setClickable(true);

		listOfItemToShow = new ArrayList<ItemToShow>();
		listOfItemToShow.add(new ItemToShow("Test 1 ", "Detail 1"));
		listOfItemToShow.add(new ItemToShow("Test 2 ", "Detail 2"));
		

		ItemToShowAdapter adapter = new ItemToShowAdapter(this, listOfItemToShow);

		list.setOnItemClickListener(this);
		list.setOnItemLongClickListener(this);
		/*
		 * list.setOnItemClickListener(new OnItemClickListener() {
		 * 
		 * @Override public void onItemClick(AdapterView<?> arg0, View view, int
		 * position, long index) { System.out.println("sadsfsf");
		 * showToast(listOfItemToShow.get(position).getName()); } });
		 */

		list.setAdapter(adapter);
		
		
	}

	@Override
	public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int arg2,
			long arg3)
	{
		Toast.makeText(getApplicationContext(), "Long click detected", 1000).show();
		return false;
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3)
	{
		Toast.makeText(getApplicationContext(), "Normal click detected", 1000).show();
	}
}