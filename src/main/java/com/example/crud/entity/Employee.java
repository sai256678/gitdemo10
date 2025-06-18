package com.example.crud.entity;

import jakarta.persistence.*;

@Entity
public class Employee {
	
        @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long employeeId;  // Primary Key

	    private String firstName;
	    private String lastName;
	    private Date dateOfBirth;
	    private String email;
	    private String phoneNumber;
	    
	    
	    
	    
	    

}