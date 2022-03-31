/**
 * 
 */
package com.tcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.entity.Courses;
import com.tcs.repository.CoursesRepository;

/**
 * @author springuser01
 *
 */
@Service
public class CourseService {
	@Autowired
	CoursesRepository coursesRepository;

	/**
	 * This Service is responsible to add courses
	 * 
	 */
	@Transactional
	public boolean addCourse(Courses course) {
		System.out.println(course);
		System.out.println(coursesRepository.save(course));
		return coursesRepository.save(course) != null;

	}

	/**
	 * This Service is responsible to fetch all courses
	 * 
	 */

	@Transactional
	public List<Courses> getAllCourses() {
		return (List<Courses>) coursesRepository.findAll();
	}

	/**
	 * This Service is responsible to delete courses
	 * 
	 */
	@Transactional
	public void deleteCourse(Integer id) {
		coursesRepository.deleteById(id);
	}
}
