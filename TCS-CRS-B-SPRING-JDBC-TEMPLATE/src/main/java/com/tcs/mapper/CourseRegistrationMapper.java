/**
 * 
 */
package com.tcs.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tcs.model.CourseRegistration;
import com.tcs.model.User;


/**
 * @author springuser01
 *
 */
public class CourseRegistrationMapper  implements RowMapper<CourseRegistration>{
	public CourseRegistration mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		CourseRegistration reg = new CourseRegistration();
		reg.setStudentId(rs.getInt("StudentId"));
		reg.setCourseId(rs.getInt("courseId"));
		reg.setProfessorId(rs.getInt("professorId"));
		reg.setTimestamp(rs.getString("timestamp"));
        return reg;
	}
}
