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
public class shoppingFragment extends Fragment {

    public shoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view=  inflater.inflate(R.layout.fragment_shopping,container,false);
        ArrayList<locationAndDetails> details=new ArrayList<locationAndDetails>();
        details.add(new locationAndDetails(getString(R.string.nubia_tourist_book_centre),getString(R.string.nubia_book_center_details)));
        details.add(new locationAndDetails(getString(R.string.aswan_market),getString(R.string.aswan_market_details)));
        details.add(new locationAndDetails(getString(R.string.hanafi_bazaar),getString(R.string.hanafi_bazar_details)));
        details.add(new locationAndDetails(getString(R.string.el_sadat_street),getString(R.string.el_sadat_street_details)));
        ListView listView =view.findViewById(R.id.list);
        tourGuideAdapter adapter =new tourGuideAdapter(getActivity(),details);
        listView.setAdapter(adapter);

        return view;
    }

}
