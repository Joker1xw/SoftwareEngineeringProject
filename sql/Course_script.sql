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