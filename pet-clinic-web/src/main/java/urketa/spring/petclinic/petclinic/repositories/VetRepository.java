package urketa.spring.petclinic.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import urketa.spring.petclinic.petclinic.model.Vet;

public interface VetRepository  extends CrudRepository<Vet,Long> {
}
