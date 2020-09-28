package com.facebook.dao;

import java.sql.SQLException;
import java.util.List;

import com.facebookweb.entity.FacebookUser;

public interface DaoInterface {

	public int adddao(FacebookUser fu) throws SQLException, ClassNotFoundException;

	public boolean loginProfiledao(FacebookUser fu) ;

	public List<FacebookUser> friendProfileDao(FacebookUser fu);
}
