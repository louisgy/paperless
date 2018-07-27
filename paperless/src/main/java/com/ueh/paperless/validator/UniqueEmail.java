///**
// * 
// */
//package com.ueh.paperless.validator;
//
//import static java.lang.annotation.ElementType.FIELD;
//import static java.lang.annotation.RetentionPolicy.RUNTIME;
//
//import java.lang.annotation.Retention;
//import java.lang.annotation.Target;
//
//import javax.validation.Constraint;
//import javax.validation.Payload;
//
//@Target(FIELD)
//@Retention(RUNTIME)
//@Constraint(validatedBy = UniqueEmailValidator.class)
//public @interface UniqueEmail {
//	 String message() default "There already exist an account for this eamil.";
//	    Class<?>[] groups() default { };
//	    Class<? extends Payload>[] payload() default { };
//	  
//}
