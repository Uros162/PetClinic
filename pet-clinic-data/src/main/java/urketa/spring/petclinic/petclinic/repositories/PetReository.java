package urketa.spring.petclinic.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import urketa.spring.petclinic.petclinic.model.Pet;

public interface PetReository  extends CrudRepository<Pet,Long> {
}
