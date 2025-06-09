package com.java.hib;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name="QuestionHexa")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qid;
	private String qname;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="ansid")
	private List<Answer> answers;
}
