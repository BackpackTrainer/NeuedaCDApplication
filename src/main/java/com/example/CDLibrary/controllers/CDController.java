package com.example.CDLibrary.controllers;

import com.example.CDLibrary.model.CD;
import com.example.CDLibrary.services.CdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CDController {

    private CdService cdService;

    @GetMapping("/compactdiscs")
    public Iterable<CD> getAllCDs() {

        return cdService.findAll();
    }

    @GetMapping("/compactdiscs/byArtist/{name}")
    public Iterable<CD> findAllByArtistName(@PathVariable String name) {
        return cdService.findByArtistNameOrderByTitle(name);
    }

    @PostMapping("/compactdiscs")
    public CD createCD(@RequestBody CD cd) {
        return cdService.saveCD(cd);
    }

    public CdService getCdService() {
        return cdService;
    }

    @Autowired
    public void setCdService(CdService cdService) {
        this.cdService = cdService;
    }
}
