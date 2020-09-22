package com.first_java.dao;

import com.first_java.entity.FacebookUser;

public interface FacebookDaoInterface {
	int createProfileDao(FacebookUser fu);
	void editProfileDao();
	void deleteProfileDao();
	void viewProfileDao();
	void searchProfileDao();
	void viewAllProfileDao();

}
