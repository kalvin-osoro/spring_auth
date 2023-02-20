package com.guava.security.user;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.security.core.userdetails.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

    Optional<User> findByEmail(String email);
}
