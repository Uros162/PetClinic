package urketa.spring.petclinic.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="speciaities")
public class Speciality extends BaseEntity{

    @Column(name="decsription")
    private String decsription;

    public String getDecsription() {
        return decsription;
    }

    public void setDecsription(String decsription) {
        this.decsription = decsription;
    }
}
