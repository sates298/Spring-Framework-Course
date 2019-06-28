package pl.swozniak.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.swozniak.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {

    Vet findByLastName(String lastName);

}
