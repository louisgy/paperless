//package com.ueh.paperless.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.ueh.paperless.domain.Teacher;
//import com.ueh.paperless.repositories.TeacherRepository;
//
//@Controller
//public class TeacherController {
//
//	@Autowired
//	private TeacherRepository teacherRepository;
//
//	@GetMapping("register-teacher")
//	public String teacherModel(Model model) {
//		model.addAttribute("Teacher", new Teacher());
//		return "Teacher/register-teacher";
//	}
//
//	@PostMapping("/register-teacher")
//	public String newTeacher(@RequestParam String firstName, @RequestParam String lastName
//			, @RequestParam String password, @RequestParam String email
//			, @RequestParam String expertise) {
//		Teacher teacher = new Teacher();
//		teacher.setFirstName(firstName);
//		teacher.setLastName(lastName);
//		teacher.setPassword(password);
//		teacher.setEmail(email);
//		teacher.setExpertise(expertise);	
//		teacherRepository.save(teacher);
//		
//		return "Teacher/teacher-dashboard";
//
//	}
//
//}
