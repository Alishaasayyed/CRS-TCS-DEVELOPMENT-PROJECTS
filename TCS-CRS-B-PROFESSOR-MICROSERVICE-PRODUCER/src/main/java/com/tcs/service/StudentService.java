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

	/**
	 * This Service is responsible to approved student
	 * 
	 * @param student id
	 */
	@Transactional
	public int updateApproval(Integer id) {
		return studentRepository.updateStudentApproval(id);
	}

	/**
	 * This Service is responsible to register student
	 * 
	 * @param Student Object
	 */
	@Transactional
	public boolean registerStudent(Student student) {
		System.out.println(studentRepository.save(student));
		return studentRepository.save(student) != null;

	}
}
