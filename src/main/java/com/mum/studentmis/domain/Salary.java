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

    public Salary(String staffId, String department, double amount, LocalDate date, String description) {
        this.staffId = staffId;
        this.department = department;
        this.amount=amount;
        this.date=date;
        this.description=description;
    }
}
