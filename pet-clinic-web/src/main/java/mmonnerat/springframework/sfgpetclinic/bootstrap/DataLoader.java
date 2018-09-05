package mmonnerat.springframework.sfgpetclinic.bootstrap;

import mmonnerat.springframework.sfgpetclinic.model.Owner;
import mmonnerat.springframework.sfgpetclinic.model.Vet;
import mmonnerat.springframework.sfgpetclinic.services.OwnerService;
import mmonnerat.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*
CommandLineRunner spring boot specif way to initialize data
when the spring context is completed and ready the method run will be called
 */
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
        Owner owner1 = createOwner(1L, "Michael", "Weston");
        Owner owner2 = createOwner(2L, "Fiona", "Glean");

        ownerService.save(owner1);
        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = createVet(1L,"Sam","Axe");
        Vet vet2 = createVet(2L, "Carol", "Caetano");

        vetService.save(vet1);
        vetService.save(vet2);

        System.out.println("Loaded vets ...");
    }


    private Owner createOwner(Long id, String firstName, String lasName){
        Owner owner = new Owner();
        owner.setFirstName(firstName);
        owner.setLastName(lasName);
        owner.setId(id);

        return owner;
    }

    private Vet createVet(Long id, String firstName, String lasName){
        Vet vet = new Vet();
        vet.setFirstName(firstName);
        vet.setLastName(lasName);
        vet.setId(id);

        return vet;
    }
}
