/**
 * 
 */
package com.tcs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.entity.Payment;
import com.tcs.repository.PaymentRepository;

/**
 * @author springuser01
 *
 */
@Service
public class PaymentService {
	@Autowired
	PaymentRepository paymentRepository;

	/**
	 * This Service is responsible to make payment
	 * 
	 */
	@Transactional
	public boolean makePayment(Payment payment) {
		return paymentRepository.save(payment) != null;
	}

}
