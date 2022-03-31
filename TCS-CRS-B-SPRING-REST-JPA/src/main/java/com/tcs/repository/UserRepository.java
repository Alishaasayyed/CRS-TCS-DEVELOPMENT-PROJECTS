/**
 * 
 */
package com.tcs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.entity.Professor;
import com.tcs.entity.Report;
import com.tcs.entity.User;

/**
 * @author springuser01
 *
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	@Query(value="SELECT user_id,password from user WHERE user_id=? and password=?",nativeQuery = true)
	List<User> login(String user_id,String password);

}
