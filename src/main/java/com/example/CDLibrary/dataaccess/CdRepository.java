package com.example.CDLibrary.dataaccess;

import com.example.CDLibrary.model.CD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CdRepository extends JpaRepository<CD, Long> {
}
