package com.example.CDLibrary.model;


import jakarta.persistence.*;

@Entity
public class CD {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String title;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    Artist artist;

    public CD()  {}

    public CD(String title, Artist artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
