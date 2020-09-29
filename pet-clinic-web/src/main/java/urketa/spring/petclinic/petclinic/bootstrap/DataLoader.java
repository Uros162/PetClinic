package urketa.spring.petclinic.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import urketa.spring.petclinic.petclinic.model.Owner;
import urketa.spring.petclinic.petclinic.model.Pet;
import urketa.spring.petclinic.petclinic.model.PetType;
import urketa.spring.petclinic.petclinic.model.Vet;
import urketa.spring.petclinic.petclinic.services.OwnerService;
import urketa.spring.petclinic.petclinic.services.PetTypeService;
import urketa.spring.petclinic.petclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatType = petTypeService.save(cat);

        Owner owner1  =new Owner();

        owner1.setFirstname("Jovandeka");
        owner1.setLastname("Popovic");
        owner1.setAddress("Milentija Popovica 3");
        owner1.setCity("Obrenovac");
        owner1.setTelephone("06302556048");

        Pet jovandekasPet = new Pet();
        jovandekasPet.setPetType(savedDogType);
        jovandekasPet.setOwner(owner1);
        jovandekasPet.setBirthDate(LocalDate.now());
        jovandekasPet.setName("Lujo");
        owner1.getPets().add(jovandekasPet);

        ownerService.save(owner1);

        Owner owner2  =new Owner();

        owner2.setFirstname("Radenka");
        owner2.setLastname("Gojkovic");
        owner1.setAddress("Sara de Gola 5");
        owner1.setCity("Bjelovar");
        owner1.setTelephone("0645556048");

        Pet radenkasPet = new Pet();
        radenkasPet.setPetType(savedCatType);
        radenkasPet.setOwner(owner2);
        radenkasPet.setBirthDate(LocalDate.now());
        radenkasPet.setName("Kidi");
        owner2.getPets().add(radenkasPet);
        ownerService.save(owner2);


        System.out.println("Loading Owners...");


        Vet vet1 = new Vet();

        vet1.setFirstname("Zarko");
        vet1.setLastname("Dobric");

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstname("Darinka");
        vet2.setLastname("Marojevic");


        vetService.save(vet1);
        vetService.save(vet2);

        System.out.println("Loading Vets...");


    }
}
