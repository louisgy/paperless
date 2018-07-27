//package com.ueh.paperless.dto;
//
//import java.util.Date;
//
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//
//import org.springframework.format.annotation.DateTimeFormat;
//
//import com.ueh.paperless.validator.PasswordMatches;
//import com.ueh.paperless.validator.UniqueEmail;
//import com.ueh.paperless.validator.ValidPassword;
//
//@PasswordMatches
//public class Studentsdto {
//	@NotNull(message="Please enter your firstname")
//	@Size(min = 2, max = 32,message="Please enter a first name with more than 2, or less than 32 character")
//	private String firstName;
//
//	@NotNull(message="Please enter your lastname")
//	@Size(min = 2, max = 32,message="Please enter a lastname with more than 2, or less than 32 character")
//	private String lastName;
//	
//	@UniqueEmail
//	private String email; // email
//	
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	@NotNull(message = "Please provide a date.")
//	private Date dob;
//	
//	
//	private String userName;
//	private String domain; // Physics
//	private String grade; // Applied physics
//
//	// @NotNull(message = "Please pick a selection")
//	private String sex;
//
//	@NotNull(message = "Please provide a password with 8 to 16 characters,including uppercase and alphanumeric symbols")
//	@ValidPassword
//	private String password;
//	
//	@NotNull(message = "Please provide a password.")
//	@ValidPassword
//	private String confirmPassword;
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public Date getDob() {
//		return dob;
//	}
//
//	public void setDob(Date dob) {
//		this.dob = dob;
//	}
//
//	public String getUserName() {
//		return userName;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	public String getDomain() {
//		return domain;
//	}
//
//	public void setDomain(String domain) {
//		this.domain = domain;
//	}
//
//	public String getGrade() {
//		return grade;
//	}
//
//	public void setGrade(String grade) {
//		this.grade = grade;
//	}
//
//	public String getSex() {
//		return sex;
//	}
//
//	public void setSex(String sex) {
//		this.sex = sex;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getConfirmPassword() {
//		return confirmPassword;
//	}
//
//	public void setConfirmPassword(String confirmPassword) {
//		this.confirmPassword = confirmPassword;
//	}
//}
