package pl.swozniak.petclinic.services.map;

import org.springframework.stereotype.Service;
import pl.swozniak.petclinic.model.Speciality;
import pl.swozniak.petclinic.model.Vet;
import pl.swozniak.petclinic.services.SpecialityService;
import pl.swozniak.petclinic.services.VetService;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService  {

    private final SpecialityService specialityService;

    public VetMapService(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {

        if (object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpecialty = specialityService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet findByLastName(String lastName) {
        return this.findAll()
                .stream()
                .filter(vet -> vet.getLastName().equalsIgnoreCase(lastName))
                .findFirst()
                .orElse(null);
    }
}
