package com.java.hib;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="EmployeeNew")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int empId;

	    private String name;

	    @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "address_id")  // FK column in Employee table
	    private Address address;
	    
	    
}
