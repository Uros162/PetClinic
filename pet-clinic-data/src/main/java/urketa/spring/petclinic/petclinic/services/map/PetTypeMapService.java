package urketa.spring.petclinic.petclinic.services.map;

import org.springframework.stereotype.Service;
import urketa.spring.petclinic.petclinic.model.Pet;
import urketa.spring.petclinic.petclinic.model.PetType;
import urketa.spring.petclinic.petclinic.services.PetService;
import urketa.spring.petclinic.petclinic.services.PetTypeService;

import java.util.Set;
@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService{

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType t) {
        return super.save(t);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType t) {
    super.delete(t);
    }
}
