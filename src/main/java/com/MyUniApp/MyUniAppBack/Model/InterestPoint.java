package com.MyUniApp.MyUniAppBack.Model;

public class InterestPoint {

    private String Description;

    private String Title;

    private String Label;

    private double lng;

    private double lat;

    public InterestPoint(String description, String title, String label, double lng, double lat) {
        Description = description;
        Title = title;
        Label = label;
        this.lng = lng;
        this.lat = lat;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
}
