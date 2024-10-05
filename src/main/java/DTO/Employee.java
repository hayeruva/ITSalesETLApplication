package DTO;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    @Column(name="id")
    private int id;

    @Getter
    @Setter
    @Column(name="name")
    private String name;

    @Getter
    @Setter
    @Column(name="designation")
    private String designation;

    @Getter
    @Setter
    @Column(name="company")
    private String company;

    @Getter
    @Setter
    @Column(name="location")
    private String location;

    @Getter
    @Setter
    @Column(name="preferred_miles_for_relocation")
    private String preferred_miles_for_relocation;

    @Getter
    @Setter
    @Column(name="availability")
    private String availability;

    @Getter
    @Setter
    @Column(name="email")
    private String email;

    @Getter
    @Setter
    @Column(name="phone")
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
