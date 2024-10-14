package com.itsales.Service;

import com.itsales.DAO.EmployeeRepository;
import com.itsales.DTO.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Page<Employee> findAll(Pageable pageable){
        return employeeRepository.findAll(pageable);
    }

    public Employee findByNameAndEmail(String name, String email){
        return employeeRepository.findByNameAndEmail(name, email);
    }

    @Transactional
    public List<Employee> saveAll(List<Employee> employees){
        CopyOnWriteArrayList<Employee> copiedEmployeeList = new CopyOnWriteArrayList<>(employees);
        return employeeRepository.saveAllAndFlush(copiedEmployeeList);
    }


}
