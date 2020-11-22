package urketa.spring.petclinic.petclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import urketa.spring.petclinic.petclinic.model.Owner;
import urketa.spring.petclinic.petclinic.model.Speciality;
import urketa.spring.petclinic.petclinic.model.Vet;
import urketa.spring.petclinic.petclinic.services.OwnerService;
import urketa.spring.petclinic.petclinic.services.SpecialitiesService;
import urketa.spring.petclinic.petclinic.services.VetService;

import java.util.Set;

@Service
@Profile({"default","map"})
public class VetMapService extends AbstractMapService<Vet,Long> implements VetService {
   private final SpecialitiesService specialitiesService;

    public VetMapService(SpecialitiesService specialitiesService) {
        this.specialitiesService = specialitiesService;
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        if (vet.getSpecialities().size() > 0){
            vet.getSpecialities().forEach(speciality -> {
                if (speciality.getId() == null){
                    Speciality savedSpeciality = specialitiesService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
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
