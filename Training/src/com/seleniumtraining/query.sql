create table employee (
emp_id int not null,
name char(30),
age int not null,
salary int)

select * from employee

insert into employee values(104, 'Jatinder', 26, 26000) 

SET SQL_SAFE_UPDATES = 0;

UPDATE employee
SET emp_id = 103
WHERE name = 'Jatinder';

alter table employee add (email varchar(25)) 

update employee
set email = "abc4@gmail.com"
where emp_id = 103;


select name from employee where emp_id = 101

