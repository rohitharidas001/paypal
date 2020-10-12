package com.paypal.bfs.test.employeeserv.impl;

import org.springframework.stereotype.Repository;
import com.paypal.bfs.test.employeeserv.api.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
