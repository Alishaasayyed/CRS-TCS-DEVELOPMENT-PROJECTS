/**
 * 
 */
package com.tcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.entity.CourseRegisration;
import com.tcs.entity.Report;
import com.tcs.entity.Student;
import com.tcs.repository.CourseRegisrationRepository;

/**
 * @author springuser01
 *
 */
@Service
public class CourseRegistrationService {
	@Autowired
	CourseRegisrationRepository courseRegisrationRepository;

	/**
	 * This Service is responsible to register courses
	 * 
	 */
	@Transactional
	public boolean registerCourse(CourseRegisration courseRegisration) {
		return courseRegisrationRepository.save(courseRegisration) != null;
	}

	/**
	 * This Service is responsible to delete registered courses
	 * 
	 */
	@Transactional
	public void deleteRegisteredourse(Integer id) {
		courseRegisrationRepository.deleteById(id);
	}
}
