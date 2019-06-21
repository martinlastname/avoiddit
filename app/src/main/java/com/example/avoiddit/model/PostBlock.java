package com.example.avoiddit.model;

import java.io.Serializable;

public class PostBlock implements Serializable {
    private String title = "N/A";
    private String content = "N/A";
    private Integer charCount = 0;

    public PostBlock(String t, String d){
        title = t;
        content = d;
    }

    public void setTitle(String inTitle) {
        this.title = inTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public void setContent(String inDesc) {
        this.content = inDesc;
    }

    public String getContent() {
        return this.content;
    }

}
