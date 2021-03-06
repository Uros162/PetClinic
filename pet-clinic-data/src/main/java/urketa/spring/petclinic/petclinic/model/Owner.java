package urketa.spring.petclinic.petclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor

@Entity
@Table(name = "owners")
public class Owner extends  Person {
    @Builder
    public Owner(Long id, String firstname, String lastName, String address, String telephone, String city, Set<Pet> pets) {
        super(id, firstname, lastName);
        this.address = address;
        this.telephone = telephone;
        this.city = city;
        this.pets = pets;
    }

    @Column(name = "adress")
    private String address;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "city")
    private String city;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();


}
