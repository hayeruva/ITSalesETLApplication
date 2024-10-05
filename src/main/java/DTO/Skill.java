package DTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

public class Skill {

    @Id
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private List<String> skills;

    @Override
    public String toString(){
        return "id: "+this.getId()+", name: "+this.getName()+", skills: "+this.getSkills().stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
    }
}
