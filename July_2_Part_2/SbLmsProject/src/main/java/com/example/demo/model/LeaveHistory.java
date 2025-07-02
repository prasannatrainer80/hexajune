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
@Table(name="Leave_History")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LeaveHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leaveId;
	private int leaveNoOfDays;
	private String leaveMngrComments;
	private int empId;
	private Date leaveStartDate;
	private Date leaveEndDate;
	@Enumerated(EnumType.STRING)  // Save as String (preferred)
	private LeaveStatus leaveStatus;
	@Enumerated(EnumType.STRING) 
	private LeaveType leaveType;
	private String leaveReason;
}
