package domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public  class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double amount;

    private LocalDate date;

    private String description;


    @OneToMany(cascade = CascadeType.ALL)
    private Student student;

    @OneToMany(cascade = CascadeType.ALL)
    private Donation donation;

    @OneToMany(cascade = CascadeType.ALL)
    private OtherIncome otherIncome;



}



