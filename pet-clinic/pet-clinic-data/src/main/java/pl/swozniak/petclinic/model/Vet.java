package pl.swozniak.petclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vets")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties",
            joinColumns = @JoinColumn(name = "vet_is"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities = new HashSet<>();
}
