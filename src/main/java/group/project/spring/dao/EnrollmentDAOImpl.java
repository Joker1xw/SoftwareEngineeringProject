package group.project.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import group.project.spring.model.Course;
import group.project.spring.model.Enrollment;

/**
 * An implementation of the EnrollmentDAO interface.
 *
 */
public class EnrollmentDAOImpl implements EnrollmentDAO {

	private JdbcTemplate jdbcTemplate;
	
	public EnrollmentDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Enrollment> getEnrollmentList(int courseId) {
		
		String sql = "SELECT e.course_id, s.student_id, s.student_name "+
					 " FROM enrollment e, student s "+
					 " where s.student_id = e.student_id "+
					 " and e.course_id = " + courseId;
		List<Enrollment> listCourse = jdbcTemplate.query(sql, new RowMapper<Enrollment>() {

			@Override
			public Enrollment mapRow(ResultSet rs, int rowNum) throws SQLException {
				Enrollment enrollment = new Enrollment();
	
				enrollment.setCourseId(rs.getInt("course_id"));
				enrollment.setStudentId(rs.getInt("student_id"));
				enrollment.setStudentName(rs.getString("student_name"));
				
				return enrollment;
			}
			
		});
		
		return listCourse;
	}

}
