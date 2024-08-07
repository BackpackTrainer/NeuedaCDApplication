package com.example.CDLibrary.model;

public class CD {
    String title;
    String artistName;

    public CD(String title, String artistName) {
        this.title = title;
        this.artistName = artistName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
