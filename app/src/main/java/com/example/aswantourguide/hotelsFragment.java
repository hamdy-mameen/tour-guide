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
public class hotelsFragment extends Fragment {
    public hotelsFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view= inflater.inflate(R.layout.fragment_hotels,container,false);
        ArrayList<locationAndDetails> details=new ArrayList<locationAndDetails>();
        details.add(new locationAndDetails(getString(R.string.movenpick_resort_aswan),getString(R.string.movenpick_resort_details),R.drawable.movenpick));
        details.add(new locationAndDetails(getString(R.string.cleopatra_hotel),getString(R.string.cleopatra_hotel_details),R.drawable.cleopatra));
        details.add(new locationAndDetails(getString(R.string.philae_hotel_aswan),getString(R.string.philae_hotel_details),R.drawable.philae));
        details.add(new locationAndDetails(getString(R.string.sofitel_legend_old_cataract),getString(R.string.sofitel_details),R.drawable.sofitel));
        ListView listView =view.findViewById(R.id.list);
        tourGuideAdapter adapter =new tourGuideAdapter(getActivity(),details);
        listView.setAdapter(adapter);
         return view;
    }

}
