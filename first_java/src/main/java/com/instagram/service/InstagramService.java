package com.instagram.service;

import java.util.List;

import com.instagram.dao.InstagramDao;


import com.instagram.dao.InstagramDaoInterface;

import com.instagram.entity.InstagramUser;

public class InstagramService implements InstagramServiceInterface {

	private InstagramDaoInterface idi;
	public InstagramService()
	{
		idi=new InstagramDao();
	}
	@Override
	public int createImageService(InstagramUser iu)throws Exception {
		
		int i = idi.createImageDao(iu);
		
		return 1;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int deleteImageService(InstagramUser iu) throws Exception {
		int i = idi.deleteImageDao(iu);
		// TODO Auto-generated method stub
		return 1;
		
	}

	@Override
	public void createProfileService() {
		idi.createProfileDao();
		// TODO Auto-generated method stub
		
	}

	@Override
	public InstagramUser viewProfileService(InstagramUser iu) throws Exception {
		InstagramUser uu = idi.viewProfileDao(iu);
		return(uu);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProfileService() {
		idi.deleteProfileDao();
		// TODO Auto-generated method stub
		
	}

	@Override
	public
	List<InstagramUser> homepageRedirectService(InstagramUser iu) throws Exception
	{
		List<InstagramUser> ll = idi.homepageRedirectDao(iu);
	return ll;
		// TODO Auto-generated method stub
		
	}
	

	

}
