package com.facebookweb.service;

import java.sql.SQLException;
import java.util.List;

import com.facebookweb.entity.FacebookUser;

public interface ServiceInterface {

	public int addservice(FacebookUser fu) throws SQLException, ClassNotFoundException;

	public boolean loginProfile(FacebookUser fu);

	public List<FacebookUser> friendProfile(FacebookUser fu);
}
