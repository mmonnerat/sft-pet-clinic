package mmonnerat.springframework.sfgpetclinic.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Pet extends BaseEntity implements Serializable {

    private LocalDate birthday;
    private PetType type;
    private Owner owner;

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
