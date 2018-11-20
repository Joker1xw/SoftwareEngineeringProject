package group.project.spring.model;

public class Enrollment {
	private int courseId;
	private int studentId;
	private String studentName;

	public Enrollment() {
	}

	public Enrollment(int courseId, String abbrev, int studentId, String studentName) {
		this.courseId = courseId;
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
