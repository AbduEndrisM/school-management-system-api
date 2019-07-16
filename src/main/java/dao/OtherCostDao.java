package dao;

import domain.OtherCost;
import domain.OtherIncome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtherCostDao extends JpaRepository<OtherCost, Long> {
}