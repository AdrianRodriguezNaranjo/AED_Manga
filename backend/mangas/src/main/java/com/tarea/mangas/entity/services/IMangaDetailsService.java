package com.tarea.mangas.entity.services;

import java.util.List;

import com.tarea.mangas.entity.models.MangaDetails;

public interface IMangaDetailsService {
	public List<MangaDetails> getAll();
	public MangaDetails getOne(long id);
	public void post(MangaDetails mangaDetails);
	public void put(MangaDetails mangaDetails, long id);
	public void delete(long id);
}
