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
@Table(name="speciaities")
public class Speciality extends BaseEntity{

    @Column(name="decsription")
    private String decsription;


}
