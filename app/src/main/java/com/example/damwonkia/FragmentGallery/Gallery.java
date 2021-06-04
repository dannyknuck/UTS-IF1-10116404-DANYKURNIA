package com.example.damwonkia.FragmentGallery;

public class Gallery {

    private String Nama;
    private String Nomor;
    private String Description;
    private int Thumbnail;

    public Gallery() {
    }

    public Gallery(String nama, String nomor, String description, int thumbnail) {
        Nama = nama;
        Nomor = nomor;
        Description = description;
        Thumbnail = thumbnail;
    }

    //GETTER


    public String getNama() {
        return Nama;
    }

    public String getNomor() {
        return Nomor;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    //SETTER


    public void setNama(String nama) {
        Nama = nama;
    }

    public void setNomor(String nomor) {
        Nomor = nomor;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
