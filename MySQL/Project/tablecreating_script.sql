create database Freshschool;
USE Freshschool;
CREATE TABLE roles (
    role_id SMALLINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20) NOT NULL UNIQUE
);
CREATE TABLE users (
    user_id SMALLINT AUTO_INCREMENT PRIMARY KEY,
    role_id SMALLINT,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    email VARCHAR(50) UNIQUE NOT NULL,
    contact_number BIGINT NOT NULL UNIQUE,
    date_of_birth TIMESTAMP NOT NULL,
    Gender VARCHAR(10),
    parent_name VARCHAR(20),
    parent_contact_number BIGINT,
    enroll_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    address MEDIUMTEXT,
    CHECK (gender IN ('Female' , 'Male')),
    CHECK (date_of_birth >= '2006-04-01 00:00:00'),
    foreign key (role_id) references roles(role_id)
);

CREATE TABLE faq (
    faq_id INT AUTO_INCREMENT PRIMARY KEY,
    question MEDIUMTEXT NOT NULL,
    answer MEDIUMTEXT,
    mail varchar(50) NOT NULL,
    name varchar(20) NOT NULL
);

CREATE TABLE application_status (
    user_id SMALLINT UNIQUE not null,
    result VARCHAR(10) CHECK (result in ('selected','not selected','pending')) default "pending",
    FOREIGN KEY (user_id)
        REFERENCES  users(user_id)
        ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE admin_details (
    user_id SMALLINT UNIQUE not null,
    password VARCHAR(10) unique not null,
    FOREIGN KEY (user_id)
        REFERENCES  users(user_id)
        ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE TABLE application_result_checking_details (
    check_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id SMALLINT,
    checked_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
    ON UPDATE CASCADE ON DELETE CASCADE
);