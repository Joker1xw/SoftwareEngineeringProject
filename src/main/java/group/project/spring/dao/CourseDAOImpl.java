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

/**
 * An implementation of the CourseDAO interface.
 *
 */
public class CourseDAOImpl implements CourseDAO {

	private JdbcTemplate jdbcTemplate;
	
	public CourseDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void saveOrUpdate(Course course) {
		if (course.getId() > 0) {
			// update
			String sql = "UPDATE course "
						+ "SET course_abbrev=?, "
						+ " course_name=?, "
						+ " course_instructor=?, "
						+ " course_meeting_days=?, "
						+ " course_meeting_time=? "
						+ " WHERE course_id=?";
			jdbcTemplate.update(sql, course.getAbbrev()
								, course.getName()
								, course.getInstructor()
								, course.getDays()
								, course.getTime()
								, course.getId());
		} else {
			// insert
			String sql = "INSERT INTO course (course_abbrev"
										 + ", course_name"
										 + ", course_instructor"
										 + ", course_meeting_days"
										 + ", course_meeting_time" 
										 + ")"
						+ " VALUES (?, ?, ?, ?, ?)";
			jdbcTemplate.update(sql, course.getAbbrev()
								, course.getName()
								, course.getInstructor()
								, course.getDays()
								, course.getTime()
								);
		}
	}

	@Override
	public void delete(int courseId) {
		String sql = "DELETE FROM course WHERE course_id=?";
		jdbcTemplate.update(sql, courseId);
	}

	@Override
	public List<Course> list() {
		String sql = "SELECT * FROM course";
		List<Course> listCourse = jdbcTemplate.query(sql, new RowMapper<Course>() {

			@Override
			public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
				Course course = new Course();
	
				course.setId(rs.getInt("course_id"));
				course.setAbbrev(rs.getString("course_abbrev"));
				course.setName(rs.getString("course_name"));
				course.setInstructor(rs.getString("course_instructor"));
				course.setDays(rs.getString("course_meeting_days"));
				course.setTime(rs.getString("course_meeting_time"));
				
				return course;
			}
			
		});
		
		return listCourse;
	}

	@Override
	public Course get(int courseId) {
		String sql = "SELECT * FROM course WHERE course_id=" + courseId;
		return jdbcTemplate.query(sql, new ResultSetExtractor<Course>() {

			@Override
			public Course extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				if (rs.next()) {
					Course course = new Course();
					course.setId(rs.getInt("course_id"));
					course.setAbbrev(rs.getString("course_abbrev"));
					course.setName(rs.getString("course_name"));
					course.setInstructor(rs.getString("course_instructor"));
					course.setDays(rs.getString("course_meeting_days"));
					course.setTime(rs.getString("course_meeting_time"));
					return course;
				}
				
				return null;
			}
			
		});
	}

}
