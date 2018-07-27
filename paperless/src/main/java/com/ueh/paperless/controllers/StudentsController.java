//package com.ueh.paperless.controllers;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.Errors;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//
//import com.ueh.paperless.domain.Students;
//
//import com.ueh.paperless.dto.PasswordChangedto;
//import com.ueh.paperless.dto.Studentsdto;
//import com.ueh.paperless.service.StudentService;
//
//
//
//
//
//@Controller
//public class StudentsController {
//	
//	@Autowired
//	private StudentService studentservice;
//
//	Students student = new Students();
//
//	/*
//	 * STUDENTS REGISTRATION *******************************************************************
//	 * */
//	// Register student
//	@GetMapping("/register-students")
//	public String studentForm(Model model) {
//		model.addAttribute("studentsdto", new Studentsdto());
//		return "student/students-form";
//	}
//	
//	// Register student
//	@PostMapping("/register-students")
//	public String newStundentsSubmit(@Valid Studentsdto studentsdto, BindingResult bindingResult) {
//		if (!bindingResult.hasErrors()) {
//			student = createNewStudentAcc(studentsdto, bindingResult);
//		}
//		if (bindingResult.hasErrors()) {
//			return "student/students-form";
//		}
//		return "student/student-dashboard";
//	}
//	
//	/*
//	 * STUDENTS PASSWORD RESET  **********************************************************************
//	 * */
//	//Reset password
//	@GetMapping("/reset-passw")
//	public String resetPassword(Model model) {
//		model.addAttribute("studentsdto", new Studentsdto());
//		return "student/student-reset-password";
//	}
//	
//	// Reset password
//	@PostMapping("/reset-passw")
//	public String resetPassw(@Valid Studentsdto studentsdto, BindingResult bindingResult) {
//		if (!bindingResult.hasErrors()) {
//			student = createNewStudentAcc(studentsdto, bindingResult);
//		}
//		if (bindingResult.hasErrors()) {
//			return "student/students-form";
//		}
//		return "student/student-dashboard";
//	}
//	
//	/*
//	 * STUDENTS LOGIN  **********************************************************************
//	 * */
//	
//	// Student login
//	@GetMapping("/student-login")
//	public String studentLogin(Model model) {
//		model.addAttribute("studentsdto", new Studentsdto());
//		return "student/student-login";
//	} 
//
//	@PostMapping("/student-login")
//	public String studentLoginSubmit(@Valid Studentsdto studentsdto, BindingResult bindingResult) {
//		if (!bindingResult.hasErrors()) {
//			student = createNewStudentAcc(studentsdto, bindingResult);
//		}
//		if (bindingResult.hasErrors()) {
//			return "student/students-form";
//		}
//		return "student/student-dashboard";
//	}
//	
//	 /* ***************  SHOW CHECKING EMAIL PAGE ***********************
//	 Show the page  where the user email can checked before resetting his password 
//	 Remember that the user has not yet logged in  
//	 */
//	@GetMapping("/reset-out-passwd-students")
//	public String resetPasswordLink(Model model) {
//		model.addAttribute("passwordChangedto", new PasswordChangedto());
//		return "student/stdt-rst-passw-chckEmail";
//	}
//	
//	 /* ***************  CHECK IF EMAIL IS IN THE SYSTEM ***********************
//	 Receive user submitted page containing the email and check if the user has been registered
//	 if successful the page where the user reset the password show up 
//	 */
//	@PostMapping("/reset-out-passwd-students")
//	public String emailCheckSubmit(Model model,@ModelAttribute PasswordChangedto passwordChangedto,@Validated(PasswordChangedto.emailValidation.class) PasswordChangedto passwordChangedtortr, Errors errors) {
//		//	public String emailCheckSubmit(Model model,@ModelAttribute PasswordChangedto passwordChangedto,@Valid PasswordChangedto passwordChangedtortr, BindingResult bindingResult) {
//		// Create a new PasswordChangedto object
//		PasswordChangedto resetPassworddto = new PasswordChangedto();
//		// Assign the email coming from the previous checkingEmail form to a new PasswordChangedto that will be 
//		// attach to the form display by this controller, reset form.
//		resetPassworddto.setEmail(passwordChangedto.getConfirmPassword());
//		// attach the PasswordChangedto to the reset password form
//		model.addAttribute("resetPassworddto", resetPassworddto);
//
//		if (!errors.hasErrors()) {  // successful
//			
//		//if (!bindingResult.hasErrors()) {  // successful
//			
//			return "student/stdt-rst-passw";
//		}
//		if (errors.hasErrors()) { // unsuccessful, return to same page
//		//if (bindingResult.hasErrors()) { // unsuccessful, return to same page
//			return "student/stdt-rst-passw-chckEmail";
//		}
//		return "student/stdt-rst-passw";
//	}
//	
//	@PostMapping("/provide-credentials")
//	public String resetPassword(Model model,@ModelAttribute PasswordChangedto passwordChangedto,@Valid PasswordChangedto passwordChangedtortr, BindingResult bindingResult) {
//		// Create a new PasswordChangedto object
//		PasswordChangedto resetPassworddto = new PasswordChangedto();
//		// Assign the email coming from the previous checkingEmail form to a new PasswordChangedto that will be 
//		// attach to the form display by this controller, reset form.
//		resetPassworddto.setEmail(passwordChangedto.getConfirmPassword());
//		// attach the PasswordChangedto to the reset password form
//		model.addAttribute("resetPassworddto", resetPassworddto);
//
//		if (!bindingResult.hasErrors()) {  // successful
//			
//			return "student/stdt-rst-passw";
//		}
//		if (bindingResult.hasErrors()) { // unsuccessful, return to same page
//			return "student/stdt-rst-passw-chckEmail";
//		}
//		return "student/stdt-rst-passw";
//	}
//	
//	
//	
//	// Create Student Account
//	private Students createNewStudentAcc(Studentsdto studentdto, BindingResult bindingResult) {
//		Students registered = null;
//		
//			registered = studentservice.registerNewStudent(studentdto);
//
//		return registered;
//	}
//
//}
