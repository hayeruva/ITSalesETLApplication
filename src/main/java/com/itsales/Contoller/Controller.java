package com.itsales.Contoller;

import com.itsales.DTO.Employee;
import com.itsales.DTO.ProfileMatch;
import com.itsales.DTO.Recruiter;
import com.itsales.Service.EmployeeService;
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

    @GetMapping("/findMatch")
    public ResponseEntity findMatchingOpportunities(@RequestParam(required = true) List<String> skills, @RequestParam(required = true) List<String> locationPreferences, @RequestParam(required = true) List<String> positionType){
        return ResponseEntity.ok(ProfileMatch.class);
    }

    @GetMapping("/findEmployee")
    public ResponseEntity findEmployee(@RequestParam(required = true) String name, @RequestParam(required = true) String email){
        return ResponseEntity.ok(Employee.class);
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
