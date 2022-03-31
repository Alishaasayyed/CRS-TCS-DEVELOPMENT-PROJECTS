/**
 * 
 */
package com.tcs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.entity.Payment;

/**
 * @author springuser01 Payment Repository
 *
 */
@Repository
public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
