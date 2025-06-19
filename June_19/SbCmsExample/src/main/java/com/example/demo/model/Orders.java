package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ordId;
	private int cusId;
	private int venId;
	private String walSource;
	private int menId;
	private Date ordDate;
	private int ordQuantity;
	private double ordBillamount;
	@Enumerated(EnumType.STRING)  // Save as String (preferred)
	private OrderStatus ordStatus;
	private String ordComments;
}
