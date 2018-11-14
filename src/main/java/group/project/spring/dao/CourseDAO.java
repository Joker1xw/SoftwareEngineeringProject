package group.project.spring.dao;

import java.util.List;

import group.project.spring.model.Course;

/**
 * Defines DAO operations for course.
 *
 */
public interface CourseDAO {
	
	public void saveOrUpdate(Course course);
	
	public void delete(int courseId);
	
	public Course get(int courseId);
	
	public List<Course> list();
}
