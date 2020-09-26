package urketa.spring.petclinic.petclinic.model;

public class Speciality extends BaseEntity{
    private String decsription;

    public String getDecsription() {
        return decsription;
    }

    public void setDecsription(String decsription) {
        this.decsription = decsription;
    }
}
