package com.tcs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.entity.Report;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


/**
 * @author springuser01
 *
 */
@Repository
public interface ReportRepository  extends CrudRepository<Report, Integer> {
	//@Query(value = "select  s.name, s.email,s.phone_number,s.dob,r.course_1,r.course_2,r.course_3,r.course_4,r.final_grade from student s, report r WHERE s.id= r.student_id and r.student_id=?",nativeQuery = true)
	@Query(value="select * from report where id=?",nativeQuery = true)
	List<Report> getReport(int id);

}
