
package com.ayankhan.springBlog.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document // Optional, defines the table name in the database
public class Blog {

    @Id // Marks this field as the primary key
    // @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates IDs (like auto-increment)
    private String id;

    private String title;
    private String content;
    private String author;

    // public Blog() {} // Empty constructor (required by JPA)

    public Blog(String title, String content) {
        this.title = title;
        this.content = content;
        this.author = "Anonymous";
    }

    // Getters and Setters
    public String getId() {
        return id;
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

    public void setAuthor(String author) {
        this.author = author;
    }
}
