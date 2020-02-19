package com.owlexa.newsArticle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "news")
public class News {
    private long id;
    private String img;
    private String title;
    private String wording;

    public News() {

    }

    public News(String img,String title, String wording) {
        this.img = img;
        this.title = title;
        this.wording = wording;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "img", nullable = false)
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }

    @Column(name = "title", nullable = false)
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "wording", nullable = false)
    public String getWording() {
        return wording;
    }
    public void setWording(String address) {
        this.wording = wording;
    }

    @Override
    public String toString() {
        return "News [id=" + id + ", img=" + img + ", title=" + title + ", "
            + "wording=" + wording + "]";
    }

}
