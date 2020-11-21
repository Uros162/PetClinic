package urketa.spring.petclinic.petclinic.services.springDataJPA;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import urketa.spring.petclinic.petclinic.model.Speciality;
import urketa.spring.petclinic.petclinic.repositories.SpecialityRepository;
import urketa.spring.petclinic.petclinic.services.SpecialitiesService;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springdatajpa")
public class SpecialityDataJPAService implements SpecialitiesService {

    private final SpecialityRepository specialityRepository;

    public SpecialityDataJPAService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality Speciality) {
        return null;
    }

    @Override
    public Set<Speciality> findAll() {

        Set<Speciality> Pets = new HashSet<>();

        specialityRepository.findAll().forEach(Pets::add);

        return Pets;
    }

    @Override
    public void delete(Speciality Speciality) {
        specialityRepository.delete(Speciality);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
