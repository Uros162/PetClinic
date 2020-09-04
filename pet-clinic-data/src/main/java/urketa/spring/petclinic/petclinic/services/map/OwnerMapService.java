package urketa.spring.petclinic.petclinic.services.map;


import org.springframework.stereotype.Service;
import urketa.spring.petclinic.petclinic.model.Owner;
import urketa.spring.petclinic.petclinic.services.CRUDService;
import urketa.spring.petclinic.petclinic.services.OwnerService;

import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapService<Owner,Long> implements OwnerService {

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
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
