package dao;

import domain.Bonus;
import domain.Tax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxDao extends JpaRepository<Tax, Long> {
}