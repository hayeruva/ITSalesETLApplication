package DTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ProfileMatch {

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
    private String currentLocation;

    @Getter
    @Setter
    private List<String> skill;

    @Getter
    @Setter
    private Date availabilityDate;

    @Getter
    @Setter
    private Boolean isAvailable;

    @Getter
    @Setter
    private List<String> relocationPreference;

    @Getter
    @Setter
    private double recruiterMatchScore;

    @Getter
    @Setter
    private List<RecruitersList> recruitersList;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
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
