package urketa.spring.petclinic.petclinic.services.springDataJPA;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import urketa.spring.petclinic.petclinic.model.Vet;
import urketa.spring.petclinic.petclinic.repositories.VetRepository;
import urketa.spring.petclinic.petclinic.services.VetService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetDataJPAService implements VetService {

    private final VetRepository vetRepository;

    public VetDataJPAService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet vet) {
        return vetRepository.save(vet);
    }

    @Override
    public Set<Vet> findAll() {

        Set<Vet> vets  =new HashSet<>();

        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public void delete(Vet vet) {
        vetRepository.delete(vet);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
