package com.example.CDLibrary.services;

import com.example.CDLibrary.dataaccess.CdRepository;
import com.example.CDLibrary.model.CD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CdServiceImpl implements CdService{

    CdRepository cdRepository;

    @Override
    public Iterable<CD> findAll() {
    return cdRepository.findAll();
    }

    @Override
    public List<CD> findByArtistNameOrderByTitle(String name) {
        return cdRepository.findAllByArtistNameOrderedByTitle(name);
    }
    @Autowired
    public void setCdRepository(CdRepository cdRepository) {
        this.cdRepository = cdRepository;
    }
}


