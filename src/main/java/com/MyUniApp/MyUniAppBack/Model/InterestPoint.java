package com.MyUniApp.MyUniAppBack.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "InterestPoints")
public class InterestPoint {

    @Id

    private String id;

    private String Description;

    private String Title;

    private String Label;

    private Double lng;

    private Double lat;

    public InterestPoint(){

    }

    public InterestPoint(String id, String description, String title,  String label,  double lng, double lat) {
        this.id = id;
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

    @Override
    public String toString() {
        return "InterestPoint{" +
                "id='" + id + '\'' +
                ", Description='" + Description + '\'' +
                ", Title='" + Title + '\'' +
                ", Label='" + Label + '\'' +
                ", lng=" + lng +
                ", lat=" + lat +
                '}';
    }
}
