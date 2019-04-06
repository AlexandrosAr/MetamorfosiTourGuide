package com.example.android.metamorfositourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ToDrinkFragment extends Fragment {


    public ToDrinkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.business_list, container, false);

        //Create list of restaurants
        final ArrayList<Business> businesses = new ArrayList<Business>();

        businesses.add(new Business(getString(R.string.green_place), 170+getString(R.string.distance_in_meters), 5.0, R.drawable.ic_local_bar));
        businesses.add(new Business(getString(R.string.volta), 200+getString(R.string.distance_in_meters), 4.4, R.drawable.ic_local_bar));
        businesses.add(new Business(getString(R.string.sunny_bay_beach_bar), 800+getString(R.string.distance_in_meters), 4.8, R.drawable.ic_local_bar));
        businesses.add(new Business(getString(R.string.thalassa), 5+getString(R.string.distance_in_meters), 4.7, R.drawable.ic_local_bar));
        businesses.add(new Business(getString(R.string.blue_cafe), 1+getString(R.string.distance_in_km), 4.6, R.drawable.ic_local_bar));
        businesses.add(new Business(getString(R.string.simeon_pool_bar), 240+getString(R.string.distance_in_meters), 4.5, R.drawable.ic_local_bar));
        businesses.add(new Business(getString(R.string.blue_dolphin_pool_bar), 1.2+getString(R.string.distance_in_km),4.4, R.drawable.ic_local_bar));
        businesses.add(new Business(getString(R.string.porto_matina_beach_bar), 200+getString(R.string.distance_in_meters), 4.3, R.drawable.ic_local_bar));

        // Create an Business Adapter, whose data is the list of item above, the item knows how to create the list of items
        BusinessAdapter adapter = new BusinessAdapter(getActivity(), businesses, R.color.backgroundColorDrinkVisit);

        //find the list id to store the arraylist contents
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the listView use the Adapter we create above to list the items of the list
        listView.setAdapter(adapter);

        return rootView;

    }

}
