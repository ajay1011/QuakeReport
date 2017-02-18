package com.example.android.quakereport;

import java.util.Date;

/**
 * Created by AJAY OMKAR on 13-Dec-16.
 */

public class Earthquake {
    private double magnitude;
    private String place;
    private long date;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public Earthquake(){

    }

    public Earthquake(double magnitude, String place, long date,String address) {
        this.magnitude = magnitude;
        this.place = place;
        this.date = date;
        this.url = address;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }
}
