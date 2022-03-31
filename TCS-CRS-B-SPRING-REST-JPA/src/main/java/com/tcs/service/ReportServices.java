/**
 * 
 */
package com.tcs.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.entity.Report;
import com.tcs.repository.ReportRepository;


/**
 * @author springuser01
 *
 */
@Service
public class ReportServices {

@Autowired
ReportRepository reportRepository;

@Transactional
public List<Report> getReportById(Integer id) {
	 return (List<Report>) reportRepository.getReport(id);
}
}

