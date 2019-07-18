package com.mum.studentmis.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor

public class Salary extends Budget {

    private String staffId;
    private String department;
    private String staffNames;


    public Salary(String staffId, String department, double amount, LocalDate date, String description, String staffNames) {
        this.staffId = staffId;

        this.department = department;
        this.amount=amount;
        this.date=date;
        this.description=description;
        this.staffNames=staffNames;
    }
}
