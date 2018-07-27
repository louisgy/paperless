//package com.ueh.paperless.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import com.ueh.paperless.StudentsRepository;
//import com.ueh.paperless.domain.Students;
//import com.ueh.paperless.dto.Passworddto;
//
//public class StudentPasswordResetService implements IntStudentPasswordReset{
//	
//	@Autowired
//	StudentsRepository studentsRepository;
//	private Students students = new Students();
//	@Override
//	public Students resetPassword(Passworddto passworddto) {
//		
//		students.setPassword(passworddto.getNewPassword());
//		studentsRepository.save(students);
//		return null;
//	}
//	
//	public boolean checkCrendentials(String email, String password) {
//		Students students = studentsRepository.findByEmail(email);
//		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		if(passwordEncoder.matches(password, students.getPassword()))
//			return true;
//		else	
//		return false;
//	}
//
//}
