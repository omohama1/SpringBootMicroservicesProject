package com.om.photoapp.api.users.ui.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserRequestModel {
	
	@NotNull(message="First name cannot be blank or null")
	@Size(min=2,message = "First name cannot be less than two characters")
	private String firstName;
	@NotNull(message="Last name cannot be blank or null")
	@Size(min=2,message = "Last name cannot be less than two characters")
	private String lastName;
	@NotNull(message="Password cannot be blank or null")
	@Size(min=8, max=16,message = "Password cannot be less than eight characters or greater than 16 characters")
	private String password;
	@NotNull(message="Email cannot be blank or null")
	@Email
	private String email;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}
