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

    private String imageURL;

    public InterestPoint(){

    }


    public InterestPoint(String id, String description, String title, String label, Double lng, Double lat, String imageURL) {
        this.id = id;
        Description = description;
        Title = title;
        Label = label;
        this.lng = lng;
        this.lat = lat;
        this.imageURL = imageURL;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
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
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
