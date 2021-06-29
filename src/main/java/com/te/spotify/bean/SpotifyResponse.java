package com.te.spotify.bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"status", "message"})
public class SpotifyResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private int status;

	private String message;

	private Song song;

	private List<Song> list;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	public List<Song> getList() {
		return list;
	}

	public void setList(List<Song> list) {
		this.list = list;
	}

}
