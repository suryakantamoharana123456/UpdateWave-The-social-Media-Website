package com.surya.service;

import com.surya.exception.CommentException;
import com.surya.exception.PostException;
import com.surya.exception.UserException;
import com.surya.model.Comments;

public interface CommentService {
	
	public Comments createComment(Comments comment,Integer postId,Integer userId) throws PostException, UserException;

	public Comments findCommentById(Integer commentId) throws CommentException;
	public Comments likeComment(Integer CommentId,Integer userId) 
			throws UserException, CommentException;
}
