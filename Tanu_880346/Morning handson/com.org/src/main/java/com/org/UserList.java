package com.org;

import java.util.ArrayList;
import java.util.List;

public class UserList {

	public static void main(String[] args) {

		List<User> users=new ArrayList<User>();
		users.add(new User(101, "Alex", "alex123"));
		users.add(new User(102, "Bravo", "bravo123"));
		users.add(new User(103, "Charles", "charles123"));
		users.add(new User(104, "David", "david123"));
		users.add(new User(105, "Edward", "edward123"));

		for(User user:users) {
			if(user.getName().length()>5) {
				System.out.println(user);
			}
		}
	}

}
