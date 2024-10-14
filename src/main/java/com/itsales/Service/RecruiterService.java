package com.itsales.Service;

import com.itsales.DAO.RecruiterRepository;
import com.itsales.DTO.Recruiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RecruiterService {

    @Autowired
    RecruiterRepository recruiterRepository;

    public Page<Recruiter> findAll(Pageable pageable){
        return recruiterRepository.findAll(pageable);
    }

    public Recruiter save(Recruiter recruiter){
        return recruiterRepository.save(recruiter);
    }

    public Recruiter findByNameAndEmail(String name, String email){
        return recruiterRepository.findByNameAndEmail(name, email);
    }
}
