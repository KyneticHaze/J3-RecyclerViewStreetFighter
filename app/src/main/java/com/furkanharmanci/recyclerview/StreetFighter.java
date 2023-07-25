package com.furkanharmanci.recyclerview;


import java.io.Serializable;

public class StreetFighter implements Serializable {

    String name;
    int image;
    String info;

    public StreetFighter(String name,int image, String info) {
        this.name = name;
        this.image = image;
        this.info = info;
    }
}
