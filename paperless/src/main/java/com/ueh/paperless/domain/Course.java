//package com.ueh.paperless.domain;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.EmbeddedId;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//
//import com.ueh.paperless.CourseId;
//
////import com.ueh.paperless.domain.CourseSession;
//
//@Entity
//
//public class Course {
//
//	@EmbeddedId
//	@GeneratedValue(strategy=GenerationType.TABLE)
//	private CourseId courseId; // course identifier
//	// generated according to a format sequence algorithm
//	private String courseCode; // phy101
//	// specified by user
//	private String title; // tile of the course
//	// not null attribute needed
//	private String category; // physics or math ...
//	// not null attribute needed
//	// sequence of six numbers generated by algorithm
//	private int courseNumber; // number referring to the course
//	
//	private String description; // course description
////	
////	@OneToOne(mappedBy="courseid")
////	private CourseSession coursesession;
//
//	public CourseId getCourseId() {
//		return courseId;
//	}
//
//	public void setCourseId(CourseId courseId) {
//		this.courseId = courseId;
//	}
//
//	public String getCourseCode() {
//		return courseCode;
//	}
//
//	public void setCourseCode(String courseCode) {
//		this.courseCode = courseCode;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getCategory() {
//		return category;
//	}
//
//	public void setCategory(String category) {
//		this.category = category;
//	}
//
//	public int getCourseNumber() {
//		return courseNumber;
//	}
//
//	public void setCourseNumber(int courseNumber) {
//		this.courseNumber = courseNumber;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
////	public CourseSession getCoursesession() {
////		return coursesession;
////	}
////
////	public void setCoursesession(CourseSession coursesession) {
////		this.coursesession = coursesession;
////	}
//
//	
//
//}
