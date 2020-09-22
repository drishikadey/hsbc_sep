package com.first_java.service;

import com.first_java.dao.FacebookDao;
import com.first_java.dao.FacebookDaoInterface;
import com.first_java.entity.FacebookUser;

public class FacebookService implements FacebookServiceInterface{

private FacebookDaoInterface fd;
	
	public FacebookService(){
		fd=new FacebookDao();
	}
	@Override
	public int createProfileService(FacebookUser fu) {
		
		
		int i = fd.createProfileDao(fu);
		return 1;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editProfileService() {
		fd.editProfileDao();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProfileService() {
		// TODO Auto-generated method stub
		fd.deleteProfileDao();
	}

	@Override
	public void viewProfileService() {
		// TODO Auto-generated method stub
		fd.viewProfileDao();
	}

	@Override
	public void searchProfileService() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAllProfileService() {
		// TODO Auto-generated method stub
		
	}

}
