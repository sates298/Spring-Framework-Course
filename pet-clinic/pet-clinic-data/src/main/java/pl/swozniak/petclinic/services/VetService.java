package pl.swozniak.petclinic.services;

import pl.swozniak.petclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long>{

    Vet findByLastName(String lastName);

}
