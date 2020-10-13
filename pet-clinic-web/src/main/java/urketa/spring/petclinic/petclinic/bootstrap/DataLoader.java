package urketa.spring.petclinic.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import urketa.spring.petclinic.petclinic.model.*;
import urketa.spring.petclinic.petclinic.services.OwnerService;
import urketa.spring.petclinic.petclinic.services.PetTypeService;
import urketa.spring.petclinic.petclinic.services.SpecialitiesService;
import urketa.spring.petclinic.petclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private  final SpecialitiesService specialitiesService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialitiesService specialitiesService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialitiesService = specialitiesService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDog = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCat = petTypeService.save(cat);


        Pet jovandekasPet = new Pet();
        jovandekasPet.setPetType(savedDog);
        jovandekasPet.setBirthDate(LocalDate.now());
        jovandekasPet.setName("mile");

        Owner owner1  =new Owner();

        owner1.setFirstname("Jovandeka");
        owner1.setLastname("Popovic");
        owner1.setAddress("Milentija Popovica 34");
        owner1.setCity("Svilajnac");
        owner1.setTelephone("065 256 25 66");
        owner1.getPets().add(jovandekasPet);

        ownerService.save(owner1);

        Pet radenkakasPet = new Pet();
        radenkakasPet.setPetType(savedCat);
        radenkakasPet.setBirthDate(LocalDate.now());
        radenkakasPet.setName("Lujo");


        Owner owner2  =new Owner();

        owner2.setFirstname("Radenka");
        owner2.setLastname("Gojkovic");
        owner2.setAddress("Milentija Miliforovica 34");
        owner2.setCity("Lajkovac");
        owner2.setTelephone("0645566787");
        owner2.getPets().add(radenkakasPet);

        ownerService.save(owner1);
        ownerService.save(owner2);


        System.out.println("Loading Owners...");

        Speciality radiology = new Speciality();
        radiology.setDecsription("Radiology");

        Speciality saved1 = specialitiesService.save(radiology);

        Speciality surgery = new Speciality();
        radiology.setDecsription("surgery");

        Speciality saved2 = specialitiesService.save(surgery);

        Speciality dentisty = new Speciality();
        radiology.setDecsription("Dentisty");
        Speciality saved3 = specialitiesService.save(dentisty);



        Vet vet1 = new Vet();

        vet1.setFirstname("Zarko");
        vet1.setLastname("Dobric");
        vet1.getSpecialities().add(radiology);
        vet1.getSpecialities().add(surgery);


        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstname("Darinka");
        vet2.setLastname("Marojevic");
        vet1.getSpecialities().add(dentisty);


        vetService.save(vet1);
        vetService.save(vet2);

        System.out.println("Loading Vets...");


    }
}
