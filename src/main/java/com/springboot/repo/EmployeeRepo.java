package com.springboot.repo;

import com.springboot.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee,Integer> {

    //custom methods
}
