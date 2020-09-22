package com.first_java;

import java.util.*;

public class LinkedListDemo {
	public static void main(String []args)
	{
		LinkedList l =new LinkedList();
		Employee e = new Employee();
		e.setName("name");
		e.setPassword("password");
		
		Employee e2 = new Employee();
		e2.setName("name2");
		e2.setPassword("password2");
		
		l.add(e);
		l.add(e2);

		l.add("String stored");
		l.add(new Integer(3));
		
		for(int i=0;i<l.size();i++)
		{
			
		}
		for(Object oo:l)
		{
			if(oo instanceof Employee) {
				Employee eprint= (Employee)oo;
				System.out.println(e.getName()+"  "+e.getPassword());
			}
			if(oo instanceof String) {
				String sprint= (String)oo;
				System.out.println(sprint);
			}
			if(oo instanceof Integer) {
				Integer iprint= (Integer)oo;
				System.out.println(iprint);
			}
		}
	}
}
