/**
 * 
 */
package com.tcs.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.entity.CourseRegisration;
import com.tcs.entity.Report;
import com.tcs.service.ProfessorService;

/**
 * @author springuser01
 *
 */
@Controller
@RestController
public class ProfessorController {
	@Autowired
	ProfessorService professorService;

	/**
	 * This controller  is responsible to register student
	 * @param Report object
	 */

	@RequestMapping(value = "/add/grade", method = RequestMethod.POST)
	@ResponseBody
	public HttpStatus addGrade(@RequestBody Report report) {
		return professorService.addGrade(report) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}
	/**
	 * This Service is responsible to register student
	 * 
	 */

	@RequestMapping(value = "/get/studentList/{id}", method = RequestMethod.GET)
	public @ResponseBody List<CourseRegisration> getStudentList(@PathVariable Integer id) {
		return (List<CourseRegisration>) professorService.getStudentList(id) ;
	}
}
