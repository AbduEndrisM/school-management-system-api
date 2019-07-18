package com.mum.studentmis.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class StudentFee extends Payment{


    private String studentId;

    private String studentNames;

    private String department;

    @Column(name = "StudentPaymentType")
    @Enumerated(EnumType.STRING)
    private StudentPaymentType studentPaymentType;


    public StudentFee(String studentId, String department, StudentPaymentType studentPaymentType, String studentNames) {
        this.studentId = studentId;
        this.department = department;
        this.studentPaymentType = studentPaymentType;
        this.studentNames=studentNames;
    }
 
}
