//package com.ueh.paperless.validator;
//
//import javax.validation.ConstraintValidator;
//import javax.validation.ConstraintValidatorContext;
//
//import com.ueh.paperless.dto.PasswordChangedto;
//
//
//public class PasswordResetMatchesValidator implements ConstraintValidator<PasswordResetMatches, Object>{
//	@Override
//	public boolean isValid (Object obj, ConstraintValidatorContext context){
//		PasswordChangedto studentsPasswordChange = (PasswordChangedto) obj;
//
//	    return studentsPasswordChange.getPassword().equals(studentsPasswordChange.getConfirmPassword());
//	    }
//}
//
