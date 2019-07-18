package com.mum.studentmis.controller;


import com.mum.studentmis.domain.User;
import com.mum.studentmis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(UserController.BASE_URL)
public class UserController {

    public static  final String BASE_URL = "/api/vi/users";

    @Autowired
    private UserService userService;



    @GetMapping
    public Collection<User> getAllUser(){
        return  userService.getAllUser();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long  id){
        return userService.findUserById(id);
    }

    @PostMapping("/add")
    @ResponseStatus()
    public User save(@RequestBody User user){
            System.out.println("Fuck");
         return  userService.saveUser(user);
    }
    @DeleteMapping("/delete")
    public void deleteUser(User user){
        userService.deleteUser(user);
    }

    @PutMapping("/update")
    public void updateUser(User user){
        userService.update(user);
    }
    @GetMapping("/user/{username}")
    public User findbyUserName(@PathVariable String username){
        return userService.findByUsername(username);
    }

}
