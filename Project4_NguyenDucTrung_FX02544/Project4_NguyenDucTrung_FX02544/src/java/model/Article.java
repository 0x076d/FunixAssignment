package model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Article implements Serializable {

    private int id;
    private String title;
    private String content;
    private Timestamp postTime;
    private String author;
    private String contentSummary;

    public Article() {
    }

    public Article(int id, String title, String content, Timestamp postTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.postTime = postTime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getPostTime() {
        return postTime;
    }

    public void setPostTime(Timestamp postTime) {
        this.postTime = postTime;
    }

    public String getContentSummary() {
        if (content.length() > 10) {
            return content.substring(0, 10);
        }
        return content;
    }

    public void setContentSummary(String contentSummary) {
        this.contentSummary = contentSummary;
    }

}
