package urketa.spring.petclinic.petclinic.services.map;


import urketa.spring.petclinic.petclinic.model.Owner;
import urketa.spring.petclinic.petclinic.services.CRUDService;

import java.util.Set;

public class OwnerMapService extends AbstractMapService<Owner,Long> implements CRUDService<Owner,Long>{

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(),owner);
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
}
