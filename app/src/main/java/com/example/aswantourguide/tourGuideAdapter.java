package com.example.aswantourguide;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class tourGuideAdapter extends ArrayAdapter<locationAndDetails> {
    private Context mContext;
    public tourGuideAdapter(Context context, ArrayList<locationAndDetails>locations) {
        super(context,0, locations);
        mContext=context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final locationAndDetails location=getItem(position);
        View listItemView=convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        TextView title=(TextView) listItemView.findViewById(R.id.text_view_title);
        TextView data=(TextView) listItemView.findViewById(R.id.text_view_details);
        title.setText(location.getTitle());
        data.setText(location.getlocationDetails());
        ImageView imageView=(ImageView)listItemView.findViewById(R.id.image_view);
        if(location.hasImage()){
        imageView.setImageResource(location.getImageResourceId());
        imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);

        }
        return listItemView;
    }
}
