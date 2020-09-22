package com.first_java.controller;

import java.io.IOException;

public interface FacebookControllerInterface {
	void createProfile() throws IOException;
	void editProfile();
	void deleteProfile();
	void viewProfile();
	void searchProfile();
	void viewAllProfile();
}
