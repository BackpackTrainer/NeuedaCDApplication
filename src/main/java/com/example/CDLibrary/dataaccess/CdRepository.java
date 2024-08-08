package com.example.CDLibrary.dataaccess;

import com.example.CDLibrary.model.CD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CdRepository extends JpaRepository<CD, Long> {

    @Query("SELECT cd FROM CD cd JOIN cd.artist a WHERE a.name = :name ORDER BY title DESC")
    List<CD> findAllByArtistNameOrderedByTitle(@Param("name") String name);
}
