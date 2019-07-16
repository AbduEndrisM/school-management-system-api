package domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Staff {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String ID;
    private String firstName;
    private String lastName;
    private  String studentId;

    @OneToMany (cascade = CascadeType.ALL)
    private Payment payment;


}
