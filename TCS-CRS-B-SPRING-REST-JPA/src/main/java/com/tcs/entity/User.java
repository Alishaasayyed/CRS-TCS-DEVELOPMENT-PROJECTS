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
 * @author springuser01 User Entity
 */
@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "user_id")
	private String user_id;
	@Column(name = "password")
	private String password;
	@Column(name = "role_id")
	private Integer role_id;
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
	 * @return the user_id
	 */
	public String getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the role_id
	 */
	public Integer getRole_id() {
		return role_id;
	}

	/**
	 * @param role_id the role_id to set
	 */
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
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
		return "User{" + "id=" + id + ", user_id=" + user_id + ", password='" + password + '\'' + ", role_id='"
				+ role_id + ", timestamp='" + timestamp + '\'' + '}';
	}

}
