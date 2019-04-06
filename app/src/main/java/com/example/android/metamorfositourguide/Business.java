package com.example.android.metamorfositourguide;

public class Business {

    private String mBusinessName;

    private String mDistance;

    private double mBusinessRatio;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Business(String businessName, String distance, double businessRatio){

        mBusinessName = businessName;
        mDistance = distance;
        mBusinessRatio = businessRatio;

    }

    public Business(String businessName, String distance, double businessRatio, int imageResourceId){

        mBusinessName = businessName;
        mDistance = distance;
        mBusinessRatio = businessRatio;
        mImageResourceId = imageResourceId;

    }

    public String getmBusinessName() {
        return mBusinessName;
    }

    public String getmDistance() {
        return mDistance;
    }

    public double getmBusinessRatio() {
        return mBusinessRatio;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
