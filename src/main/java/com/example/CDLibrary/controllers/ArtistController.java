package com.example.CDLibrary.controllers;

import com.example.CDLibrary.model.Artist;
import com.example.CDLibrary.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistController {
    ArtistService  artistService;

    @GetMapping("/artists")
    public Iterable<Artist> findAllArtists() {
        return artistService.findAllArtists();
    }

    @PostMapping
    public ResponseEntity<Artist> createArtist(@RequestBody Artist artist) {
        Artist savedArtist = artistService.saveArtist(artist);
        return new ResponseEntity<>(savedArtist, HttpStatus.CREATED);
    }

    @Autowired
    public void setArtistService(ArtistService artistService) {
        this.artistService = artistService;
    }
}
