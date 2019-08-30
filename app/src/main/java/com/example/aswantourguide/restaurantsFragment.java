package com.example.aswantourguide;


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
public class restaurantsFragment extends Fragment {

    public restaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         View view= inflater.inflate(R.layout.fragment_restaurants,container,false);
        ArrayList<locationAndDetails> details=new ArrayList<locationAndDetails>();
        details.add(new locationAndDetails(getString(R.string.ad_dukka),getString(R.string.ad_dukka_details)));
        details.add(new locationAndDetails(getString(R.string._1902_restaurant),getString(R.string._1902_details)));
        details.add(new locationAndDetails(getString(R.string.al_makka),getString(R.string.al_makka_details)));
        details.add(new locationAndDetails(getString(R.string.kebabgy),getString(R.string.kababgy_details)));
        ListView listView =view.findViewById(R.id.list);
        tourGuideAdapter adapter =new tourGuideAdapter(getActivity(),details);
        listView.setAdapter(adapter);

        return view;
    }

}
