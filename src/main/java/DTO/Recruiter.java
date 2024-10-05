package DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="recruiters")
public class Recruiter {

    @Id
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
    @Column(name="company")
    private String company;

    @Getter
    @Setter
    @Column(name="sector")
    private String sector;

    @Getter
    @Setter
    @Column(name="technology")
    private String technology;

    @Getter
    @Setter
    @Column(name="requirement_type")
    private String requirementType;

    @Getter
    @Setter
    @Column(name="position_type")
    private String positionType;

    @Getter
    @Setter
    @Column(name="email")
    private String email;

    @Getter
    @Setter
    @Column(name="phone")
    private String phone;

    @Override
    public String toString(){
        return "id: "+this.getId()+", name: "+this.getName()+", company: "+this.getCompany()+", sector: "+this.getSector()+
                ", technology: "+this.getTechnology()+", requirementType: "+this.getRequirementType()+", positionType: "+this.getPositionType()
                +", email: "+this.getEmail()+", phone: "+this.getPhone();
    }
}
