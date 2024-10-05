package com.itsales.Contoller;

import com.itsales.DTO.Employee;
import com.itsales.DTO.ProfileMatch;
import com.itsales.DTO.Recruiter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @GetMapping("/findMatch")
    public ResponseEntity findMatchingOpportunities(@RequestParam(required = true) List<String> skills, @RequestParam(required = true) List<String> locationPreferences, @RequestParam(required = true) List<String> positionType){
        return ResponseEntity.ok(ProfileMatch.class);
    }

    @GetMapping("/findEmployee")
    public ResponseEntity findEmployee(@RequestParam(required = true) String name, @RequestParam(required = true) String email){
        return ResponseEntity.ok(Employee.class);
    }

    @GetMapping("/findAllEmployees")
    public ResponseEntity findAllEmployees(){
        return ResponseEntity.ok(Employee.class);
    }

    @PostMapping("/saveEmployee")
    public ResponseEntity saveEmployee(@RequestBody(required = true) Employee employee){
        return ResponseEntity.ok(Employee.class);
    }

    @PostMapping("/saveEmployees")
    public ResponseEntity saveEmployees(@RequestBody(required = true) List<Employee> employees){
        return ResponseEntity.ok(Employee.class);
    }

    @GetMapping("/findRecruiter")
    public ResponseEntity findRecruiter(@RequestParam(required = true) String name, @RequestParam(required = true) String email){
        return ResponseEntity.ok(Recruiter.class);
    }

    @GetMapping("/findAllRecruiters")
    public ResponseEntity findAllRecruiters(){
        return ResponseEntity.ok(Recruiter.class);
    }

    @PostMapping("/saveRecruiter")
    public ResponseEntity saveRecruiter(@RequestBody(required = true) Recruiter recruiter){
        return ResponseEntity.ok(Recruiter.class);
    }

    @PostMapping("/saveRecruiters")
    public ResponseEntity saveRecruiters(@RequestBody(required = true) List<Recruiter> recruiters){
        return ResponseEntity.ok(Recruiter.class);
    }


}
