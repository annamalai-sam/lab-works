USE freshschool;

insert into roles
(name) values
("admin"),
("applicant");

insert into faq
(question,mail,name) values
("What is the course fee?","test1@abc.com","test1"),
("What is the duration of the program?","test2@abc.com","test2"),
("Can I reapply?","test3@abc.com","test3"),
("What is expected of me during the FWSA programme?","test4@abc.com","test4");

insert into users
(role_id,first_name,last_name,email,contact_number,date_of_birth,Gender,parent_name,parent_contact_number,address) values
("1","anna","malai","test1@abc.com","9876543102","2006-03-01 00:00:00","Male","malai","9876543210","madurai"),
("1","chith","raj","test2@abc.com","8765432109","2006-03-01 00:00:00","Female","raj","9876543210","tirunelveli"),
("2","test","one","testone@abc.com","9776543201","2006-03-01 00:00:00","Male","one","9876543210","madurai"),
("2","test","two","testtwo@abc.com","9366543201","2006-03-01 00:00:00","Female","two","9876543210","chennai"),
("2","test","three","testthree@abc.com","9575543201","2006-03-01 00:00:00","Male","three","9876543210","trichy"),
("2","test","four","testfour@abc.com","9826583201","2006-03-01 00:00:00","Female","four","9876543210","coimbatore"),
("2","test","five","testfive@abc.com","9176503201","2006-03-01 00:00:00","Male","five","9876543210","trichy"),
("2","test","six","testsix@abc.com","9676543501","2006-03-01 00:00:00","Female","six","9876543210","coimbatore"),
("2","test","seven","testseven@abc.com","9077543201","2006-03-01 00:00:00","Male","seven","9876543210","tirunelveli"),
("2","test","eight","testeight@abc.com","9478543201","2006-03-01 00:00:00","Female","eight","9876543210","madurai"),
("2","test","nine","testnine@abc.com","9676583201","2006-03-01 00:00:00","Male","nine","9876543210","tirunelveli"),
("2","test","ten","testten@abc.com","9976543401","2006-03-01 00:00:00","Female","ten","9876543210","chennai");

insert into admin_details
(user_id,password) values
("1","passw@01"),
("2","passw@02");

insert into application_status
(user_id,result) values
("3","pending"),
("4","selected"),
("5","pending"),
("6","selected"),
("7","pending"),
("8","selected"),
("9","selected"),
("10","not selected"),
("11","not selected"),
("12","pending");


insert into application_result_checking_details 
(user_id) values 
(3),
(4),
(5);
