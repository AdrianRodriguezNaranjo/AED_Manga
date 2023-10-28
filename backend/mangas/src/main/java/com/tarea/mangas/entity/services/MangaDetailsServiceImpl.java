package com.tarea.mangas.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarea.mangas.entity.dao.IMangaDetailsDao;
import com.tarea.mangas.entity.models.MangaDetails;

@Service
public class MangaDetailsServiceImpl implements IMangaDetailsService {

	@Autowired
	private IMangaDetailsDao mangaDetailsDao;

	@Override
	public List<MangaDetails> getAll() {
		return (List<MangaDetails>) mangaDetailsDao.findAll();
	}

	@Override
	public MangaDetails getOne(long id) {
		return mangaDetailsDao.findById(id).orElse(null);
	}

	@Override
	public void post(MangaDetails mangaDetails) {
		mangaDetailsDao.save(mangaDetails);
	}

	@Override
	public void put(MangaDetails mangaDetails, long id) {
		MangaDetails existingMangaDetails = this.getOne(id);
		if (existingMangaDetails != null) {
			existingMangaDetails.setSynopsis(mangaDetails.getSynopsis());
			existingMangaDetails.setChapter(mangaDetails.getChapter());
			mangaDetailsDao.save(existingMangaDetails);
		}
	}

	@Override
	public void delete(long id) {
		mangaDetailsDao.deleteById(id);
	}
}
