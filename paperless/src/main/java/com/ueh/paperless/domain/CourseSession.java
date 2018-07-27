//package com.ueh.paperless.domain;
//
//import java.util.ArrayList;
//import java.sql.Date;
//import java.util.List;
//
//import javax.persistence.EmbeddedId;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//
//import com.ueh.paperless.Course;
//
//@Entity
//public class CourseSession {
//
//@Id
//@GeneratedValue(strategy=GenerationType.SEQUENCE)
//private int courseSessionId;
//
//
//@OneToOne
//@JoinColumn(name="course_id")
//private Course courseid;
//
//
//@OneToOne
//@JoinColumn(name="teacher_id")
//private Course teacherid;
//
//@GeneratedValue(strategy=GenerationType.AUTO)
//private int sessionCode;
//
//private Date dateStart;
//private Date dateEnd;
//private float averageGrade;
//public int getCourseSessionId() {
//	return courseSessionId;
//}
//public void setCourseSessionId(int courseSessionId) {
//	this.courseSessionId = courseSessionId;
//}
//public Course getCourseid() {
//	return courseid;
//}
//public void setCourseid(Course courseid) {
//	this.courseid = courseid;
//}
//public Course getTeacherid() {
//	return teacherid;
//}
//public void setTeacherid(Course teacherid) {
//	this.teacherid = teacherid;
//}
//public int getSessionCode() {
//	return sessionCode;
//}
//public void setSessionCode(int sessionCode) {
//	this.sessionCode = sessionCode;
//}
//public Date getDateStart() {
//	return dateStart;
//}
//public void setDateStart(Date dateStart) {
//	this.dateStart = dateStart;
//}
//public Date getDateEnd() {
//	return dateEnd;
//}
//public void setDateEnd(Date dateEnd) {
//	this.dateEnd = dateEnd;
//}
//public float getAverageGrade() {
//	return averageGrade;
//}
//public void setAverageGrade(float averageGrade) {
//	this.averageGrade = averageGrade;
//}
//
//
//
//}
