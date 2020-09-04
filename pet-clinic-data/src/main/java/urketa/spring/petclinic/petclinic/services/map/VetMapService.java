package urketa.spring.petclinic.petclinic.services.map;

import org.springframework.stereotype.Service;
import urketa.spring.petclinic.petclinic.model.Owner;
import urketa.spring.petclinic.petclinic.model.Vet;
import urketa.spring.petclinic.petclinic.services.OwnerService;
import urketa.spring.petclinic.petclinic.services.VetService;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet t) {
        super.delete(t);
    }
}
