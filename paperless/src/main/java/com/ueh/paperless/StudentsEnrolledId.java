package com.ueh.paperless;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class StudentsEnrolledId implements Serializable {
	private int student_id;
	private int coursesession_id;
	
}
