package com.mum.studentmis.dao;

import com.mum.studentmis.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaymentDao extends JpaRepository<Payment, String> {
}