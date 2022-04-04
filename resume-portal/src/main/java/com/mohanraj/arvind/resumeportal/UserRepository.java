package com.mohanraj.arvind.resumeportal;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohanraj.arvind.resumeportal.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByUserName(String userName);
}
