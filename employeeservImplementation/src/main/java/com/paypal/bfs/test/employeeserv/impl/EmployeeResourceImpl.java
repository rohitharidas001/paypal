package com.paypal.bfs.test.employeeserv.impl;

import com.paypal.bfs.test.employeeserv.api.EmployeeResource;
import com.paypal.bfs.test.employeeserv.api.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

/**
 * Implementation class for employee resource.
 */
@RestController
public class EmployeeResourceImpl implements EmployeeResource {
	
	@Autowired
	EmployeeRepo employeeRepo;

    @Override
    public ResponseEntity<Employee> employeeGetById(String id) {

        //Employee employee = new Employee();
        //employee.setId(Integer.valueOf(id));
        //employee.setFirstName("BFS");
        //employee.setLastName("Developer");
    	Employee newEmployee = null;
    	Optional<Employee> employee = employeeRepo.findById(Integer.parseInt(id));
    	
    	if(employee.isPresent()){
    		newEmployee = employee.get();
    	}

        return new ResponseEntity<>(newEmployee, HttpStatus.OK);
    }
    
    @Override
    public ResponseEntity<Employee> createEmployee(Employee employee) {
    	
    	Employee newEmployee = employeeRepo.save(employee);

        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
}
