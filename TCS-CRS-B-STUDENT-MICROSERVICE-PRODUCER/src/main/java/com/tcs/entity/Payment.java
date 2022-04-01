/**
 * 
 */
package com.tcs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author springuser01 Entity Payment
 *
 */
@Entity
@Table(name = "payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "student_id")
	private int student_id;
	@Column(name = "fee_amount")
	private Float fee_amount;
	@Column(name = "payment_mode")
	private String payment_mode;
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
	 * @return the student_id
	 */
	public int getStudent_id() {
		return student_id;
	}

	/**
	 * @param student_id the student_id to set
	 */
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	/**
	 * @return the fee_amount
	 */
	public Float getFee_amount() {
		return fee_amount;
	}

	/**
	 * @param fee_amount the fee_amount to set
	 */
	public void setFee_amount(Float fee_amount) {
		this.fee_amount = fee_amount;
	}

	/**
	 * @return the payment_mode
	 */
	public String getPayment_mode() {
		return payment_mode;
	}

	/**
	 * @param payment_mode the payment_mode to set
	 */
	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
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
		return "Payment{" + "id=" + id + ", student_id=" + student_id + ",= fee_amount" + fee_amount + ",payment_mode= "
				+ payment_mode + " ,timestamp='" + timestamp + '\'' + '}';
	}

}
