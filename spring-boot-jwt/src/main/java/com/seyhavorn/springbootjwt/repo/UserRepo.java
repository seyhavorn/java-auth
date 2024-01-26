package com.seyhavorn.springbootjwt.repo;

import com.seyhavorn.springbootjwt.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}