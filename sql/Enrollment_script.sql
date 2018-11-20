create database contactdb;

CREATE TABLE `enrollment` (
  `course_id` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  PRIMARY KEY (`course_id`,`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8


insert into enrollment (course_id, student_id) values (25, 28);
insert into enrollment (course_id, student_id) values (25, 29);
insert into enrollment (course_id, student_id) values (25, 30);
insert into enrollment (course_id, student_id) values (25, 31);
insert into enrollment (course_id, student_id) values (25, 32);
insert into enrollment (course_id, student_id) values (25, 33);

insert into enrollment (course_id, student_id) values (26, 28);
insert into enrollment (course_id, student_id) values (26, 35);
insert into enrollment (course_id, student_id) values (26, 36);
insert into enrollment (course_id, student_id) values (26, 37);
insert into enrollment (course_id, student_id) values (26, 38);