package urketa.spring.petclinic.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import urketa.spring.petclinic.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
