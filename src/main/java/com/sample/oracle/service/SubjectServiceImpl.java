package com.sample.oracle.service;

import com.sample.oracle.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements StudentService {

    @Autowired
    private SubjectRepository repository;

}
