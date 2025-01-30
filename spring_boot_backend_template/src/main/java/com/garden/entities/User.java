package com.garden.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "User")
public class User extends BaseEntity{
	
	@Column(length = 50, nullable = false)
	private String firstName;
	
	@Column(length = 50, nullable = false)
	private String lastName;
	
	@Column(length = 50, unique = true, nullable = false)
	private String email;
	
	@Column(length = 10, unique = true, nullable = false)
	private String mobileNo;
	
	@Column(nullable = false)
	private String password;
	@Column(length = 100,nullable = false)
	private String address;
	@Column(length = 6, nullable = false)
	private String pinCode;
	@Column(length = 20, nullable = false)
	private String city;
	@Column(length = 20, nullable = false)
	private String state;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20, nullable = false)
	private Role role;
	
	@Column(nullable = false)
	private boolean status; 
	
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	

	
}