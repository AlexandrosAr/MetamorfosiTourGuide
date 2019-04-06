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
public class ToSleepFragment extends Fragment {


    public ToSleepFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.business_list, container, false);

        //Create list of restaurants
        final ArrayList<Business> businesses = new ArrayList<Business>();

        businesses.add(new Business(getString(R.string.blue_dolphin), 1.2+getString(R.string.distance_in_km), 5.0, R.drawable.ic_local_hotel));
        businesses.add(new Business(getString(R.string.village_mare), 2+getString(R.string.distance_in_km), 4.9, R.drawable.ic_local_hotel));
        businesses.add(new Business(getString(R.string.simeon_hotel), 200+getString(R.string.distance_in_meters), 4.7, R.drawable.ic_local_hotel));
        businesses.add(new Business(getString(R.string.golden_beach), 25+getString(R.string.distance_in_meters), 4.3, R.drawable.ic_local_hotel));
        businesses.add(new Business(getString(R.string.amari), 500+getString(R.string.distance_in_meters), 4.5, R.drawable.ic_local_hotel));
        businesses.add(new Business(getString(R.string.bella_maria), 340+getString(R.string.distance_in_meters), 4.7, R.drawable.ic_local_hotel));
        businesses.add(new Business(getString(R.string.four_you), 340+getString(R.string.distance_in_meters), 4.6, R.drawable.ic_local_hotel));
        businesses.add(new Business(getString(R.string.porto_matina), 200+getString(R.string.distance_in_meters), 4.0, R.drawable.ic_local_hotel));
        businesses.add(new Business(getString(R.string.anna_christina), 350+getString(R.string.distance_in_meters), 4.3, R.drawable.ic_local_hotel));
        businesses.add(new Business(getString(R.string.olympic_bibis), 600+getString(R.string.distance_in_meters), 4.0, R.drawable.ic_local_hotel));
        businesses.add(new Business(getString(R.string.sunny_bay_camping), 800+getString(R.string.distance_in_meters), 4.1, R.drawable.ic_local_hotel));
        businesses.add(new Business(getString(R.string.sithon_camping), 3+getString(R.string.distance_in_km), 4.3, R.drawable.ic_local_hotel));

        // Create an Business Adapter, whose data is the list of item above, the item knows how to create the list of items
        BusinessAdapter adapter = new BusinessAdapter(getActivity(), businesses, R.color.backgroundColorEatSleep);

        //find the list id to store the arraylist contents
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the listView use the Adapter we create above to list the items of the list
        listView.setAdapter(adapter);

        return rootView;
    }

}
