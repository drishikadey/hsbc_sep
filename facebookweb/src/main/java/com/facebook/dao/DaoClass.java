package com.facebook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.facebookweb.entity.FacebookUser;

public class DaoClass implements DaoInterface{
	private Connection con;
	public DaoClass()
	{
		try
		{

			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//Class.forName("com.mysql.jdbc.Driver");
			
			//step 2 create connection with database
			 con=DriverManager.getConnection("jdbc:derby:d:/firstdb;create=true","drish","drish");
		}
		catch(SQLException| ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public int adddao(FacebookUser fu) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
		
		//step 3 create query
		PreparedStatement ps=con.prepareStatement("insert into facebookuser values(?,?,?,?)");
		ps.setString(1, fu.getName());
		ps.setString(2, fu.getPassword());
		ps.setString(3, fu.getEmail());
		ps.setString(4, fu.getAddress());
		
		//step 4 executeQuery
		int i = ps.executeUpdate();
						
		return i;
		
	}

	@Override
	public boolean loginProfiledao(FacebookUser fu)  {
		// TODO Auto-generated method stub
		PreparedStatement ps;
		boolean i=false;
		try {
			ps = con.prepareStatement("select * from facebookuser where name = ? and pass = ?");
			ps.setString(1, fu.getName());
			ps.setString(2, fu.getPassword());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
			   i = true;
			   
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return i;
	}

	@Override
	public List<FacebookUser> friendProfileDao(FacebookUser fu) {
		// TODO Auto-generated method stub
		List<FacebookUser> ll = new ArrayList<FacebookUser> ();
		
		try {
			PreparedStatement ps=con.prepareStatement("select * from friendslist");
			ps.setString(1, fu.getName());
		
			
			
			//step 4 executeQuery
			ResultSet res=ps.executeQuery();
			while(res.next()) {
				FacebookUser f=new FacebookUser();
				f.setName(res.getString(1));
				f.setAddress(res.getString(2));
				ll.add(f);
			}
							
			
		}
		catch(SQLException ee) {
			ee.printStackTrace();
		}
		return ll;
	}

	

	

}
