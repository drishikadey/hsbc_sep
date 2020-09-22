package com.instagram.controller;

import java.io.IOException;

public interface InstagramControllerInterface {

	void createImage() throws IOException, Exception;
	void deleteImage()throws IOException, Exception;
	void createProfile()throws IOException;
	void viewProfile() throws Exception;
	void deleteProfile();
	void homepageRedirect() throws Exception;
}
