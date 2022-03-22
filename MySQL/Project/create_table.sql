create database Freshschool;
use Freshschool;
CREATE TABLE user (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    mail VARCHAR(50),
    user_type VARCHAR(10) NOT NULL CHECK (user_type = 'admin'
        OR user_type = 'student')
);
CREATE TABLE admin_list (
    user_id INT UNIQUE,
    admin_id INT PRIMARY KEY AUTO_INCREMENT,
    password INT(10) NOT NULL,
    name VARCHAR(20) NOT NULL,
    contact_number INT(10) NOT NULL,
    date_of_birth DATE NOT NULL,
    address MEDIUMTEXT NOT NULL,
    FOREIGN KEY (user_id)
        REFERENCES user (user_id)
);
CREATE TABLE student_details (
    user_id INT unique,
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    contact_number INT(10) NOT NULL,
    date_of_birth timestamp NOT NULL,
    parent_name VARCHAR(20) NOT NULL,
	parent_mail VARCHAR(50),
    parent_contact_number INT(10) NOT NULL,
    address MEDIUMTEXT NOT NULL,
    enroll_time timestamp NOT NULL default current_timestamp,
    check (date_of_birth >= "2006-04-01 00:00:00"),
    FOREIGN KEY (user_id)
        REFERENCES user(user_id)
);
CREATE TABLE student_result(
user_id INT UNIQUE,
student_id INT,
result varchar(10) check( result = "selected"or"not selected"or"Waiting list"),
    FOREIGN KEY (user_id) REFERENCES user (user_id),
    FOREIGN KEY (student_id) REFERENCES  student_details (student_id)
);
