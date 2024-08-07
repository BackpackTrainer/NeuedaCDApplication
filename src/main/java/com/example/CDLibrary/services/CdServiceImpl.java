package com.example.CDLibrary.services;

import com.example.CDLibrary.model.CD;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CdServiceImpl implements CdService{
    @Override
    public Iterable<CD> findAll() {
        CD cd1 = new CD("Brilliant Choices", "Pink Floyd");
        CD cd2 = new CD("Abbey Road", "The Beatles");

        List<CD> theCds = new ArrayList<>();
        theCds.add(cd1);
        theCds.add(cd2);

        return theCds;
    }
}
