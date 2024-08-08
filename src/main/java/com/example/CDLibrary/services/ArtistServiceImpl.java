package com.example.CDLibrary.services;

import com.example.CDLibrary.dataaccess.ArtistRepository;
import com.example.CDLibrary.model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtistServiceImpl implements ArtistService {
    ArtistRepository artistRepository;

    @Override
    public Artist saveArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    @Override
    public Iterable<Artist> findAllArtists() {
        return artistRepository.findAll();
    }

    @Autowired
    public void setArtistRepository(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }
}
