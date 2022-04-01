/**
 * 
 */
package com.tcs.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.entity.Report;
import com.tcs.entity.User;
import com.tcs.service.UserService;

/**
 * @author springuser01
 *
 */
@Controller
@RestController
public class UserController {
	@Autowired
	UserService userService;

	/**
	 * This controller is responsible to add user
	 * 
	 * @param User body
	 */

	@RequestMapping(value = "/add/user", method = RequestMethod.POST)
	@ResponseBody
	public HttpStatus addUser(@RequestBody User user) {
		return userService.addUser(user) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	/**
	 * This controller is responsible to login user
	 * 
	 * @param user_id , password
	 * 
	 */

	@RequestMapping(value = "/login/user/{user_id}/{password}", method = RequestMethod.GET)
	public ResponseEntity<String>  login(@PathVariable("user_id") String user_id,
			@PathVariable("password") String password) {
		userService.login(user_id, password);
		return new ResponseEntity<String>("User Login Successfully",HttpStatus.OK);

	}
}
