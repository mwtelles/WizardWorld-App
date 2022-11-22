package com.mwtelles.hogwartshouses.model.entity;

import android.net.Uri;

public class Staff {

    private int id;
    private String name;
    private String house;
    private String image;

    public Staff(int id, String name, String house, String image) {
        this.id = id;
        this.name = name;
        this.house = house;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
