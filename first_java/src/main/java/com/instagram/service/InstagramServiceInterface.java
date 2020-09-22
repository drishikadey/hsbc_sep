package com.instagram.service;

import java.util.List;

import com.instagram.entity.InstagramUser;

public interface InstagramServiceInterface {
	
	int createImageService(InstagramUser iu) throws Exception;
	
	void createProfileService();
	InstagramUser viewProfileService(InstagramUser iu) throws Exception;
	void deleteProfileService();
	List<InstagramUser> homepageRedirectService(InstagramUser iu) throws Exception;
	int deleteImageService(InstagramUser iu) throws Exception;
	
	
	

}
