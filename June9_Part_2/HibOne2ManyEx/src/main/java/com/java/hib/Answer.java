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

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString 
@Entity
@Table(name="AnswerHexa")
public class Answer {

	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	private int id;    
	private String answername;    
	private String postedBy;
}
