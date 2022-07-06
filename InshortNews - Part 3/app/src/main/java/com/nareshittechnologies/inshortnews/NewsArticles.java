package com.nareshittechnologies.inshortnews;

// POJO class - Plain Old Java Objects
public class NewsArticles {
    String title, desc, imageURL, readMoreURL, URL;

    public NewsArticles(String title, String desc, String imageURL, String readMoreURL, String URL) {
        this.title = title;
        this.desc = desc;
        this.imageURL = imageURL;
        this.readMoreURL = readMoreURL;
        this.URL = URL;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getReadMoreURL() {
        return readMoreURL;
    }

    public String getURL() {
        return URL;
    }
}
