package com.paypal.bfs.test.employeeserv.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.List;

@Entity
public class Address {
	
	@Id
	@GeneratedValue
	@Column(insertable = false, updatable = false)
    private Integer id;

    /**
     * line1
     * 
     */

    private String line1;
    /**
     * line2
     * 
     */

    private String line2;
    /**
     * city
     * 
     */

    private String city;
    /**
     * state
     * 
     */

    private String state;
    /**
     * country
     * 
     */

    private String country;
    /**
     * zipcode
     * 
     */

    private String zipcode;


    /**
     * line1
     * 
     */
    
    //@ManyToOne(cascade = CascadeType.ALL)
    //@JoinColumn (name = "id", insertable = false, updatable = false)
    //private Employee employee;
    
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
    
    public String getLine1() {
        return line1;
    }

    /**
     * line1
     * 
     */
    
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    /**
     * line2
     * 
     */
    
    public String getLine2() {
        return line2;
    }

    /**
     * line2
     * 
     */
    
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    /**
     * city
     * 
     */
    
    public String getCity() {
        return city;
    }

    /**
     * city
     * 
     */
    
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * state
     * 
     */
    
    public String getState() {
        return state;
    }

    /**
     * state
     * 
     */
    
    public void setState(String state) {
        this.state = state;
    }

    /**
     * country
     * 
     */
    
    public String getCountry() {
        return country;
    }

    /**
     * country
     * 
     */
    
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * zipcode
     * 
     */
    
    public String getZipcode() {
        return zipcode;
    }

    /**
     * zipcode
     * 
     */
    
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    
}
