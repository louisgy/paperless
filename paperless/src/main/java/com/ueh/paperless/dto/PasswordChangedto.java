package com.ueh.paperless.dto;

import com.ueh.paperless.interfce.PasswordMatchesIntrfc;
import com.ueh.paperless.validator.NonExistentEmail;
import com.ueh.paperless.validator.PasswordResetMatches;

@PasswordResetMatches
public class PasswordChangedto implements PasswordMatchesIntrfc {
	
	public interface emailValidation {
		
	}
	
	public interface passwordValidation {		
	}
	
	@NonExistentEmail (groups = {emailValidation.class})
	private String email;
	
	private String password;
	private String confirmPassword;
	private String oldPassword;	
	
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
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	
	
	
	
}
