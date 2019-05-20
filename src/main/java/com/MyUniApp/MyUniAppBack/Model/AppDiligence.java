package com.MyUniApp.MyUniAppBack.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Diligences")
public class AppDiligence {
    private int id;
    private String title;
    private String publisher;
    private String type;
    private String email;
    private String content;
    private String imageURL;
    private String infoURL;

    public AppDiligence(int id, String title, String publisher, String type, String email, String content, String imageURL, String infoURL) {
        this.id = id;
        this.title = title;
        this.publisher = publisher;
        this.type = type;
        this.email = email;
        this.content = content;
        this.imageURL = imageURL;
        this.infoURL = infoURL;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageURL() {
        return this.imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getInfoURL() {
        return this.infoURL;
    }

    public void setInfoURL(String infoURL) {
        this.infoURL = infoURL;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", publisher='" + getPublisher() + "'" +
            ", type='" + getType() + "'" +
            ", email='" + getEmail() + "'" +
            ", content='" + getContent() + "'" +
            ", imageURL='" + getImageURL() + "'" +
            ", infoURL='" + getInfoURL() + "'" +
            "}";
    }
}
