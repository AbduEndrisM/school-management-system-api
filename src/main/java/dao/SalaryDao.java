package dao;

import domain.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryDao extends JpaRepository<Salary, Long> {
}