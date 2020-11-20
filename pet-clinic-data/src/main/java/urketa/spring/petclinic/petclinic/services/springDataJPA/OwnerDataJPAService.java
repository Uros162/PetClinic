package urketa.spring.petclinic.petclinic.services.springDataJPA;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import urketa.spring.petclinic.petclinic.model.Owner;
import urketa.spring.petclinic.petclinic.repositories.OwnerRepository;
import urketa.spring.petclinic.petclinic.repositories.PetReository;
import urketa.spring.petclinic.petclinic.repositories.PetTypeRepository;
import urketa.spring.petclinic.petclinic.services.OwnerService;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springdatajpa")
public class OwnerDataJPAService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetTypeRepository petTypeRepository;
    private final PetReository petReository;

    public OwnerDataJPAService(OwnerRepository ownerRepository, PetTypeRepository petTypeRepository, PetReository petReository) {
        this.ownerRepository = ownerRepository;
        this.petTypeRepository = petTypeRepository;
        this.petReository = petReository;
    }

    @Override
    public Owner findByLastName(String lastname) {
        return ownerRepository.findByLastName(lastname);
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner owner) {
        return null;
    }

    @Override
    public Set<Owner> findAll() {

        Set<Owner> owners = new HashSet<>();

        ownerRepository.findAll().forEach(owners::add);

        return owners;


    }

    @Override
    public void delete(Owner owner) {
        ownerRepository.delete(owner);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}
