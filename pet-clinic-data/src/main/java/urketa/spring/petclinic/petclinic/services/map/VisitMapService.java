package urketa.spring.petclinic.petclinic.services.map;

import org.springframework.stereotype.Service;
import urketa.spring.petclinic.petclinic.model.Visit;
import urketa.spring.petclinic.petclinic.services.VisitService;

import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit,Long> implements VisitService {
    @Override
    public Visit findById(Long o) {
        return super.findById(o);
    }

    @Override
    public Visit save(Visit visit) {

        if(visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
                || visit.getPet().getOwner().getId() == null){
            throw new RuntimeException("Invalid Visit");
        }

        return super.save(visit);
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Visit o) {
        super.delete(o);
    }

    @Override
    public void deleteById(Long o) {
        super.deleteById(o);
    }
}
