package com.tiago.custom_list_view;

import java.util.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class ItemToShowAdapter extends BaseAdapter implements OnClickListener
{

	private Context context;

    private List<ItemToShow> listItemToShow;

    public ItemToShowAdapter(Context context, List<ItemToShow> listPhonebook) {
        this.context = context;
        this.listItemToShow = listPhonebook;
    }
    
	
	public void onClick(View v)
	{
		// TODO Auto-generated method stub
		
	}

	
	public int getCount()
	{
		return listItemToShow.size();
	}

	
	public Object getItem(int position)
	{
		return listItemToShow.get(position);
	}

	
	public long getItemId(int position)
	{
		return position;
	}

	
	@SuppressLint("NewApi")
	public View getView(int position, View convertView, ViewGroup viewGroup)
	{
		ItemToShow entry = listItemToShow.get(position);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.custom_row_layout, null);
        }
        TextView tvMainText = (TextView) convertView.findViewById(R.id.textViewMainItem);
        tvMainText.setText(entry.mainItem);

        TextView tvDetailText = (TextView) convertView.findViewById(R.id.textViewDetailItem);
        tvDetailText.setText(entry.detailItem);

        /*
        TextView tvMail = (TextView) convertView.findViewById(R.id.tvMail);
        tvMail.setText(entry.getMail());

        // Set the onClick Listener on this button
        Button btnRemove = (Button) convertView.findViewById(R.id.btnRemove);
        btnRemove.setFocusableInTouchMode(false);
        btnRemove.setFocusable(false);
        btnRemove.setOnClickListener(this);
        // Set the entry, so that you can capture which item was clicked and
        // then remove it
        // As an alternative, you can use the id/position of the item to capture
        // the item
        // that was clicked.
        btnRemove.setTag(entry);
        */

        // btnRemove.setId(position);
        
        

        return convertView;
	}
	
}
