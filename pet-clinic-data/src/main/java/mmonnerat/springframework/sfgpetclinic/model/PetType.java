package mmonnerat.springframework.sfgpetclinic.model;

import java.io.Serializable;

public class PetType implements Serializable {

    private Long ig;

    public Long getIg() {
        return ig;
    }

    public void setIg(Long ig) {
        this.ig = ig;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
