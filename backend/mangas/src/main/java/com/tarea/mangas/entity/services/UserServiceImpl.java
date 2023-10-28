package com.tarea.mangas.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarea.mangas.entity.dao.IUserDao;
import com.tarea.mangas.entity.models.User;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Override
	public List<User> getAll() {
		return (List<User>) userDao.findAll();
	}

	@Override
	public User getUserById(long id) {
		return userDao.findById(id).orElse(null);
	}

	@Override
	public void post(User user) {
		userDao.save(user);
	}

	@Override
	public void put(User user, long id) {
		userDao.findById(id).ifPresent((x) -> {
			user.setId(id);
			userDao.save(user);
		});
	}

	@Override
	public void delete(long id) {
		userDao.findById(id).ifPresent((user) -> {
			userDao.delete(user);
		});
	}
}
