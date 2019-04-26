package com.MyUniApp.MyUniAppBack.Model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import javax.validation.constraints.NotEmpty;

@Entity
public class InterestPoint {

    @Id
    @JsonProperty("id")
    @Property("_id")
    private String id;
    @JsonProperty("Description")
    @NotEmpty
    private String Description;
    @JsonProperty("Title")
    @NotEmpty
    private String Title;
    @JsonProperty("Label")
    @NotEmpty
    private String Label;
    @JsonProperty("lng")
    @NotEmpty
    private double lng;
    @JsonProperty("lat")
    @NotEmpty
    private double lat;

    @JsonCreator
    public InterestPoint(){

    }

    @JsonCreator
    public InterestPoint(String id, @NotEmpty String description, @NotEmpty String title, @NotEmpty String label, @NotEmpty double lng, @NotEmpty double lat) {
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
