package com.example.CDLibrary.dataaccess;

import com.example.CDLibrary.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
