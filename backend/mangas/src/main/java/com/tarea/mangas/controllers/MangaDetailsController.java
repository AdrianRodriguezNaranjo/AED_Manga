package com.tarea.mangas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarea.mangas.entity.models.Manga;
import com.tarea.mangas.entity.models.MangaDetails;
import com.tarea.mangas.entity.services.IMangaDetailsService;
import com.tarea.mangas.entity.services.IMangaService;

@CrossOrigin(origins = "*")
@RestController
public class MangaDetailsController {
	
	@Autowired
	private IMangaDetailsService mangaDetailsService;
	
	@Autowired
	private IMangaService mangaService;

	@GetMapping("/mangadetails")
	public List<MangaDetails> getAll() {
		return mangaDetailsService.getAll();
	}

	@GetMapping("/mangadetails/{id}")
	public MangaDetails getUserById(@PathVariable(value = "id") long id) {
		return mangaDetailsService.getOne(id);
	}

	@PostMapping("/mangadetails/mangas/{id}")
	public void post(MangaDetails mangaDetails, @PathVariable(value = "id") long mangaId) {
		Manga manga = mangaService.findById(mangaId); 
	    if (manga != null) {
	        mangaDetails.setManga(manga); 
	        mangaDetailsService.post(mangaDetails);
	    }
	}

	@PutMapping("/mangadetails/mangas/{id}")
	public void put(MangaDetails mangaDetails, @PathVariable(value = "id") long id) {
		mangaDetailsService.put(mangaDetails, id);
	}
	
	@DeleteMapping("/mangadetails/{id}")
    public void delete(@PathVariable(value = "id") long id) {
		mangaDetailsService.delete(id);
    }
}
