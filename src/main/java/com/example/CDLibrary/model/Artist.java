package com.example.CDLibrary.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Artist {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long artist_id;

    String name;
    @OneToMany(mappedBy = "artist")
    List<CD> cdList = new ArrayList<>();

    public Artist() {}

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
