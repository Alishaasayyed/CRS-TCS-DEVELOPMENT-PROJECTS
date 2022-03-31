/**
 * 
 */
package com.tcs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.entity.Courses;
import com.tcs.entity.Professor;
import com.tcs.repository.CoursesRepository;
import com.tcs.repository.ProfessorRepository;

/**
 * @author springuser01
 *
 */
@Service
public class ProfessorService {
	@Autowired
	ProfessorRepository professorRepository;
	@Transactional
	public boolean addProfessor(Professor professor) {
		System.out.println(professor);
		System.out.println(professorRepository.save(professor));
		return professorRepository.save(professor) != null;

	}

}
