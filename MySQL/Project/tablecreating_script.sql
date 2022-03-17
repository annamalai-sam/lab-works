use Freshschool;
CREATE TABLE roles (
    role_id SMALLINT PRIMARY KEY AUTO_INCREMENT,
    roles_type VARCHAR(20) UNIQUE NOT NULL
);
CREATE TABLE user (
    user_id SMALLINT PRIMARY KEY AUTO_INCREMENT,
    role_id SMALLINT NOT NULL,
    mail VARCHAR(50) UNIQUE NOT NULL,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    contact_number INT(10) NOT NULL UNIQUE,
    date_of_birth TIMESTAMP NOT NULL,
    Gender VARCHAR(10),
    address MEDIUMTEXT NOT NULL,
    CHECK (gender IN ('Female' , 'Male')),
    CHECK (date_of_birth >= '2006-04-01 00:00:00'),
    FOREIGN KEY (role_id)
        REFERENCES roles (role_id)
);
CREATE TABLE student_details (
    user_id SMALLINT NOT NULL UNIQUE,
    student_id SMALLINT PRIMARY KEY AUTO_INCREMENT,
    parent_name VARCHAR(20) NOT NULL,
    parent_contact_number INT(10) NOT NULL,
    enroll_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES  user (user_id)
);
CREATE TABLE admin_list (
    user_id SMALLINT UNIQUE,
    admin_id SMALLINT PRIMARY KEY AUTO_INCREMENT,
    password VARCHAR(8) NOT NULL,
    FOREIGN KEY (user_id)
        REFERENCES user (user_id)
);
CREATE TABLE student_result(
student_id SMALLINT NOT NULL UNIQUE,
result varchar(10) check( result = "selected"or"not selected"or"Waiting list"),
    FOREIGN KEY (student_id) REFERENCES  student_details(student_id)
);
