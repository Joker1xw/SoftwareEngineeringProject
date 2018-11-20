create database contactdb;

CREATE TABLE `student` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_name` varchar(60) NOT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8

insert into student (student_name) values ('Smith, Steve');
insert into student (student_name) values ('Neesa, Carol');
insert into student (student_name) values ('Webb, Tom');
insert into student (student_name) values ('Developer, Brad');
insert into student (student_name) values ('Good, Dave');
insert into student (student_name) values ('Midder, Barb');
insert into student (student_name) values ('Wessen, Chris');
insert into student (student_name) values ('Zimmer, Sue');
insert into student (student_name) values ('Pickot, Jess');
insert into student (student_name) values ('Alright, Tommy');
insert into student (student_name) values ('Upthere, Mike');
insert into student (student_name) values ('Albright, George');
insert into student (student_name) values ('Tanner, David');
insert into student (student_name) values ('Zanner, Michael');