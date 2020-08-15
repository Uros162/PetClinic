package urketa.spring.petclinic.petclinic.services;

import urketa.spring.petclinic.petclinic.model.Owner;
import urketa.spring.petclinic.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);


    Vet save (Owner Vet);

    Set<Vet> findAll();
}
