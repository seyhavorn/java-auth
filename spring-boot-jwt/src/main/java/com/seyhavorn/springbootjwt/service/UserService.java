package com.seyhavorn.springbootjwt.service;

import com.seyhavorn.springbootjwt.domain.Role;
import com.seyhavorn.springbootjwt.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();
}
