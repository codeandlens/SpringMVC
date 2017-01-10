package com.dao;

import java.util.List;

import com.entities.Users;

public interface UsersDao {
	public List<Users> list();
	public boolean delete(Users users);
	public boolean saveOrUpdate(Users users);
}
