package com.ueh.paperless.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.ueh.paperless.StudentsRepository;
import com.ueh.paperless.domain.Students;

public class NonExistentEmailValidator implements ConstraintValidator<NonExistentEmail, String> {
	@Autowired
	StudentsRepository studentsRepository;
	
	public boolean isValid(String email, ConstraintValidatorContext arg1) {
		return EmailExist(email);
	}
	
	public boolean EmailExist(String email) {
		Students students= studentsRepository.findByEmail(email);
		if(students != null)
			return true;
		else
			return false;
	}

}
