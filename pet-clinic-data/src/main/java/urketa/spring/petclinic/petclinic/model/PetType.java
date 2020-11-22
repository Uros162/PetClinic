package urketa.spring.petclinic.petclinic.model;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "pet_typs")
public class PetType extends BaseEntity {
    @Column(name = "name")
    private String name;


}
