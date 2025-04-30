package com.demo.RESTful_CRUD_API.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.RESTful_CRUD_API.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}