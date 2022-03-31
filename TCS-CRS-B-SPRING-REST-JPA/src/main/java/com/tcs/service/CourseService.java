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

	
	@Transactional
	public boolean addCourse(Courses course) {
		System.out.println(course);
		System.out.println(coursesRepository.save(course));
		return coursesRepository.save(course) != null;

	}

	@Transactional
	public List<Courses> getAllCourses() {
		return (List<Courses>) coursesRepository.findAll();
	}

	@Transactional
	public void deleteCourse(Integer personId) {
		coursesRepository.deleteById(personId);
	}
}
