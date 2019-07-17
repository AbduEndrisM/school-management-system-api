package com.mum.studentmis.dao;

import com.mum.studentmis.domain.OtherCost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtherCostDao extends JpaRepository<OtherCost, String> {
}