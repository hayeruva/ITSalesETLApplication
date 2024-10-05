package DTO;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ProfileMatch {

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
    @Column(name="current_location")
    private String currentLocation;

    @Getter
    @Setter
    @Column(name="skill")
    private List<String> skill;

    @Getter
    @Setter
    @Column(name="availability_date")
    private Date availabilityDate;

    @Getter
    @Setter
    @Column(name="isavailable")
    private Boolean isAvailable;

    @Getter
    @Setter
    @Column(name="relocation_preference")
    private List<String> relocationPreference;

    @Getter
    @Setter
    @Column(name="recruiter_match_score")
    private double recruiterMatchScore;

    @Getter
    @Setter
    @Column(name="recruiters_list")
    private List<RecruitersList> recruitersList;

    @Getter
    @Setter
    @Column(name="email")
    private String email;

    @Getter
    @Setter
    @Column(name="phone")
    private String phone;

    ObjectMapper mapper = new ObjectMapper();

    @Override
    public String toString(){
        return "id: "+this.getId()+", name: "+this.getName()+", company: "+this.getCompany()+", currentLocation: "+this.getCurrentLocation()+
                "skills: "+this.getSkill().stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)+", Availability Date: "+
                this.getAvailabilityDate()+", isAvailable: "+this.getIsAvailable()+", relocation peference: "+this.getRelocationPreference().stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)+
                ", recruiter match score: "+this.getRecruiterMatchScore()+", recruiters list: "+this.getRecruitersList().stream().map(recruitersList -> {try{return mapper.writeValueAsString(recruitersList);}catch (Exception e){throw  new RuntimeException(e);}}).
                collect(Collectors.joining(",", "[","]"));
    }

}
