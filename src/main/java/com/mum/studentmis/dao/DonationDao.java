package com.mum.studentmis.dao;

import com.mum.studentmis.domain.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationDao extends JpaRepository<Donation, String> {
}