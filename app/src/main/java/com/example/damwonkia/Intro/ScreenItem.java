package com.example.damwonkia.Intro;

public class ScreenItem {

    String Title,Description;
    int Screening;
    public ScreenItem(String title, String description, int screening) {
        Title = title;
        Description = description;
        Screening = screening;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setScreening(int screening) {
        Screening = screening;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public int getScreening() {
        return Screening;
    }
}
