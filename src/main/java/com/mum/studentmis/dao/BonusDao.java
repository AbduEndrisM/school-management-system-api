package com.mum.studentmis.dao;

import com.mum.studentmis.domain.Bonus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BonusDao extends JpaRepository<Bonus, String> {
}