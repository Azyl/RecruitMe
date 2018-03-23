package incorporated.az.recruitme.Domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
@Data
public class Persons {

    @Id
    @GeneratedValue
    private Long id;

    @Size(max = 100)
    private String firstName;

    @Size(max = 100)
    private String lastName;

    @Email
    @Size(max = 100)
    @Column(unique = true)
    private String email;

    @OneToOne
    private Address address;

//    public Persons() {}
//
//    public Persons(String firstName, String lastName, String email ,Address address){
//        this.firstName=firstName;
//        this.lastName=lastName;
//        this.email=email;
//        this.address=address;
//    }

}

