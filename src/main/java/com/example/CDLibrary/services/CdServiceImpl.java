package com.example.CDLibrary.services;

import com.example.CDLibrary.dataaccess.CdRepository;
import com.example.CDLibrary.model.CD;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CdServiceImpl implements CdService{

    CdRepository cdRepository;

    @Override
    public Iterable<CD> findAll() {
    return cdRepository.findAll();
    }

    @Override
    public Iterable<CD> findByArtistOrderByArtistDesc(String name) {
        return cdRepository.findByArtistOrderByTitleDesc(name);
    }


    @Autowired
    public void setCdRepository(CdRepository cdRepository) {
        this.cdRepository = cdRepository;
    }
}
