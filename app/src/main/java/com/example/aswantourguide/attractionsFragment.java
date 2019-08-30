package com.example.aswantourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class attractionsFragment extends Fragment {
    public attractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_attractions,container,false);
        ArrayList<locationAndDetails> details=new ArrayList<locationAndDetails>();
        details.add(new locationAndDetails(getString(R.string.abu_simbel),getString(R.string.abu_simbel_details),R.drawable.abu_simbel));
        details.add(new locationAndDetails(getString(R.string.nubia_museum),getString(R.string.nubia_museum_details),R.drawable.nubia_museum));
        details.add(new locationAndDetails(getString(R.string.ruins_of_abu),getString(R.string.ruins_of_abu_details),R.drawable.ruins_of_abu));
        details.add(new locationAndDetails(getString(R.string.botanical_gardens),getString(R.string.botanical_gardens_details),R.drawable.botanical_gardens));
        ListView listView =view.findViewById(R.id.list);
        tourGuideAdapter adapter =new tourGuideAdapter(getActivity(),details);
        listView.setAdapter(adapter);
        return view;
    }

}
