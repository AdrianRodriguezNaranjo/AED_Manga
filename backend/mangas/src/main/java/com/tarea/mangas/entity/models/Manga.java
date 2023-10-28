package com.tarea.mangas.entity.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "mangas")
public class Manga implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@JsonIgnore
	@OneToOne(mappedBy = "manga")
	@PrimaryKeyJoinColumn
	MangaDetails mangadetails;

	String name;

	@JsonIgnore
	@ManyToMany(mappedBy = "mangasInUser")
	Set<User> usersWhereToFindThisManga = new HashSet<>();
	
	public Manga(MangaDetails mangadetails, String name) {
		super();
		this.mangadetails = mangadetails;
		this.name = name;
	}

	public Manga() {

	}	

	public MangaDetails getMangadetails() {
		return mangadetails;
	}

	public void setMangadetails(MangaDetails mangadetails) {
		this.mangadetails = mangadetails;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<User> getUsersWhereTofindThisManga() {
		return usersWhereToFindThisManga;
	}

	public void setUsersWhereTofindThisManga(Set<User> usersWhereToFindThisManga) {
		this.usersWhereToFindThisManga = usersWhereToFindThisManga;
	}
}
