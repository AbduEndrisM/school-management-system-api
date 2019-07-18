package com.mum.studentmis.controller;
import com.mum.studentmis.domain.Roles;
import com.mum.studentmis.service.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class RoleController {

    //public static  final String BASE_URL = "/api/vi/users";
    @Autowired
    private RoleServiceImpl roleService;


    @GetMapping("/roles")
    public Collection<Roles> getAllUser(){
        return roleService.findAll();
    }



    @PostMapping("/save")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Roles save(@RequestBody Roles roles){

        return  roleService.createRole(roles);
    }
    @DeleteMapping("/delete")
    public void deleteRoles(Roles roles){
       roleService.deleteRoles(roles);
    }






}
