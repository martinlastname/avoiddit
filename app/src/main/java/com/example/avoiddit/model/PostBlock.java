package com.example.avoiddit.model;

import java.io.Serializable;

public class PostBlock implements Serializable {
    private String title = "N/A";
    private String description = "N/A";
    private Integer charCount = 0;


    public void setTitle(String inTitle) {
        this.title = inTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDescription(String inDesc) {
        this.description = inDesc;
    }

    public String getDescription() {
        return this.description;
    }

}
