//package com.ueh.paperless;
//
//import java.util.Date;
//
//import javax.persistence.EmbeddedId;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//
//import javax.persistence.ManyToOne;
//import javax.persistence.MapsId;
//
//import com.ueh.paperless.domain.CourseSession;
//
//@Entity
//public class StudentsEnrolled {
//	
//	@EmbeddedId
//	private StudentsEnrolledId id;
//	
//	@MapsId("student_id")
//	@ManyToOne 
//    @JoinColumn(name="studentid", referencedColumnName="studentId")
//	private Students student;
//	
//	@MapsId("coursesession_id")
//	@ManyToOne 
//    @JoinColumn(name="coursesessionid", referencedColumnName="courseSessionId")
//	private CourseSession courseSession;
//	
//	private String email;
//	private String password;
//	private String firstName;
//	private String lastName;
//	private Date dob;
//	private String username;
//	
//	public StudentsEnrolledId getId() {
//		return id;
//	}
//
//	public void setId(StudentsEnrolledId id) {
//		this.id = id;
//	}
//
//	public Students getStudent() {
//		return student;
//	}
//
//	public void setStudent(Students student) {
//		this.student = student;
//	}
//
//	public CourseSession getCourseSession() {
//		return courseSession;
//	}
//
//	public void setCourseSession(CourseSession courseSession) {
//		this.courseSession = courseSession;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public Date getDob() {
//		return dob;
//	}
//
//	public void setDob(Date dob) {
//		this.dob = dob;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	
//}
