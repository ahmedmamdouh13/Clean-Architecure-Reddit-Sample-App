package com.example.ahmedmamdouh13.takenotesmvpstudy.mvp.models.POJO;

/**
 * Created by ahmedmamdouh13 on 05/04/18.
 */

public class PostModel {

    private String name;

    public PostModel() {
    }

    public PostModel(String string){
        name=string;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
