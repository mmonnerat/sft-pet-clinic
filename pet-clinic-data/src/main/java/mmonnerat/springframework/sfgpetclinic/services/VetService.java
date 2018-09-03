package mmonnerat.springframework.sfgpetclinic.services;

import mmonnerat.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {


    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
