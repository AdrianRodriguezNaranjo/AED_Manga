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
import com.tarea.mangas.entity.services.IMangaService;

@CrossOrigin(origins = "*")
@RestController
public class MangaController {
	
	@Autowired
	private IMangaService mangasService;
	
	@GetMapping("/mangas")
	public List<Manga> getAll() {
		return mangasService.getAll();
	}
	
	@GetMapping("/mangas/users/{id}")
	private List<Manga> getAllMangasInUser(@PathVariable(value = "id") int id){
		return mangasService.getAllMangasInUser(id);
	}
	
	@PostMapping("/mangas/users/{id}")
    public void post(Manga manga, @PathVariable(value = "id") long userId) {
		mangasService.post(manga, userId);
    }

    @PutMapping("/mangas/{mangaId}/users/{userId}")
    public void put(Manga manga, @PathVariable(value = "userId") long userId, @PathVariable(value = "mangaId") long mangaId) {
        mangasService.put(manga, userId, mangaId);
    }

    @DeleteMapping("/mangas/{mangaId}/users/{userId}")
    public void delete(@PathVariable(value = "userId") long userId, @PathVariable(value = "mangaId") long mangaId) {
        mangasService.delete(userId, mangaId);
    }
}
