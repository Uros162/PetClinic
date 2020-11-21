package urketa.spring.petclinic.petclinic.services.springDataJPA;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import urketa.spring.petclinic.petclinic.model.Pet;
import urketa.spring.petclinic.petclinic.repositories.PetReository;
import urketa.spring.petclinic.petclinic.services.PetService;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springdatajpa")
public class PetDataJPAService implements PetService {

    private PetReository petReository;

    public PetDataJPAService(PetReository petReository) {
        this.petReository = petReository;
    }

    @Override
    public Pet findById(Long aLong) {
        return petReository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet Pet) {
        return null;
    }

    @Override
    public Set<Pet> findAll() {

        Set<Pet> Pets = new HashSet<>();

        petReository.findAll().forEach(Pets::add);

        return Pets;
    }

    @Override
    public void delete(Pet Pet) {
        petReository.delete(Pet);
    }

    @Override
    public void deleteById(Long aLong) {
        petReository.deleteById(aLong);
    }
}
