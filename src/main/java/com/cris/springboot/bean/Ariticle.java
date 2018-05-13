package com.cris.springboot.bean;

import io.searchbox.annotations.JestId;

/**
 * @ClassName Ariticle
 * @Description TODO
 * @Author zc-cris
 * @Version 1.0
 **/
public class Ariticle {

    @JestId     // 指定文档的索引id属性
    private Integer id;
    private String author;
    private String title;
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
}
