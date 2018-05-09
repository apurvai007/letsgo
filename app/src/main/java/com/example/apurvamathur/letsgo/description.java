package com.example.apurvamathur.letsgo;

import android.support.annotation.NonNull;

public class description implements Comparable<description> {
    private String mNameOfPlace;
    private String mDescription;
    private int mImage;
    private int mcounter;

    public description(String NameOfplace, String Description,int Image ){
        mDescription = Description;
        mImage = Image;
        mNameOfPlace = NameOfplace;
        mcounter = 0;
    }

    public int getMcounter() {
        return mcounter;
    }

    public void setMcounter(int mcounter) {
        this.mcounter = mcounter;
    }
    public void update(){
        this.mcounter++;
    }

    public int getmImage() {
        return mImage;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmNameOfPlace() {
        return mNameOfPlace;
    }

    @Override
    public int compareTo(@NonNull description compareCounter) {
            int compare1=((description) compareCounter ).getMcounter();
            /* For Descending order do like this */
            return compare1-this.mcounter;
        }
    }




