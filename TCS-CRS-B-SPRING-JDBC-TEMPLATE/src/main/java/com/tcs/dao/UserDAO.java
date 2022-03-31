/**
 * 
 */
package com.tcs.dao;

import java.util.List;

import com.tcs.model.User;

/**
 * @author springuser01
 *
 */
public interface UserDAO {
	public void createUser(User user);
	public void deleteUser(Integer id);
	public List getUser(Integer id);

}
