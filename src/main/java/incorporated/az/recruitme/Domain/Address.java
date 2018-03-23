package incorporated.az.recruitme.Domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Data
@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    //@NotNull
    @Size(max = 100)
    private String addressLine1;

    //@NotNull
    @Size(max = 100)
    private String addressLine2;

    //@NotNull
    @Size(max = 100)
    private String city;

    //@NotNull
    @Size(max = 100)
    private String state;

    //@NotNull
    @Size(max = 100)
    private String country;

    //@NotNull
    @Size(max = 100)
    private String zipCode;

    private Address() {

    }

    public Address(String addressLine1, String addressLine2, String city,
                   String state, String country, String zipCode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

// Getters and Setters through @Data

}