package com.mum.studentmis.service;


import com.mum.studentmis.domain.User;

import java.util.List;


public interface UserService {

    User findUserById(Long id);

    User findByUsername(String username);

    User saveUser(User user);

    List<User> getAllUser();

    void deleteUser(User user);

    void update(User user);

}
