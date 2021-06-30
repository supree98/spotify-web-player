package com.te.spotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.spotify.bean.Song;

@Repository
public interface SpotifyRepository extends JpaRepository<Song, Integer>{

}
