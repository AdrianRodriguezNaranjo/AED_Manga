package com.tarea.mangas.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.tarea.mangas.entity.models.Manga;

public interface IMangaDao extends CrudRepository<Manga, Long> {

}
