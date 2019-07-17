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
public  abstract   class Payment {

    @Id
    private String id = UUID.randomUUID().toString();

    private double amount;

    private LocalDate date;

    private String description;






}



