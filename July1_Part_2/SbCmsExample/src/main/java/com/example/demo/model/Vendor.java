package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Vendor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vendor {
	
	@Id
	private int venId;
	private String venName;
	private String venPhnNo;
	private String venUsername;
	private String venPassword;
	private String venEmail;
}
