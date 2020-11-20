package urketa.spring.petclinic.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import urketa.spring.petclinic.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner,Long> {

    Owner findByLastName(String lastName);
}
