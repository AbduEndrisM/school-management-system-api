package com.mum.studentmis.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Data
@NoArgsConstructor

public class Tax extends Budget {


    private String fiscalYear;

    @Column(name = "taxType")
    @Enumerated(EnumType.STRING)
    private TaxType taxType;

}
