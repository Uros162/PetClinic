package urketa.spring.petclinic.petclinic.services;

import urketa.spring.petclinic.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);

    Owner findByLastName(String lastname);

    Owner save (Owner owner);

    Set<Owner> findAll();


}
