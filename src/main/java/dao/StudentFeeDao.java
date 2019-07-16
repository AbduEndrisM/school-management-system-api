package dao;

import domain.StudentFee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentFeeDao extends JpaRepository<StudentFee, Long> {
}