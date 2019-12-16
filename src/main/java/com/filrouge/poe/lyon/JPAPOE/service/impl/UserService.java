package com.filrouge.poe.lyon.JPAPOE.service.impl;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.dao.IUserDao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.Dao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.UserDao;
import com.filrouge.poe.lyon.JPAPOE.model.User;
import com.filrouge.poe.lyon.JPAPOE.service.IUserService;

public class UserService implements IUserService {
	private IUserDao userDao;
	
	public UserService(Dao dao) {
		super();
		// TODO Auto-generated constructor stub
		this.userDao = new UserDao(dao);
	}

	@Override
	public List<User> listUsers() {
		// TODO Auto-generated method stub
		return this.userDao.listUsers();
	}

	@Override
	public void ajouterUser(User u) {
		// TODO Auto-generated method stub
		this.userDao.ajouterUser(u);
		
	}

	@Override
	public void modifierUser(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerUser(User u) {
		// TODO Auto-generated method stub
		this.userDao.ajouterUser(u);
		
	}

	@Override
	public User findUser(Integer i) {
		// TODO Auto-generated method stub
		return this.userDao.findUser(i);
	}

}
