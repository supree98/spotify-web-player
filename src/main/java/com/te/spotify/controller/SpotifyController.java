package com.te.spotify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.spotify.bean.Song;
import com.te.spotify.bean.SpotifyResponse;
import com.te.spotify.service.SpotifyService;

@RestController
@RequestMapping("/spotify")
@CrossOrigin(origins = "http://localhost:3000")
public class SpotifyController {

	@Autowired
	private SpotifyService service;

	@GetMapping("/songs")
	public SpotifyResponse showAllSongs() {

		SpotifyResponse response = new SpotifyResponse();
		List<Song> songs = service.getAllSongs();
		response.setStatus(200);
		response.setMessage("success");
		response.setList(songs);
		return response;

	}
	
	@GetMapping("/songs/{songId}")
	public SpotifyResponse getSong(@PathVariable Integer songId) {
		
		SpotifyResponse response = new SpotifyResponse();
		Song song = service.getSong(songId);
		response.setStatus(200);
		response.setMessage("success");
		response.setSong(song);
		return response;
		
	}
	
	@PostMapping("/addSong")
	public SpotifyResponse addSong(@RequestBody Song song) {
		
		SpotifyResponse response = new SpotifyResponse();
		Song savedSong = service.addSong(song);
		if(savedSong != null) {
			response.setStatus(200);
			response.setMessage("success");
			return response;
		} else {
			response.setStatus(400);
			response.setMessage("song could'nt add");
			return response;
		}
		
	}
	
	@PutMapping("/updateSong")
	public SpotifyResponse updateSong(@RequestBody Song song) {
		
		SpotifyResponse response = new SpotifyResponse();
		Song savedSong = service.addSong(song);
		if(savedSong != null) {
			response.setStatus(200);
			response.setMessage("success");
			return response;
		} else {
			response.setStatus(400);
			response.setMessage("song could'nt add");
			return response;
		}
		
	}
	
	@DeleteMapping("/deleteSong/{songId}")
	public SpotifyResponse deleteSong(@PathVariable Integer songId) {
		
		SpotifyResponse response = new SpotifyResponse();
		service.deleteSong(songId);
		response.setStatus(200);
		response.setMessage("success");
		return response;
		
	}	

}
