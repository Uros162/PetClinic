package urketa.spring.petclinic.petclinic.services;

import urketa.spring.petclinic.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CRUDService<Owner,Long>{

    Owner findByLastName(String lastname);




}
