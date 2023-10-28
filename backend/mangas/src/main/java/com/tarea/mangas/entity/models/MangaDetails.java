package com.tarea.mangas.entity.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;

@Entity(name = "manga_details")
public class MangaDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	Long id;

	@OneToOne
	@MapsId
	@JoinColumn(name = "id")
	Manga manga;

	String synopsis;

	int chapter;

	public MangaDetails() {

	}

	public MangaDetails(Manga manga, String synopsis, int chapter) {
		super();
		this.manga = manga;
		this.synopsis = synopsis;
		this.chapter = chapter;
	}	

	public Manga getManga() {
		return manga;
	}

	public void setManga(Manga manga) {
		this.manga = manga;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public int getChapter() {
		return chapter;
	}

	public void setChapter(int chapter) {
		this.chapter = chapter;
	}
}
