package com.example.domain.model;

/**
 * Created by ahmedmamdouh13 on 04/04/18.
 */

public class Posts {
    private String name;
    private String imgurl;
    private String article;

    public Posts() {
    }

    public Posts(String string){
        name=string;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
