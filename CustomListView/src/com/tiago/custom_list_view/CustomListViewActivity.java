package com.tiago.custom_list_view;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;

@SuppressLint("NewApi")
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
		listOfItemToShow.add(new ItemToShow("Test 3 ", "Detail 3"));
		listOfItemToShow.add(new ItemToShow("Test 4 ", "Detail 4"));
		listOfItemToShow.add(new ItemToShow("Test 5 ", "Detail 5"));
		listOfItemToShow.add(new ItemToShow("Test 6 ", "Detail 6"));
		listOfItemToShow.add(new ItemToShow("Test 7 ", "Detail 7"));
		listOfItemToShow.add(new ItemToShow("Test 8 ", "Detail 8"));
		
		

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

	
	public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int arg2,
			long arg3)
	{
		
		//arg1.setActivated(true);
		arg1.setSelected(true);
		
		//Toast.makeText(getApplicationContext(), "Long click detected", 1000).show();
		return true;
	}

	
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3)
	{
		//arg1.setActivated(true);
		//Toast.makeText(getApplicationContext(), "Normal click detected", 1000).show();
	}
}