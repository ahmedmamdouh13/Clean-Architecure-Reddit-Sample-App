package com.example.domain.model;

/**
 * Created by ahmedmamdouh13 on 04/04/18.
 */

public class Posts {
    private String name;

    public Posts() {
    }

    public Posts(String string){
        name=string;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
