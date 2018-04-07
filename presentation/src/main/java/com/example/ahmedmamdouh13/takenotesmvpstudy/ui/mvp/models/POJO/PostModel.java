package com.example.ahmedmamdouh13.takenotesmvpstudy.ui.mvp.models.POJO;

/**
 * Created by ahmedmamdouh13 on 05/04/18.
 */

public class PostModel {

    private String name;
    private String imgurl;
    private String dexc;
    private String siteUrl;


    public PostModel() {

    }

    public PostModel(String string){
        name=string;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getDexc() {
        return dexc;
    }

    public void setDexc(String dexc) {
        this.dexc = dexc;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }
}
