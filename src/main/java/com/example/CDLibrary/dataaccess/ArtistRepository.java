package com.example.CDLibrary.dataaccess;

import com.example.CDLibrary.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
    Optional<Artist> findByName(String name);
}
