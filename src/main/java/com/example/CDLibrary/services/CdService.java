package com.example.CDLibrary.services;

import com.example.CDLibrary.model.CD;

import java.util.List;

public interface CdService {
    public Iterable<CD> findAll();

    List<CD> findByArtistNameOrderByTitle(String name);

}
