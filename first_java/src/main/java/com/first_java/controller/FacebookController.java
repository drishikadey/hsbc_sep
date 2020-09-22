package com.first_java.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.first_java.entity.FacebookUser;
import com.first_java.service.FacebookService;
import com.first_java.service.FacebookServiceInterface;

public class FacebookController implements FacebookControllerInterface{
	
	private FacebookServiceInterface fs;
	
	public FacebookController(){
		fs=new FacebookService();
	}

	@Override
	public void createProfile()throws IOException {
		BufferedReader stdin= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter username ");
		String username= stdin.readLine();
		System.out.println("Enter password ");
		String password= stdin.readLine();
		FacebookUser fu= new FacebookUser();
		int i = fs.createProfileService(fu);
		
		if (i>0)
		System.out.println("profile created");
		else 
			System.out.println("profile not created");
	}

	@Override
	public void editProfile() {
		fs.editProfileService();
		System.out.println("profile edited");
		
	}

	@Override
	public void deleteProfile() {
		fs.deleteProfileService();
		System.out.println("profile deleted");
		
	}

	@Override
	public void viewProfile() {
		fs.viewProfileService();
		System.out.println("profile detail");
		
	}

	@Override
	public void searchProfile() {
		fs.searchProfileService();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAllProfile() {
		fs.viewAllProfileService();
		// TODO Auto-generated method stub
		
	}

}
