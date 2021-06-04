package com.example.damwonkia.FragmentDaily;

public class Daily {

    private String Name;
    private String Daily;
    private int Photo;

    public Daily() {
    }

    public Daily(String name, String daily, int photo) {
        Name = name;
        Daily = daily;
        Photo = photo;

    }

    //GETTER


    public String getName() {
        return Name;
    }

    public String getDaily() {
        return Daily;
    }

    public int getPhoto() {
        return Photo;
    }

    //SETTER


    public void setName(String name) {
        Name = name;
    }

    public void setDaily(String daily) {
        Daily = daily;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
