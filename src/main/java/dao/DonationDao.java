package dao;

import domain.Donation;
import domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationDao extends JpaRepository<Donation, Long> {
}