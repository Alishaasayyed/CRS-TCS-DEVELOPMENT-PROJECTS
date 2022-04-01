/**
 * 
 */
package com.tcs.restcontroller;

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
import com.tcs.entity.Payment;
import com.tcs.entity.Student;
import com.tcs.service.CourseRegistrationService;
import com.tcs.service.PaymentService;
import com.tcs.service.StudentService;

/**
 * @author springuser01
 *
 */
@Controller
@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	@Autowired
	CourseRegistrationService courseRegistrationService;
	@Autowired
	PaymentService paymentService;

	/**
	 * This Service is responsible to register student
	 * 
	 */

	@RequestMapping(value = "/student/add", method = RequestMethod.POST)
	@ResponseBody
	public HttpStatus addStudent(@RequestBody Student student) {
		return studentService.registerStudent(student) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	/**
	 * This Controller is responsible to register courses
	 * 
	 */
	@RequestMapping(value = "/student/registerCourse", method = RequestMethod.POST)
	@ResponseBody
	public HttpStatus registerCourse(@RequestBody CourseRegisration courseRegisration) {
		return courseRegistrationService.registerCourse(courseRegisration) ? HttpStatus.CREATED
				: HttpStatus.BAD_REQUEST;
	}
	/**
	 * This Controller is responsible to delete register courses
	 * @param id
	 */
	
	@RequestMapping(value = "/delete/registereCourse/{id}", method = RequestMethod.DELETE)
	public HttpStatus deleteCourse(@PathVariable Integer id) {
		courseRegistrationService.deleteRegisteredourse(id);
		return HttpStatus.NO_CONTENT;
	}
	/**
	 * This Controller is responsible to make payment
	 * @param id
	 */
	
	@RequestMapping(value = "/post/payment", method = RequestMethod.POST)
	public HttpStatus makePayment(@RequestBody Payment payment) {
		paymentService.makePayment(payment);
		return HttpStatus.CREATED;
	}

}
