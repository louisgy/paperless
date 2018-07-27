package com.ueh.paperless;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Embeddable
public class TestId implements Serializable {
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	private int testId;
//	@Embedded
//	private CourseTaughtIdId cth_id; 

}
