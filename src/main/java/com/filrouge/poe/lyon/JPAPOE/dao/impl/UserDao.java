package com.filrouge.poe.lyon.JPAPOE.dao.impl;

import java.util.List;
import com.filrouge.poe.lyon.JPAPOE.dao.IUserDao;
import com.filrouge.poe.lyon.JPAPOE.model.User;

public class UserDao extends EntityDao<User> implements IUserDao {

	public UserDao(Dao dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<User> listUsers() {
		// TODO Auto-generated method stub
		return this.findAll(User.class);
	}

	@Override
	public void ajouterUser(User u) {
		// TODO Auto-generated method stub
		this.add(u);

	}

	@Override
	public void modifierUser(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void supprimerUser(User u) {
		// TODO Auto-generated method stub
		this.remove(User.class, u);

	}

	@Override
	public User findUser(Integer i) {
		// TODO Auto-generated method stub
		return this.find(User.class, i);
	}

}
