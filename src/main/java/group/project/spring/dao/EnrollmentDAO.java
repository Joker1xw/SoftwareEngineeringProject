package group.project.spring.dao;

import java.util.List;

import group.project.spring.model.Enrollment;

/**
 * Defines DAO operations for course.
 *
 */
public interface EnrollmentDAO {
	
	//public void saveOrUpdate(Enrollment enrollment);
	
	//public void delete(int studentId);
	
	//public Enrollment get(int courseId);
	
	public List<Enrollment> getEnrollmentList(int courseId);
}
