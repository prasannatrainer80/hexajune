package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Menu")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Menu {

	@Id
	private int menId;
	private String menItem;
	private double menPrice;
	private int menCalories;
	private String menSpeciality;
}
