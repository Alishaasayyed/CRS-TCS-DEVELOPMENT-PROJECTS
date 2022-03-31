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
public interface ReportRepository extends CrudRepository<Report, Integer> {
	@Query(value = "select * from report where id=?", nativeQuery = true)
	List<Report> getReport(int id);

}
