package com.instagram.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.instagram.entity.InstagramUser;

public class InstagramDao implements InstagramDaoInterface {

	int i;
	
	@Override
	public int createImageDao(InstagramUser iu)throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Database logged ");
		
		
		
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con= DriverManager.getConnection("jdbc:derby:c:/firstdb;create=true","drish","drish");
		PreparedStatement ps = con.prepareStatement("insert into instagramuser(image,caption) values (?,?)");
		
		
		
		ps.setString(1, "");
		ps.setString(2, iu.getCaption());
		
		i= ps.executeUpdate();
		return 1;
		
	}

	@Override
	public int deleteImageDao(InstagramUser iu) throws Exception {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con= DriverManager.getConnection("jdbc:derby:c:/firstdb;create=true","drish","drish");
		PreparedStatement ps = con.prepareStatement("delete from instagramuser where id=?");
		//PreparedStatement ps = con.prepareStatement("select *from instagramuser where name=?");
	
		ps.setInt(1, iu.getDelnum());
		
		i= ps.executeUpdate();
		// TODO Auto-generated method stub
		System.out.println("Database logged ");
		return 1;
		
	}

	@Override
	public void createProfileDao()  {
		// TODO Auto-generated method stub
		System.out.println("Database logged ");
	}

	@Override
	public InstagramUser viewProfileDao(InstagramUser iu) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con= DriverManager.getConnection("jdbc:derby:c:/firstdb;create=true","drish","drish");
		PreparedStatement ps = con.prepareStatement("select *from instagramuser where caption=?");
		//PreparedStatement ps = con.prepareStatement("select *from instagramuser where name=?");
		
		
		
		ps.setString(1, iu.getCaption());
		//ps.setString(1, iu.getDelnum());
		InstagramUser uu = null;
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			 uu= new InstagramUser();
				uu.setDelnum(rs.getInt(3));
			uu.setCaption(rs.getString(2));
		
		}
		System.out.println("Database logged ");
		return uu;
		
		
		
	}

	@Override
	public void deleteProfileDao() {
		// TODO Auto-generated method stub
		System.out.println("Database logged ");
		
	}

	@Override
	public List<InstagramUser> homepageRedirectDao(InstagramUser iu) throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con= DriverManager.getConnection("jdbc:derby:c:/firstdb;create=true","drish","drish");
		PreparedStatement ps = con.prepareStatement("select *from instagramuser where caption=?");
		//PreparedStatement ps = con.prepareStatement("select *from instagramuser where name=?");
		
		List<InstagramUser> ll= new ArrayList();
		
		ps.setString(1, iu.getCaption());
		//ps.setString(1, iu.getDelnum());
		InstagramUser uu = null;
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			 uu= new InstagramUser();
				uu.setDelnum(rs.getInt(3));
			uu.setCaption(rs.getString(2));
			ll.add(uu);
		
		}
		System.out.println("Database logged ");
		return ll;
		
		
		
	}

	

}
