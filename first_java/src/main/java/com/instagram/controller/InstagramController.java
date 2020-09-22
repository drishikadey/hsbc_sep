package com.instagram.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.instagram.entity.InstagramUser;
import com.instagram.service.InstagramService;
import com.instagram.service.InstagramServiceInterface;

public class InstagramController  implements InstagramControllerInterface
{
	
private InstagramServiceInterface isi;
	public InstagramController()
	{
	 isi= new InstagramService();	
	} 
	@Override
	public void createImage()throws Exception {
		//take input
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("  Image caption ");
		String str= br.readLine();
		
		InstagramUser iu = new InstagramUser();
		iu.setCaption(str);
		
		
		int i = isi.createImageService(iu);
		
		if (i>0)
		{
			System.out.println(" Clicked Image ");
		}
		else
		{
			System.out.println(" Not Clicked Image ");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteImage() throws Exception {
		//take input
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Delete Image number ? ");
		int num = Integer.parseInt(br.readLine());
		
		InstagramUser iu = new InstagramUser();
		iu.setDelnum(num);
		int i = isi.deleteImageService(iu);
		if (i>0)
		{
			System.out.println(" Deleted Image ");
		}
		else
		{
			System.out.println(" Not deleted Image ");
		}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createProfile() {
		isi.createProfileService();
		System.out.println(" Created ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewProfile()throws Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("  Image caption ");
		String caption= br.readLine();
		System.out.println("  Image num ");
		int inum = Integer.parseInt(br.readLine());
		
		InstagramUser iu = new InstagramUser();
		iu.setCaption(caption);
		iu.setDelnum(inum);
		
		
		InstagramUser returnu = isi.viewProfileService(iu);
		if(returnu!=null)
		{
		System.out.println(" Viewed ");
		System.out.println("the user caption"+returnu.getCaption());
		System.out.println("the user caption"+returnu.getDelnum());
		}
		else
		{
			System.out.println(" Not Viewed ");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProfile() {
		// TODO Auto-generated method stub
		isi.deleteProfileService();
		System.out.println(" Deleted ");
	}

	@Override
	public void homepageRedirect() throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("  Image caption ");
		String caption= br.readLine();
		System.out.println("  Image num ");
		int inum = Integer.parseInt(br.readLine());
		
		InstagramUser iu = new InstagramUser();
		iu.setCaption(caption);
		iu.setDelnum(inum);
		
		List<InstagramUser> ll = isi.homepageRedirectService(iu);
		for(InstagramUser o:ll)
		{
			System.out.println("  Image caption "+o.getCaption());
			System.out.println("  Image caption "+o.getDelnum());
		}
		System.out.println(" Redirected to Home ");
	}

}
