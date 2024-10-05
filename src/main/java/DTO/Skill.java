package DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Skill {

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
    @Column(name="skills")
    private List<String> skills;

    @Override
    public String toString(){
        return "id: "+this.getId()+", name: "+this.getName()+", skills: "+this.getSkills().stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
    }
}
