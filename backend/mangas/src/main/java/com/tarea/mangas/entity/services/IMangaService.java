package com.tarea.mangas.entity.services;

import java.util.List;

import com.tarea.mangas.entity.models.Manga;

public interface IMangaService {
	public List<Manga> getAll();
	public List<Manga> getAllMangasInUser(long id);
	public void post(Manga manga, long userId);
	public void put(Manga manga, long userId, long mangaId);
	public void delete(long userId, long mangaId);
	public Manga findById(long id);
}
