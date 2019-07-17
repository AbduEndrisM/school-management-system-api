package com.mum.studentmis.dao;

import com.mum.studentmis.domain.Tax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxDao extends JpaRepository<Tax, String> {
}