/**
 * 
 */
package com.tcs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author springuser01 Course Registration Entity
 */
@Entity
@Table(name = "course_registration")
public class CourseRegisration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "student_id")
	private Integer student_id;
	@Column(name = "course_id")
	private Integer course_id;
	@Column(name = "professor_id")
	private Integer professor_id;
	@Column(name = "timestamp")
	private String timestamp;

	/**
	 * @return the professor_id
	 */
	public Integer getProfessor_id() {
		return professor_id;
	}

	/**
	 * @param professor_id the professor_id to set
	 */
	public void setProfessor_id(Integer professor_id) {
		this.professor_id = professor_id;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the student_id
	 */
	public Integer getStudent_id() {
		return student_id;
	}

	/**
	 * @param student_id the student_id to set
	 */
	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}

	/**
	 * @return the course_id
	 */
	public Integer getCourse_id() {
		return course_id;
	}

	/**
	 * @param course_id the course_id to set
	 */
	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "Courses{" + "id=" + id + ", student_id=" + student_id + ", course_id=" + course_id + ", professor_id="
				+ professor_id + ", timestamp='" + timestamp + '\'' + '}';
	}

}
