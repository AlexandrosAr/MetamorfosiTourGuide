package com.example.android.metamorfositourguide;

import android.content.Context;
import android.media.ImageReader;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class BusinessAdapter extends ArrayAdapter<Business> {

    private int mBackgroundColorResourceId;

    public BusinessAdapter(@NonNull Context context, ArrayList<Business> businesses, int imageResourceId) {
        super(context, 0, businesses);
        mBackgroundColorResourceId = imageResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //check if there is an existing view to reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Get the obhect located at this position in the list
        Business currentBusiness = getItem(position);

        //Find the name textView by id and set it to the new businessName
        TextView businessNameView = (TextView) listItemView.findViewById(R.id.business_name);
        businessNameView.setText(currentBusiness.getmBusinessName());

        //Find the distance TextView(from the listItemView) and set it to the new business distance from the centre)
        TextView distanceView = (TextView) listItemView.findViewById(R.id.business_distance);
        distanceView.setText(currentBusiness.getmDistance());

        //Find the ratio TextView(from the listItemView) and set it to the new business ratio
        TextView businessRatioView = (TextView) listItemView.findViewById(R.id.business_ratio);
        businessRatioView.setText(""+currentBusiness.getmBusinessRatio());


        //Check if there is an available image, if there is then show it otherwise dont show it
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if(currentBusiness.hasImage()){
            //find the ImageView and show the image using the resource id
            imageView.setImageResource(currentBusiness.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            //otherwse hide the image
            imageView.setVisibility(View.GONE);
        }


        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.info_layout);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mBackgroundColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
