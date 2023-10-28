package com.tarea.mangas.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.tarea.mangas.entity.models.User;

public interface IUserDao extends CrudRepository<User, Long>{

}
