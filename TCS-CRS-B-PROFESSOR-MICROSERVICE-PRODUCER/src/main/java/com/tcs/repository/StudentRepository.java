/**
 * 
 */
package com.tcs.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * @author springuser01
 *
 */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.entity.Student;



/**
 * @author springuser01
 *
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	@Modifying
	@Query(value = "update student set is_stud_approved =1 where id=?", nativeQuery = true)
	int updateStudentApproval(int id);
}