package com.mum.studentmis.service;

import com.mum.studentmis.domain.Roles;
import com.mum.studentmis.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class RoleServiceImpl  implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Roles createRole(Roles roles) {
        return roleRepository.save(roles);
    }

    @Override
    public void deleteRoles(Roles roles){

        roleRepository.delete(roles);

    }

    @Override
    public List<Roles> findAll() {
        return roleRepository.findAll();
    }
}
