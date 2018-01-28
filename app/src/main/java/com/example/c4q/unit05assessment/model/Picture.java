package com.example.c4q.unit05assessment.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by c4q on 1/27/18.
 */
public class Picture implements Serializable{
    private String large;
    private String medium;
    private String thumbnail;

    public String getLarge() {
        return large;
    }

    public String getMedium() {
        return medium;
    }

    public String getThumbnail() {
        return thumbnail;
    }
}

