package com.surya.service;

import java.util.List;

import com.surya.exception.UserException;
import com.surya.model.Reels;
import com.surya.model.User;

public interface ReelsService {
	
	public Reels createReel(Reels reel,User user);
	public List<Reels> findAllReels();
	public List<Reels> findUsersReel(Integer userId) throws UserException;

}
