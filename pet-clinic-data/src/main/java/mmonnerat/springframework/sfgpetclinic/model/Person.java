package mmonnerat.springframework.sfgpetclinic.model;

import java.io.Serializable;

public class Person extends BaseEntity implements Serializable {


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String firstName;
     private String lastName;
}
