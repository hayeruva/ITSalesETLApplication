package DTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.web.service.annotation.GetExchange;

public class Recruiter {

    @Id
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String company;

    @Getter
    @Setter
    private String sector;

    @Getter
    @Setter
    private String technology;

    @Getter
    @Setter
    private String requirementType;

    @Getter
    @Setter
    private String positionType;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String phone;

    @Override
    public String toString(){
        return "id: "+this.getId()+", name: "+this.getName()+", company: "+this.getCompany()+", sector: "+this.getSector()+
                ", technology: "+this.getTechnology()+", requirementType: "+this.getRequirementType()+", positionType: "+this.getPositionType()
                +", email: "+this.getEmail()+", phone: "+this.getPhone();
    }
}
