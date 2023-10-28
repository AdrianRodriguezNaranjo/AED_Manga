package com.tarea.mangas.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.tarea.mangas.entity.models.MangaDetails;

public interface IMangaDetailsDao extends CrudRepository<MangaDetails, Long> {

}
