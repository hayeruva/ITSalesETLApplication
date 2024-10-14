package com.itsales.DAO;

import com.itsales.DTO.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Page<Employee> findAll(Pageable pageable);

    @Query("Select e from Employee e where e.name = :name AND e.email = :email")
    Employee findByNameAndEmail(String name, String email);

}
