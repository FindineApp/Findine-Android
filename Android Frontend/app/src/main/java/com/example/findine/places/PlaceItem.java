package com.example.findine.places;

public class PlaceItem {
    private String placeTitle;
    private String placeDistance;
    private String placeType;
    private double placeRate;
    private String placePhoto;

    public PlaceItem(String placeTitle, String placeDistance, String placeType, double placeRate, String placePhoto) {
        this.placeTitle = placeTitle;
        this.placeDistance = placeDistance;
        this.placeType = placeType;
        this.placeRate = placeRate;
        this.placePhoto = placePhoto;
    }

    public String getPlaceTitle() {
        return placeTitle;
    }

    public String getPlaceDistance() {
        return placeDistance;
    }

    public String getPlaceType() {
        return placeType;
    }

    public double getPlaceRate() {
        return placeRate;
    }

    public String getPlacePhoto() {
        return placePhoto;
    }
}
