package com.te.spotify.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.spotify.bean.Song;
import com.te.spotify.repository.SpotifyRepository;

@Service
public class SpotifyService {
	
	@Autowired
	SpotifyRepository repository;
	
	public List<Song> getAllSongs() {
		
		return repository.findAll();
	
	}
	
	public Song getSong(Integer songId) {
		
		return repository.findById(songId).get();
		
	}
	
	public Song addSong(Song song) {
		
		return repository.save(song);
		
	}

	public void deleteSong(Integer songId) {
		
		repository.delete(getSong(songId));
		
	}
	
}
