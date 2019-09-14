package com.sample.oracle.service;

import com.sample.oracle.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository repository;

}
