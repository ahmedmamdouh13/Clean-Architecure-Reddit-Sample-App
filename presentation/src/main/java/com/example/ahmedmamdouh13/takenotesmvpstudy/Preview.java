package com.example.ahmedmamdouh13.takenotesmvpstudy;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ahmedmamdouh13 on 15/09/17.
 */

public class Preview {

    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    @SerializedName("enabled")
    @Expose
    private Boolean enabled;

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

}