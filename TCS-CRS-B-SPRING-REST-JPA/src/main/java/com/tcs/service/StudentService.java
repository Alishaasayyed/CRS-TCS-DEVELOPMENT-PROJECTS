/**
 * 
 */
package com.tcs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.entity.Student;
import com.tcs.repository.StudentRepository;

/**
 * @author springuser01
 *
 */
@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;

	
	
	@Transactional
	public int updateApproval(Integer id) {
		 return studentRepository.updateStudentApproval(id);
	}
}
