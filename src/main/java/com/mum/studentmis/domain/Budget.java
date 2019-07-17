package com.mum.studentmis.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public  abstract class Budget {

    @Id
    protected String id = UUID.randomUUID().toString();

    protected double amount;

    protected LocalDate date;

    protected String description;

}
