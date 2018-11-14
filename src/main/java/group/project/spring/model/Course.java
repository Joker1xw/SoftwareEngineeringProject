package group.project.spring.model;

public class Course {
	private int id;
	private String abbrev;
	private String name;
	private String instructor;
	private String days;
	private String time;

	public Course() {
	}

	public Course(String abbrev, String name, String instructor, String days, String time) {
		this.abbrev = abbrev;
		this.name = name;
		this.instructor = instructor;
		this.days = days;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbrev() {
		return abbrev;
	}

	public void setAbbrev(String abbrev) {
		this.abbrev = abbrev;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	

}
