package com.facebookweb.service;

import java.sql.SQLException;
import java.util.List;

import com.facebook.dao.DaoClass;
import com.facebook.dao.DaoInterface;
import com.facebookweb.entity.FacebookUser;

public class ServiceClass implements ServiceInterface {

	private DaoInterface di;
	public ServiceClass()
	{
		di= new DaoClass();
	}
	@Override
	public int addservice(FacebookUser fu) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		int i = di.adddao(fu);
		return i;
	}
	@Override
	public boolean loginProfile(FacebookUser fu) {
		
		return di.loginProfiledao(fu);
	}
	@Override
	public List<FacebookUser> friendProfile(FacebookUser fu) {
		
		return di.friendProfileDao(fu);
	}

}
