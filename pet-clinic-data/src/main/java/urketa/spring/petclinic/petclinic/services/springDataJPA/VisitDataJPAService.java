package urketa.spring.petclinic.petclinic.services.springDataJPA;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import urketa.spring.petclinic.petclinic.model.Visit;
import urketa.spring.petclinic.petclinic.repositories.VisitRepository;
import urketa.spring.petclinic.petclinic.services.VisitService;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springdatajpa")
public class VisitDataJPAService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitDataJPAService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit Visit) {
        return null;
    }

    @Override
    public Set<Visit> findAll() {

        Set<Visit> Pets = new HashSet<>();

        visitRepository.findAll().forEach(Pets::add);

        return Pets;
    }

    @Override
    public void delete(Visit Visit) {
        visitRepository.delete(Visit);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
