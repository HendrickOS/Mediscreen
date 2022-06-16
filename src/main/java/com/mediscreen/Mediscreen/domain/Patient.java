package com.mediscreen.Mediscreen.domain;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String fullname;
	private int age;
	private String email;
	private String city;
	private String address;
	private String note;

}
