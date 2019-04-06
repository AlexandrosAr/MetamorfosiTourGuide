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
public class ToVisitFragment extends Fragment {


    public ToVisitFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.business_list, container, false);

        //Create list of restaurants
        final ArrayList<Business> businesses = new ArrayList<Business>();

        businesses.add(new Business(getString(R.string.central_park), 0+getString(R.string.distance_in_meters), 5.0, R.drawable.ic_directions_walk));
        businesses.add(new Business(getString(R.string.pine_forest), 300+getString(R.string.distance_in_meters), 4.9, R.drawable.ic_directions_walk));
        businesses.add(new Business(getString(R.string.village_beach), 10+getString(R.string.distance_in_meters), 4.4, R.drawable.ic_beach_access));
        businesses.add(new Business(getString(R.string.askamnia_beach), 800+getString(R.string.distance_in_meters), 4.5, R.drawable.ic_beach_access));
        businesses.add(new Business(getString(R.string.road_sea), 30+getString(R.string.distance_in_meters), 4.6, R.drawable.ic_directions_walk));
        businesses.add(new Business(getString(R.string.sithon_beach), 3+getString(R.string.distance_in_km), 4.7, R.drawable.ic_beach_access));
        businesses.add(new Business(getString(R.string.nikiti), 7.5+getString(R.string.distance_in_km), 5.0, R.drawable.ic_action_home));
        businesses.add(new Business(getString(R.string.agios_giannis), 10+getString(R.string.distance_in_km), 5.0, R.drawable.ic_beach_access));
        businesses.add(new Business(getString(R.string.koviu_beach), 12+getString(R.string.distance_in_km), 5.0, R.drawable.ic_beach_access));
        businesses.add(new Business(getString(R.string.salonikiu_beach), 14+getString(R.string.distance_in_km), 5.0, R.drawable.ic_beach_access));

        // Create an Business Adapter, whose data is the list of item above, the item knows how to create the list of items
        BusinessAdapter adapter = new BusinessAdapter(getActivity(), businesses, R.color.backgroundColorDrinkVisit);

        //find the list id to store the arraylist contents
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the listView use the Adapter we create above to list the items of the list
        listView.setAdapter(adapter);

        return rootView;
    }

}
