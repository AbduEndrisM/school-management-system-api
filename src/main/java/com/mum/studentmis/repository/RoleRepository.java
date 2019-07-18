package com.mum.studentmis.repository;


import com.mum.studentmis.domain.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Roles,Long> {
//    @Query("select r from Roles r where r.roleName=?1")
//    Roles findByName(String roleName);
}
