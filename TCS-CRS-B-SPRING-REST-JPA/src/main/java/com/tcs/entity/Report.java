/**
 * 
 */
package com.tcs.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author springuser01 Report Entity
 *
 */
@Entity
@Table(name = "report")
public class Report {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Student student;
	private String student_id;
	@Column(name = "course_1")
	private String course_1;
	@Column(name = "course_2")
	private String course_2;
	@Column(name = "course_3")
	private String course_3;
	@Column(name = "course_4")
	private String course_4;
	@Column(name = "final_grade")
	private String final_grade;
	@Column(name = "timestamp")
	private String timestamp;

	/**
	 * @return the student_id
	 */
	public String getStudent_id() {
		return student_id;
	}

	/**
	 * @param student_id the student_id to set
	 */
	/**
	 * @return the id
	 */
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

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
	 * @return the course_1
	 */
	public String getCourse_1() {
		return course_1;
	}

	/**
	 * @param course_1 the course_1 to set
	 */
	public void setCourse_1(String course_1) {
		this.course_1 = course_1;
	}

	/**
	 * @return the course_2
	 */
	public String getCourse_2() {
		return course_2;
	}

	/**
	 * @param course_2 the course_2 to set
	 */
	public void setCourse_2(String course_2) {
		this.course_2 = course_2;
	}

	/**
	 * @return the course_3
	 */
	public String getCourse_3() {
		return course_3;
	}

	/**
	 * @param course_3 the course_3 to set
	 */
	public void setCourse_3(String course_3) {
		this.course_3 = course_3;
	}

	/**
	 * @return the course_4
	 */
	public String getCourse_4() {
		return course_4;
	}

	/**
	 * @param course_4 the course_4 to set
	 */
	public void setCourse_4(String course_4) {
		this.course_4 = course_4;
	}

	/**
	 * @return the final_grade
	 */
	public String getFinal_grade() {
		return final_grade;
	}

	/**
	 * @param final_grade the final_grade to set
	 */
	public void setFinal_grade(String final_grade) {
		this.final_grade = final_grade;
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
		return "Report{" + "id=" + id + ", student_id=" + student_id + ",course_1= " + course_1 + ",course_2= "
				+ course_2 + ",course_3= " + course_3 + ",course_4= " + course_4 + ",final_grade= " + final_grade
				+ " ,timestamp='" + timestamp + '\'' + '}';
	}

}
