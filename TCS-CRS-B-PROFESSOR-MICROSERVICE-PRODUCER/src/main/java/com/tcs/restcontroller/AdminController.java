/**
 * 
 */
package com.tcs.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.entity.Courses;
import com.tcs.entity.Professor;
import com.tcs.entity.Report;
import com.tcs.entity.Student;
import com.tcs.service.CourseService;
import com.tcs.service.ProfessorService;
import com.tcs.service.ReportServices;
import com.tcs.service.StudentService;

/**
 * @author springuser01
 *
 */
@Controller
@RestController
public class AdminController {
	private static final Logger log = LoggerFactory.getLogger(AdminController.class);

	@Autowired
	StudentService studentService;

	@Autowired
	CourseService courseService;
	@Autowired
	ProfessorService professorService;
	@Autowired
	ReportServices reportService;

	/**
	 * This controller is responsible to Approved student
	 * 
	 * @param student id
	 */
	@RequestMapping(value = "/admin/approved/student/{id}", method = RequestMethod.PUT)
	public HttpStatus updateApproval(@PathVariable Integer id) {
		return studentService.updateApproval(id) != 0 ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;

	}

	/**
	 * This controller is responsible to add course
	 * 
	 * @param Course body
	 */

	@RequestMapping(value = "/admin/course", method = RequestMethod.POST)
	@ResponseBody
	public HttpStatus addCourse(@RequestBody Courses courses) {
		log.info(courses.toString());
		return courseService.addCourse(courses) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	/**
	 * This controller is responsible to get report card
	 * 
	 * @param student id
	 */

	@RequestMapping(value = "/admin/report/{id}", method = RequestMethod.GET)
	public @ResponseBody List<Report> getReportById(@PathVariable("id") Integer id) {
		return (List<Report>) reportService.getReportById(id);
	}

	/**
	 * This controller is responsible to get All courses
	 * 
	 * 
	 */
	@RequestMapping(value = "/courses", method = RequestMethod.GET)
	public List<Courses> getAllCourses() {
		return courseService.getAllCourses();
	}

	/**
	 * This controller is responsible to delete course
	 * 
	 * @param course id
	 */
	@RequestMapping(value = "/course/{id}", method = RequestMethod.DELETE)
	public HttpStatus deleteCourse(@PathVariable Integer id) {
		courseService.deleteCourse(id);
		return HttpStatus.NO_CONTENT;
	}

	/**
	 * This controller is responsible to add professor
	 * 
	 * @param Professor body
	 */
	@RequestMapping(value = "/admin/professor", method = RequestMethod.POST)
	@ResponseBody
	public HttpStatus addProfessor(@RequestBody Professor professor) {
		log.info(professor.toString());
		return professorService.addProfessor(professor) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

}
