package com.paypal.bfs.test.employeeserv.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {

    /**
     * employee id
     * 
     */
	@Id
	@GeneratedValue
    private Integer id;
    /**
     * first name
     * (Required)
     * 
     */

    private String firstName;
    /**
     * last name
     * (Required)
     * 
     */

    private String lastName;
    /**
     * date of birth
     * 
     */

    private String dateOfBirth;
    /**
     * address resource
     * <p>
     * Address resource object
     * 
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> address;


    /**
     * employee id
     * 
     */
    
    public Integer getId() {
        return id;
    }

    /**
     * employee id
     * 
     */
    
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * first name
     * (Required)
     * 
     */
    
    public String getFirstName() {
        return firstName;
    }

    /**
     * first name
     * (Required)
     * 
     */
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * last name
     * (Required)
     * 
     */
    
    public String getLastName() {
        return lastName;
    }

    /**
     * last name
     * (Required)
     * 
     */
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * date of birth
     * 
     */
    
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * date of birth
     * 
     */
    
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * address resource
     * <p>
     * Address resource object
     * 
     */
    
    public List<Address> getAddress() {
        return address;
    }

    /**
     * address resource
     * <p>
     * Address resource object
     * 
     */
    
    public void setAddress(List<Address> address) {
        this.address = address;
    }
}
