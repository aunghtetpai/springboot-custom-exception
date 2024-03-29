package com.springboot.SpringBootcrud.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.SpringBootcrud.main.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
