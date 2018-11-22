package com.ueh.paperless.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.ueh.paperless.dto.Studentsdto;
import com.ueh.paperless.interfce.PasswordMatchesIntrfc;



public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object>{
	public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, PasswordMatchesIntrfc>{
	@Override
	public boolean isValid (PasswordMatchesIntrfc obj, ConstraintValidatorContext context){
		//Studentsdto students = (Studentsdto) obj;
		PasswordMatchesIntrfc students =(PasswordMatchesIntrfc) obj;
	    return students.getPassword().equals(students.getConfirmPassword());
	    }
}
