package com.garden.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserReqDto {
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String mobileNo;
	
	private String password;
	
	private String address;
	
	private String pinCode;
	
	private String city;
	
	private String state;
}
