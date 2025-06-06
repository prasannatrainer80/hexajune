package com.java.hib;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Employ")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employ {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.TABLE)
	private int empno;
	private String name;
	private String gender;
	private String dept;
	private String desig;
	private double basic;
}
