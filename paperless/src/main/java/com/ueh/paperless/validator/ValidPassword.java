////package com.ueh.paperless.validator;
//
//import static java.lang.annotation.ElementType.FIELD;
//import static java.lang.annotation.RetentionPolicy.RUNTIME;
//
//import java.lang.annotation.Documented;
//import java.lang.annotation.Retention;
//import java.lang.annotation.Target;
//
//import javax.validation.Constraint;
//import javax.validation.Payload;
//
///*
// * Password Policy enforcement
// * */
//
//@Target(FIELD)
//@Retention(RUNTIME)
//@Constraint(validatedBy = PasswordPolicyValidator.class)
//public @interface ValidPassword {
//	 String message() default "Password do not matches";
//	    Class<?>[] groups() default {};
//	    Class<? extends Payload>[] payload() default {};
//}
