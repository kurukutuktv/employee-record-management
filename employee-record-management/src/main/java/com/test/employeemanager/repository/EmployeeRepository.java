package com.test.employeemanager.repository;

import com.test.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Automatic Query by method name
    void deleteEmployeeById(Long id);

    // Automatic Query by method name
    Optional<Employee> findEmployeeById(Long id);
}
