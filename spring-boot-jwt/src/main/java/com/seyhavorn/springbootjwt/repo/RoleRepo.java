package com.seyhavorn.springbootjwt.repo;

import com.seyhavorn.springbootjwt.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
