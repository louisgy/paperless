//package com.ueh.paperless.controllers;
//
//import java.sql.Date;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.ueh.paperless.domain.CourseSession;
//
//@Controller
//public class CourseSessionController {
//	
//	  @GetMapping("/create-courseSession")
//	  public String crateCourseSession(Model model) {
//		  model.addAttribute("CourseSession", new CourseSession());
//		  return "/Course/courseSession";
//	  }
//	  
//	  @PostMapping()
//	  public String newCourseSession(@RequestParam Date dateStart, @RequestParam Date dateEnd,
//			  @RequestParam String course) {
//		  CourseSession coursesession = new CourseSession();
//		  coursesession.setDateStart(dateStart);
//		  coursesession.setDateEnd(dateEnd);
//	  
//		 return "/Course/course"; 
//		 
//	  }
//}
