package com.surya.service;

import java.util.List;

import com.surya.exception.StoryException;
import com.surya.exception.UserException;
import com.surya.model.Story;

public interface StoryService {

	public Story createStory(Story story,Integer userId) throws UserException;
	
	public List<Story> findStoryByUserId(Integer userId) throws UserException, StoryException;
	
	
}
