package domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public  abstract   class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private double amount;

    private LocalDate date;

    private String description;






}



