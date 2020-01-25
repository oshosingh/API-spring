package com.example.demo;

import java.util.ArrayList;

public class GenerateUsers {
	
	
	public static ArrayList getUsers() {
		
		UserData obj1 = new UserData("osho");
		UserData obj2 = new UserData("kumar");
		UserData obj3 = new UserData("singh");
		
		ArrayList<UserData> al = new ArrayList<UserData>();
		
		al.add(obj1); al.add(obj2); al.add(obj3);
		
		return al;
	
	}
	
	
	
	

}
