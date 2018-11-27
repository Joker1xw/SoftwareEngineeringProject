create database contactdb;

CREATE TABLE `course` (
  `course_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_abbrev` varchar(10) NOT NULL,
  `course_name` varchar(45) NOT NULL,
  `course_instructor` varchar(45) NOT NULL,
  `course_meeting_days` varchar(10) NOT NULL,
  `course_meeting_time` varchar(10) NOT NULL,
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8


INSERT INTO `course` (`course_abbrev`,`course_name`,`course_instructor`,`course_meeting_days`,`course_meeting_time`) VALUES ('CIS 504','Advanced Database','Dr. Warren','W','5-7:30pm');
INSERT INTO `course` (`course_abbrev`,`course_name`,`course_instructor`,`course_meeting_days`,`course_meeting_time`) VALUES ('CIS 520','Advanced Java','Dr. Tian','T','5-7:30pm');
INSERT INTO `course` (`course_abbrev`,`course_name`,`course_instructor`,`course_meeting_days`,`course_meeting_time`) VALUES ('CIS 557','Software Engineering I','Dr. Tian','M','5-8pm');
INSERT INTO `course` (`course_abbrev`,`course_name`,`course_instructor`,`course_meeting_days`,`course_meeting_time`) VALUES ('CIS 529','C# Programming','Dr. A','Th','9-11am');
