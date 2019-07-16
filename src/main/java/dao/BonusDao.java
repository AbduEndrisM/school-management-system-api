package dao;

import domain.Bonus;
import domain.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BonusDao extends JpaRepository<Bonus, Long> {
}