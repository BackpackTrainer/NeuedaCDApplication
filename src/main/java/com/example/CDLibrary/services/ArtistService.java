package com.example.CDLibrary.services;

import com.example.CDLibrary.model.Artist;

public interface ArtistService {
    public Artist saveArtist(Artist artist);

    public Iterable<Artist> findAllArtists();
}
