package com.mediscreen.mediscreen.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String fullname;
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private LocalDate birthdate;
	private String gender;
	private String address;
	private String phoneNumber;
	private String note;
}
