package com.java.hib.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NamedQueries(
		@NamedQuery(
				name="validate",
				query = "from Login where userName=:userName AND passCode=:passCode"
				)
		
		)

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="Login")
public class Login {

	@Id
	private String userName;
	private String passCode;
}
