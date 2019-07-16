package domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Donation {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String ID;
    private String donator;
    private String address;
}
