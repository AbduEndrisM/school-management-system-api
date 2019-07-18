package com.mum.studentmis.service;

import com.mum.studentmis.domain.Roles;

import java.util.List;

public interface RoleService {

    Roles createRole(Roles roles);

    void deleteRoles(Roles roles);

    List<Roles> findAll();
}
