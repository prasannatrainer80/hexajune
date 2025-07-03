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
@Table(name="Login")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Login {

	@Id
	private String username;
	private String passcode;
}
