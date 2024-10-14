package com.itsales.DAO;

import com.itsales.DTO.Recruiter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruiterRepository extends JpaRepository<Recruiter, Integer>{
    Page<Recruiter> findAll(Pageable pageable);
}
