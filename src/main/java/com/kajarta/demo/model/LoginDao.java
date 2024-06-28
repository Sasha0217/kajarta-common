package com.kajarta.demo.model;

import org.springframework.stereotype.Component;

@Component
public class LoginDao {
	
	public boolean checkLogin(String userName, String userPWD) {
		if("sa".equals(userName) && "tiedan1995".equals(userPWD) ) {
			return true;
		}
		return false;
	}
	
	

}
