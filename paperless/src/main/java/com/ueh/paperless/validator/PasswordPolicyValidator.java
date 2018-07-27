//package com.ueh.paperless.validator;
//
//import org.passay.*;
//import org.passay.dictionary.WordListDictionary;
//import org.passay.dictionary.WordLists;
//import org.passay.dictionary.sort.ArraysSort;
//
//import javax.validation.ConstraintValidator;
//import javax.validation.ConstraintValidatorContext;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
////import java.io.FileReader;
////import java.io.IOException;
////import java.util.Arrays;
////import java.util.List;
////import java.util.stream.Collectors;
////
////import javax.validation.ConstraintValidator;
////import javax.validation.ConstraintValidatorContext;
////
//import org.passay.CharacterRule;
////import org.passay.DictionaryRule;
////import org.passay.EnglishCharacterData;
////import org.passay.LengthRule;
////import org.passay.PasswordData;
////import org.passay.PasswordValidator;
////import org.passay.RuleResult;
////import org.passay.WhitespaceRule;
////import org.passay.dictionary.WordListDictionary;
////import org.passay.dictionary.WordLists;
////import org.passay.dictionary.sort.ArraysSort;
//
///*
// * Password Policy enforcement
// * */
//public class PasswordPolicyValidator implements ConstraintValidator<ValidPassword, String> {
//	
//	@Override
//	public boolean isValid(String password, ConstraintValidatorContext context) {
//
//		PasswordValidator validator = new PasswordValidator(
//				// length between 8 and 16 characters
//				new LengthRule(8, 16),
//
//				// at least one upper-case character
//				new CharacterRule(EnglishCharacterData.UpperCase, 1),
//
//				// at least one lower-case character
//				new CharacterRule(EnglishCharacterData.LowerCase, 1),
//
//				// at least one digit character
//				new CharacterRule(EnglishCharacterData.Digit, 1),
//
//				// at least one symbol (special character)
//				new CharacterRule(EnglishCharacterData.Special, 1),
//
//				// no whitespace
//				new WhitespaceRule());
//		
//		RuleResult result = validator.validate(new PasswordData(password));
//		if (result.isValid()) {
//			return true;
//		}
//		return false;
//	}
//
//}
