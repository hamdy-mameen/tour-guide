package com.example.aswantourguide;
public class locationAndDetails {
    private String details;
    private int imageResourceId=NO_IMAGE_FOUNDED;
    private String mTitle;
    private static final int NO_IMAGE_FOUNDED=-1;
    public locationAndDetails(String title,String locationDetails ,int imageid){
        details=locationDetails;
        imageResourceId=imageid;
        mTitle=title;
    }
    public locationAndDetails(String title,String locationDetails ){
        details=locationDetails;
        mTitle=title;

    }

    public String getlocationDetails(){
        return details;
    }
    public String getTitle()
    {
        return mTitle;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }
    public boolean hasImage(){
        return imageResourceId != NO_IMAGE_FOUNDED;
    }

}
