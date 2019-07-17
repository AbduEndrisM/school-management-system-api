package com.mum.studentmis.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Donation extends Payment{

    private String name;
    private String address;

}


