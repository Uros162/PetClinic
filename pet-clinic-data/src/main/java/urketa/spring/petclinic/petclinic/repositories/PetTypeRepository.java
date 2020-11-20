package urketa.spring.petclinic.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import urketa.spring.petclinic.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
