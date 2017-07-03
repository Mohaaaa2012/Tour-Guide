package com.greatcairo.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mohaaaa on 13-Jun-17.
 */

public class TourismAdapter extends ArrayAdapter<Tourism>
{
    public TourismAdapter(Context context , ArrayList<Tourism> tourismArrayList)
    {
        super(context,0,tourismArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Tourism currentTourism = getItem(position);

        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        TextView mosqueNameTextView = (TextView) listItemView.findViewById(R.id.name);
        mosqueNameTextView.setText(currentTourism.getName());

        TextView mosqueDateTextView = (TextView) listItemView.findViewById(R.id.cons_date);
        mosqueDateTextView.setText(currentTourism.getConsDate());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        imageView.setImageResource(currentTourism.getImageResourceId());
        return listItemView;
    }
}
