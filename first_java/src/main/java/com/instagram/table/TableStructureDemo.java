package com.instagram.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import com.instagram.entity.InstagramUser;

public class TableStructureDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con= DriverManager.getConnection("jdbc:derby:c:/firstdb;create=true","drish","drish");
		PreparedStatement ps = con.prepareStatement("select *from instagramuser");
		//PreparedStatement ps = con.prepareStatement("select *from instagramuser where name=?");
		
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData md = rs.getMetaData();
		int i = md.getColumnCount();
		for(int j=1;j<i;j++)
		{
			System.out.println(" name of column "+md.getColumnName(j));
			System.out.println(" type of column "+md.getColumnTypeName(j));
			System.out.println(" Size of column "+md.getColumnDisplaySize(j));
		}
	}

}
