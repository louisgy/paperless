//package com.ueh.paperless.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.ueh.paperless.CourseId;
//import com.ueh.paperless.domain.Course;
//import com.ueh.paperless.repositories.CourseRepository;
//
//@Controller
//public class CourseController {
//	
//	@Autowired // This means to get the bean called userRepository
//	private CourseRepository courseRepository;
//	
//	@GetMapping("/create-course")
//	public String createCourse(Model model) {
//		model.addAttribute("Course", new Course());
//		return "course-form";
//	}
//	
//	// Register new course
//		@PostMapping("/create-course")
//		public String newCourseSubmit(@RequestParam String courseCode, @RequestParam String title, @RequestParam String category,
//				@RequestParam int courseNumber,@RequestParam String description) {
//			CourseId courseid = new CourseId();
//			Course course = new Course();
//		    System.out.println("testtt :"+courseid.getId());
//			course.setCourseCode(courseCode);
//			course.setTitle(title);
//			course.setCategory(category);
//			course.setCourseNumber(courseNumber);
//			course.setDescription(description);	
//			course.setCourseId(courseid);
//			courseRepository.save(course);
//			
//			// Find out if there is error with the goal to redirect to the same page with error message included
//			return "dashboard";
//		}
//		
//		
//}
