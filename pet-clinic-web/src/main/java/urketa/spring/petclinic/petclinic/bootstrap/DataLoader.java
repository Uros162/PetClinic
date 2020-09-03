package urketa.spring.petclinic.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import urketa.spring.petclinic.petclinic.model.Owner;
import urketa.spring.petclinic.petclinic.model.Vet;
import urketa.spring.petclinic.petclinic.services.OwnerService;
import urketa.spring.petclinic.petclinic.services.VetService;
import urketa.spring.petclinic.petclinic.services.map.OwnerMapService;
import urketa.spring.petclinic.petclinic.services.map.VetMapService;

public class DataLoader implements CommandLineRunner {

    private OwnerService ownerService;
    private VetService vetService;

    public DataLoader() {

        ownerService = new OwnerMapService();
        vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1  =new Owner();
        owner1.setId(1L);
        owner1.setFirstname("Jovandeka");
        owner1.setLastname("Popovic");

        ownerService.save(owner1);

        Owner owner2  =new Owner();
        owner2.setId(2L);
        owner2.setFirstname("Radenka");
        owner2.setLastname("Gojkovic");

        ownerService.save(owner1);
        ownerService.save(owner2);


        System.out.println("Loading Owners...");


        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstname("Zarko");
        vet1.setLastname("Dobric");

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstname("Lubinka");
        vet2.setLastname("Marojevic");

        vetService.save(vet1);
        vetService.save(vet2);

        System.out.println("Loading Vets...");


    }
}
