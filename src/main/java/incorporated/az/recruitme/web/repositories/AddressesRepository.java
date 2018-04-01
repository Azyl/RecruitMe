package incorporated.az.recruitme.web.repositories;

import incorporated.az.recruitme.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressesRepository extends JpaRepository <Address,Long> {
}
