package com.surya.utils;

import com.surya.model.Chat;
import com.surya.model.User;

public class ChatUtil {
	
	public static String chatName(Chat chat,User reqUser) {
		
		for(User user:chat.getUsers()) {
			if(user.getId()!=reqUser.getId()) {
				return user.getFirstName()+" "+user.getLastName();
				
			}
			
		}
		return null;
		
	}

}
