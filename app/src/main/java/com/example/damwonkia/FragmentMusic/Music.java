package com.example.damwonkia.FragmentMusic;

public class Music {


    //private String name;
    //private String artis;
    //private int foto;
    private String video;


    public Music(/*String name, String artis, int foto,*/ String video) {
        //this.name = name;
        //this.artis = artis;
        //this.foto = foto;
        this.video = video;
    }

    //GETTER


   /* public String getName() {
        return name;
    }

    public String getArtis() {
        return artis;
    }

    public int getFoto() {
        return foto;
    } */

    public String getVideo() {
        return video;
    }

    //SETTER


   /* public void setName(String name) {
        this.name = name;
    }

    public void setArtis(String artis) {
        this.artis = artis;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    } */

    public void setVideo(String video) {
        this.video = video;
    }
}
