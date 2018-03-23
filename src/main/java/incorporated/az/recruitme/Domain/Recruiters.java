package incorporated.az.recruitme.Domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
@Data
public class Recruiters extends Persons {

    @Id
    @GeneratedValue
    private Long id;

    @Size(max = 100)
    private String workPhone;


}