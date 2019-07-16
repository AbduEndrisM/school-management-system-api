package domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class StudentFee extends Payment{


    private String studentId;

    private String department;

    private StudentPaymentType studentPaymentType;


    public StudentFee(String studentId, String department, StudentPaymentType studentPaymentType) {
        this.studentId = studentId;
        this.department = department;
        this.studentPaymentType = studentPaymentType;
    }
 
}
