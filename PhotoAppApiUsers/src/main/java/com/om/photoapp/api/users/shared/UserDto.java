package com.om.photoapp.api.users.shared;

import java.io.Serializable;

public class UserDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4148952970662919016L;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String userId;
	private String ecryptedPassword;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEcryptedPassword() {
		return ecryptedPassword;
	}
	public void setEcryptedPassword(String ecryptedPassword) {
		this.ecryptedPassword = ecryptedPassword;
	}
	
	

}
