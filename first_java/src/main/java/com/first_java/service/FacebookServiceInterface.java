package com.first_java.service;

import com.first_java.entity.FacebookUser;

public interface FacebookServiceInterface {
	int createProfileService(FacebookUser fu);
	void editProfileService();
	void deleteProfileService();
	void viewProfileService();
	void searchProfileService();
	void viewAllProfileService();
}
