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
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tcs.entity.Student;

import java.util.List;

import javax.transaction.Transactional;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	// This PersonRepository inharite the CurdRepository in which we can implement
	// the various method save() findOne() count() delete() deleteAll()
	//List<Student> findByFirstName(String firstName);
	//@Transactional
    @Modifying
    @Query(value ="update student set is_stud_approved =1 where id=?",nativeQuery = true)
     int updateStudentApproval( int id );
}