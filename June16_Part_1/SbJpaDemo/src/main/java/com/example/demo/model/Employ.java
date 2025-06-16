package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Employ")
@Getter
@Setter
@ToString
@AllArgsConstructor 
@NoArgsConstructor
public class Employ {

	@Id
	@Column(name="empno")
	private int empno;
	
	@Column(name="name")
	private String name;
	@Column(name="dept")
	private String dept;
	@Column(name="gender")
	private String gender;
	@Column(name="desig")
	private String desig;
	@Column(name="basic")
	private double basic;
	
}
