package com.java.cybersport.Entity;

import javax.persistence.*;

@Entity
@Table(name = "news")
public class News {
    public News(String text) {
        this.text = text;
    }

    protected News() { }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "text")
    private String text;


    public Integer getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String s) {
        this.text = s;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}