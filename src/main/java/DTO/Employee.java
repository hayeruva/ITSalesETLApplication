package DTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

public class Employee {

    @Id
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String designation;

    @Getter
    @Setter
    private String company;

    @Getter
    @Setter
    private String location;

    @Getter
    @Setter
    private String preferred_miles_for_relocation;

    @Getter
    @Setter
    private String availability;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String phone;

    //If this is not implemented whenever the toString() method is called
    //on this Object, it returns a memory address
    @Override
    public String toString(){
        return "id : "+this.getId()+", name: "+this.getName()+", designation: "+this.getDesignation()+", company: "+
                this.getCompany()+", location: "+this.getLocation()+", preferred_miles_for_relocation: "+this.getPreferred_miles_for_relocation()+
                ", availability: "+this.getAvailability()+", email: "+this.getEmail()+", phone: "+this.getPhone();
    }
}
