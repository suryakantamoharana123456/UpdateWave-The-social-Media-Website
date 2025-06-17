package com.surya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya.model.Comments;


public interface CommentRepository extends JpaRepository<Comments, Integer> {

}
