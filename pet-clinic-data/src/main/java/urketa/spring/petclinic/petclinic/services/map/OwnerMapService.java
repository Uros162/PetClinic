package urketa.spring.petclinic.petclinic.services.map;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import urketa.spring.petclinic.petclinic.model.Owner;
import urketa.spring.petclinic.petclinic.model.Pet;
import urketa.spring.petclinic.petclinic.services.OwnerService;
import urketa.spring.petclinic.petclinic.services.PetService;
import urketa.spring.petclinic.petclinic.services.PetTypeService;

import java.util.Set;

@Service
@Profile({"default","map"})
public class OwnerMapService extends AbstractMapService<Owner,Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Owner findById(Long id) {


        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        if (owner != null){
            owner.getPets().forEach(pet -> {
                if (pet.getPetType() != null){
                    if(pet.getPetType().getId() == null){
                        pet.setPetType(petTypeService.save(pet.getPetType()));
                    }
                }else {throw new RuntimeException("Pet type is requred");}

                if (pet.getId() == null){
                   Pet savedPet = petService.save(pet);

                   pet.setId(savedPet.getId());
                }
            });
        }
        return super.save(owner);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.findById(id);

    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner findByLastName(String lastname) {
        return null;
    }
}
