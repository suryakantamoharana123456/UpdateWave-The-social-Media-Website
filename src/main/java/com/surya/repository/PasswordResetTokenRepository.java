package com.surya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {

	PasswordResetToken findByToken(String token);

}
