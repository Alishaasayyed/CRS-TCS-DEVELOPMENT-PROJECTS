/**
 * 
 */
package com.tcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.entity.CourseRegisration;
import com.tcs.entity.Courses;
import com.tcs.entity.Professor;
import com.tcs.entity.Report;
import com.tcs.repository.CourseRegisrationRepository;
import com.tcs.repository.CoursesRepository;
import com.tcs.repository.ProfessorRepository;
import com.tcs.repository.ReportRepository;

/**
 * @author springuser01
 *
 */
@Service
public class ProfessorService {
	@Autowired
	ProfessorRepository professorRepository;
	@Autowired
	ReportRepository reportRepository;
	@Autowired
	CourseRegisrationRepository courseRegisrationRepository;

	/**
	 * This Service is responsible to add professor
	 * 
	 */
	@Transactional
	public boolean addProfessor(Professor professor) {
		System.out.println(professor);
		System.out.println(professorRepository.save(professor));
		return professorRepository.save(professor) != null;

	}

	/**
	 * This Service is responsible to add Grade
	 * 
	 */
	@Transactional
	public boolean addGrade(Report report) {
		return reportRepository.save(report) != null;
	}

	/**
	 * This Service is responsible to fetch student for professor
	 * 
	 * @param id
	 */

	@Transactional
	public List<CourseRegisration> getStudentList(Integer id) {
		return courseRegisrationRepository.getStudentList(id);
	}

}
