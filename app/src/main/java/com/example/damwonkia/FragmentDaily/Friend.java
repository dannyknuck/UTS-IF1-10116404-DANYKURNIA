package com.example.damwonkia.FragmentDaily;

public class Friend {

    private String name;
    private int photo;

    public Friend() {
    }

    public Friend(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    //GETTER


    public String getName() {
        return name;
    }

    public int getPhoto() {
        return photo;
    }

    //SETTER


    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
