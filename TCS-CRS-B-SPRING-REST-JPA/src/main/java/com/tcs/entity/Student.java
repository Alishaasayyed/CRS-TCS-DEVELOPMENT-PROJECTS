/**
 * 
 */
package com.tcs.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author springuser01 Student Entity
 *
 */
@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "phoneNumber")
	private Integer phoneNumber;
	@Column(name = "dob")
	private Date dob;
	@Column(name = "isStudApproved")
	private Boolean isStudApproved;
	@Column(name = "timestamp")
	private String timestamp;

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phoneNumber
	 */
	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the isStudApproved
	 */
	public Boolean getIsStudApproved() {
		return isStudApproved;
	}

	/**
	 * @param isStudApproved the isStudApproved to set
	 */
	public void setIsStudApproved(Boolean isStudApproved) {
		this.isStudApproved = isStudApproved;
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
		return "Student{" + "id=" + id + ", name=" + name + ",email= " + email + ",phoneNumber= " + phoneNumber
				+ ",dob= " + dob + ",isStudApproved= " + isStudApproved + " ,timestamp='" + timestamp + '\'' + '}';
	}

}
