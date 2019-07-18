package com.mum.studentmis.service;


import com.mum.studentmis.domain.User;
import com.mum.studentmis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
   private UserRepository userRepository;


    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).get();
    }


    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User saveUser(User user){

        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(User user) {
         userRepository.delete(user);
    }

    @Override
    public void update(User user) {
        userRepository.save(user);
    }
}
