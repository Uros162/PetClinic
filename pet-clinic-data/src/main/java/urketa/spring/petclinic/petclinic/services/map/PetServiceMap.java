package urketa.spring.petclinic.petclinic.services.map;

import urketa.spring.petclinic.petclinic.model.Pet;
import urketa.spring.petclinic.petclinic.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long>implements PetService {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
