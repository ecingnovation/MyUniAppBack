package com.MyUniApp.MyUniAppBack.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "News")
public class AppNew {
    private String title;
    private String publisher;
    private String type;
    private long date;
    private String email;
    private String content;
    private String imageURL;

    public AppNew(String title, String publisher, String type, long date, String email, String content, String imageURL) {
        this.title = title;
        this.publisher = publisher;
        this.type = type;
        this.date = date;
        this.email = email;
        this.content = content;
        this.imageURL = imageURL;
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

    public long getDate() {
        return this.date;
    }

    public void setDate(long date) {
        this.date = date;
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

    @Override
    public String toString() {
        return "{" +
            " title='" + getTitle() + "'" +
            ", publisher='" + getPublisher() + "'" +
            ", type='" + getType() + "'" +
            ", date='" + getDate() + "'" +
            ", email='" + getEmail() + "'" +
            ", content='" + getContent() + "'" +
            ", imageURL='" + getImageURL() + "'" +
            "}";
    }

}