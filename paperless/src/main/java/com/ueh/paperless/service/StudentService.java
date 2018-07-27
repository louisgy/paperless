//package com.ueh.paperless.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.ueh.paperless.dto.Studentsdto;
//import com.ueh.paperless.domain.Students;
//import com.ueh.paperless.StudentsRepository;
//
//
//
//
//@Service
//public class StudentService implements IntStudentService {
//	@Autowired
//	StudentsRepository studentsRepository;
//	
//	@Transactional
//	@Override
//	public Students registerNewStudent(Studentsdto studentsdto) {
//		
//		
//		Students students = new Students();
//		students.setFirstName(studentsdto.getFirstName());
//		students.setLastName(studentsdto.getLastName());
//		students.setEmail(studentsdto.getEmail());
//		students.setDob(studentsdto.getDob());
//		students.setDomain(studentsdto.getDomain());
//		students.setSex(studentsdto.getSex());		
//		students.setGrade(studentsdto.getGrade());
//		students.setUserName(studentsdto.getUserName());
//			//encrypt password
//		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		students.setPassword( passwordEncoder.encode(studentsdto.getPassword()));
//	    		//save students info
//		studentsRepository.save(students);
//		return null;
//	}
//	
////	public boolean EmailExist(String email) {
////		Students students = studentsRepository.findByEmail(email);
////		if(students != null)
////			return true;
////		else
////			return false;
////	}
//
//
//	
//}
