package urketa.spring.petclinic.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import urketa.spring.petclinic.petclinic.model.Owner;
import urketa.spring.petclinic.petclinic.model.Vet;
import urketa.spring.petclinic.petclinic.services.OwnerService;
import urketa.spring.petclinic.petclinic.services.VetService;
import urketa.spring.petclinic.petclinic.services.map.OwnerMapService;
import urketa.spring.petclinic.petclinic.services.map.VetMapService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1  =new Owner();

        owner1.setFirstname("Jovandeka");
        owner1.setLastname("Popovic");

        ownerService.save(owner1);

        Owner owner2  =new Owner();

        owner2.setFirstname("Radenka");
        owner2.setLastname("Gojkovic");

        ownerService.save(owner1);
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
