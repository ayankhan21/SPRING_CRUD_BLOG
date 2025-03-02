
package com.ayankhan.springBlog.model;

import jakarta.persistence.*;

@Entity // Marks this class as a JPA entity (mapped to a database table)
@Table(name = "blogs") // Optional, defines the table name in the database
public class Blog {

    @Id // Marks this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates IDs (like auto-increment)
    private Long id;

    @Column(nullable = false) // Makes this column **not null** in the database
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String author;

    public Blog() {} // Empty constructor (required by JPA)

    public Blog(String title, String content) {
        this.title = title;
        this.content = content;
        this.author = "Anonymous";
    }

    // Getters and Setters
    public Long getId() {
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
