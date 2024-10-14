package com.itsales.Contoller;

import com.itsales.DTO.Employee;
import com.itsales.DTO.ProfileMatch;
import com.itsales.DTO.Recruiter;
import com.itsales.Service.EmployeeService;
import com.itsales.Service.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    RecruiterService recruiterService;

    @GetMapping("/findMatch")
    public ResponseEntity findMatchingOpportunities(@RequestParam(required = true) List<String> skills, @RequestParam(required = true) List<String> locationPreferences, @RequestParam(required = true) List<String> positionType){
        return ResponseEntity.ok(ProfileMatch.class);
    }

    @GetMapping("/findEmployee")
    public ResponseEntity findEmployee(@RequestParam(required = true) String name, @RequestParam(required = true) String email){
        return ResponseEntity.ok(employeeService.findByNameAndEmail(name, email));
    }

    @GetMapping("/findAllEmployees")
    public ResponseEntity findAllEmployees(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        Pageable pageable = PageRequest.of(page, size, Sort.by("name").ascending());
        Page<Employee> employees = employeeService.findAll(pageable);
        return ResponseEntity.ok(employees);
    }

    @PostMapping("/saveEmployee")
    public ResponseEntity saveEmployee(@RequestBody(required = true) Employee employee){
        return ResponseEntity.ok(employeeService.saveEmployee(employee));
    }

    @PostMapping("/saveEmployees")
    public ResponseEntity saveEmployees(@RequestBody(required = true) List<Employee> employees){
        return ResponseEntity.ok(Employee.class);
    }

    @GetMapping("/findRecruiter")
    public ResponseEntity findRecruiter(@RequestParam(required = true) String name, @RequestParam(required = true) String email){
        return ResponseEntity.ok(recruiterService.findByNameAndEmail(name, email));
    }

    @GetMapping("/findAllRecruiters")
    public ResponseEntity findAllRecruiters(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        Pageable pageable = PageRequest.of(page, size, Sort.by("name").ascending());
        Page<Recruiter> recruiters = recruiterService.findAll(pageable);
        return ResponseEntity.ok(recruiters);
    }

    @PostMapping("/saveRecruiter")
    public ResponseEntity saveRecruiter(@RequestBody(required = true) Recruiter recruiter){
        return ResponseEntity.ok(recruiterService.save(recruiter));
    }

    @PostMapping("/saveRecruiters")
    public ResponseEntity saveRecruiters(@RequestBody(required = true) List<Recruiter> recruiters){
        return ResponseEntity.ok(Recruiter.class);
    }


}
