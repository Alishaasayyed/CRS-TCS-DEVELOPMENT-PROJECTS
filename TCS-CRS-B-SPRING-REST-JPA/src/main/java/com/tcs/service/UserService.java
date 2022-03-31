/**
 * 
 */
package com.tcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.entity.Report;
import com.tcs.entity.Student;
import com.tcs.entity.User;
import com.tcs.repository.UserRepository;

/**
 * @author springuser01
 *
 */
@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	/**
	 * This service is repsonsible to add User
	 *
	 */

	@Transactional
	public boolean addUser(User user) {
		return userRepository.save(user) != null;

	}
	
	
	@Transactional
	public List<User> login(String user_id,String password) {
		return (List<User>) userRepository.login(user_id,password);
	}

}
