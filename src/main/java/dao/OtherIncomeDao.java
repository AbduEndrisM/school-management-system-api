package dao;

import domain.OtherIncome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtherIncomeDao extends JpaRepository<OtherIncome, Long> {
}