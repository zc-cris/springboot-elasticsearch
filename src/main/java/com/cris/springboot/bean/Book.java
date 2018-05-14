package com.cris.springboot.bean;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @ClassName Book
 * @Description 如果使用sprig data 的方式来存储数据到ES，需要在javaBean上面使用@Document注解
 * @Author zc-cris
 * @Version 1.0
 **/
@Document(indexName = "cris", type = "books")
public class Book {
    private Integer id;
    private String name;
    private String author;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
