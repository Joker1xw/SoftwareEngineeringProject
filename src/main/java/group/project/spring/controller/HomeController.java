package group.project.spring.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import group.project.spring.dao.CourseDAO;
import group.project.spring.dao.EnrollmentDAO;
import group.project.spring.model.Course;
import group.project.spring.model.Enrollment;

/**
 * This controller routes accesses to the application to the appropriate
 * hanlder methods. 
 *
 */
@Controller
public class HomeController {

	@Autowired
	private CourseDAO courseDAO;
	@Autowired
	private EnrollmentDAO enrollmentDAO;
	
	//Course
	@RequestMapping(value="/")
	public ModelAndView listCourse(ModelAndView model) throws IOException{
		List<Course> listCourse = courseDAO.list();
		model.addObject("listCourse", listCourse);
		model.setViewName("home");
		
		return model;
	}
	
	@RequestMapping(value = "/newCourse", method = RequestMethod.GET)
	public ModelAndView newCourse(ModelAndView model) {
		Course newCourse = new Course();
		model.addObject("course", newCourse);
		model.setViewName("CourseForm");
		return model;
	}
	
	@RequestMapping(value = "/saveCourse", method = RequestMethod.POST)
	public ModelAndView saveCourse(@ModelAttribute Course course) {
		courseDAO.saveOrUpdate(course);		
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/deleteCourse", method = RequestMethod.GET)
	public ModelAndView deleteCourse(HttpServletRequest request) {
		int courseId = Integer.parseInt(request.getParameter("id"));
		courseDAO.delete(courseId);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/editCourse", method = RequestMethod.GET)
	public ModelAndView editCourse(HttpServletRequest request) {
		int courseId = Integer.parseInt(request.getParameter("id"));
		Course course = courseDAO.get(courseId);
		ModelAndView model = new ModelAndView("CourseForm");
		model.addObject("course", course);
		
		return model;
	}

	//Enrollment
	@RequestMapping(value="/enrollment")
	public ModelAndView listEnrollment(HttpServletRequest request) throws IOException{
		int courseId = Integer.parseInt(request.getParameter("id"));
		List<Enrollment> listEnrollment = enrollmentDAO.getEnrollmentList(courseId);
		Course course = courseDAO.get(courseId);
		ModelAndView model = new ModelAndView("Enrollment");
		model.addObject("course", course);
		model.addObject("listEnrollment", listEnrollment);
		
		return model;
	}


}
