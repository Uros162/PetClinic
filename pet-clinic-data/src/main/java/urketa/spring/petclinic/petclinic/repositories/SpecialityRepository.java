package urketa.spring.petclinic.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import urketa.spring.petclinic.petclinic.model.Speciality;

public interface SpecialityRepository  extends CrudRepository<Speciality,Long> {
}
