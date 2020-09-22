package com.instagram.dao;

import java.util.List;

import com.instagram.entity.InstagramUser;

public interface InstagramDaoInterface {
	int createImageDao(InstagramUser iu)throws Exception;
	int deleteImageDao(InstagramUser iu) throws Exception;
	void createProfileDao();
	
	void deleteProfileDao();
	InstagramUser viewProfileDao(InstagramUser iu) throws Exception;
	List<InstagramUser> homepageRedirectDao(InstagramUser iu) throws Exception;
}
