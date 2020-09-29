package urketa.spring.petclinic.petclinic.services.map;

import org.springframework.stereotype.Service;
import urketa.spring.petclinic.petclinic.model.Speciality;
import urketa.spring.petclinic.petclinic.services.SpecialitiesService;

import java.util.Set;
@Service
public class SpecialitiesMapService extends AbstractMapService<Speciality,Long> implements SpecialitiesService{
    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality t) {
        return super.save(t);
    }

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality t) {
        super.delete(t);

    }
}
