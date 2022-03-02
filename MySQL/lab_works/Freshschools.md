# FRESH SCHOOLS

```syntax
CREATE DATABASE Freshschools;
```

Query OK, 1 row affected (0.01 sec)

```syntax
USE Freshschools;
```

Database changed

```syntax
SHOW TABLES;
```

Empty set (0.02 sec)

```syntax
create table students (id int primary key auto_increment, name varchar(100) not null,email varchar(100) not null unique,mobile_no bigint not null,password varchar(100) not null,gender char(1) not null,dob date,created_date timestamp not null default current_timestamp,check ( gender in ('M','F')));
```

Query OK, 0 rows affected (0.04 sec)

```syntax
desc students;
```

| Field        | Type         | Null | Key | Default           | Extra             |
| :----------- | :----------- | :--- | :-- | :---------------- | :---------------- |
| id           | int          | NO   | PRI | NULL              | auto_increment    |
| name         | varchar(100) | NO   |     | NULL              |                   |
| email        | varchar(100) | NO   | UNI | NULL              |                   |
| mobile_no    | bigint       | NO   |     | NULL              |                   |
| password     | varchar(100) | NO   |     | NULL              |                   |
| gender       | char(1)      | NO   |     | NULL              |                   |
| dob          | date         | YES  |     | NULL              |                   |
| created_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

8 rows in set (0.01 sec)

```syntax
create table student_class (id int primary key auto_increment,student_id int not null,class int not null,status varchar(20) not null,foreign key (student_id) references students(id),check( class >= 1 and class <=12),check (status in ('ACTIVE','INACTIVE')));
```

Query OK, 0 rows affected (0.03 sec)

```syntax
desc student_class;
```

| Field      | Type        | Null | Key | Default | Extra          |
| :--------- | :---------- | :--- | :-- | :------ | :------------- |
| id         | int         | NO   | PRI | NULL    | auto_increment |
| student_id | int         | NO   | MUL | NULL    |                |
| class      | int         | NO   |     | NULL    |                |
| status     | varchar(20) | NO   |     | NULL    |                |

4 rows in set (0.01 sec)

## Feature 1: Student Registration

```syntax
insert into students (name,email,mobile_no,password,gender) values("Annamalai","annamalai@Freshschools.com","9876543210","12345678","M");
```

Query OK, 1 row affected (0.01 sec)

```syntax
insert into students (name,email,mobile_no,password,gender) values("Venkat","venkat@Freshschools.com","9876543210","12345678","M"),("Aswath","aswath@Freshschools.com","9876543210","12345678","M"),("Haiden","haiden@Freshschools.com","9876543210","12345678","M"),("Santhanu","santhanu@Freshschools.com","9876543210","12345678","M"),("Sweatha","sweatha@Freshschools.com","9876543210","12345678","F"),("Jerusheya","jerusheya@Freshschools.com","9876543210","12345678","F"),("Riyas","riyas@Freshschools.com","9876543210","12345678","M"),("Saranya","saranya@Freshschools.com","9876543210","12345678","F"),("Sangeetha","sangeetha@Freshschools.com","9876543210","12345678","F"),("Annapoorani","annapoorani@Freshschools.com","9876543210","12345678","F"),("Kasi","kasi@Freshschools.com","9876543210","12345678","M"),("Chithraj","chithraj@Freshschools.com","9876543210","12345678","M");
```

Query OK, 12 rows affected (0.01 sec)
Records: 12 Duplicates: 0 Warnings: 0

## Feature 2: List All Students

```syntax
SELECT * FROM students;
```

| id  | name        | email                        | mobile_no  | password | gender | dob  | created_date        |
| :-- | :---------- | :--------------------------- | :--------- | :------- | :----- | :--- | :------------------ |
| 1   | Annamalai   | annamalai@Freshschools.com   | 9876543210 | 12345678 | M      | NULL | 2022-03-02 12:06:38 |
| 2   | Venkat      | venkat@Freshschools.com      | 9876543210 | 12345678 | M      | NULL | 2022-03-02 12:17:32 |
| 3   | Aswath      | aswath@Freshschools.com      | 9876543210 | 12345678 | M      | NULL | 2022-03-02 12:17:32 |
| 4   | Haiden      | haiden@Freshschools.com      | 9876543210 | 12345678 | M      | NULL | 2022-03-02 12:17:32 |
| 5   | Santhanu    | santhanu@Freshschools.com    | 9876543210 | 12345678 | M      | NULL | 2022-03-02 12:17:32 |
| 6   | Sweatha     | sweatha@Freshschools.com     | 9876543210 | 12345678 | F      | NULL | 2022-03-02 12:17:32 |
| 7   | Jerusheya   | jerusheya@Freshschools.com   | 9876543210 | 12345678 | F      | NULL | 2022-03-02 12:17:32 |
| 8   | Riyas       | riyas@Freshschools.com       | 9876543210 | 12345678 | M      | NULL | 2022-03-02 12:17:32 |
| 9   | Saranya     | saranya@Freshschools.com     | 9876543210 | 12345678 | F      | NULL | 2022-03-02 12:17:32 |
| 10  | Sangeetha   | sangeetha@Freshschools.com   | 9876543210 | 12345678 | F      | NULL | 2022-03-02 12:17:32 |
| 11  | Annapoorani | annapoorani@Freshschools.com | 9876543210 | 12345678 | F      | NULL | 2022-03-02 12:17:32 |
| 12  | Kasi        | kasi@Freshschools.com        | 9876543210 | 12345678 | M      | NULL | 2022-03-02 12:17:32 |
| 13  | Chithraj    | chithraj@Freshschools.com    | 9876543210 | 12345678 | M      | NULL | 2022-03-02 12:17:32 |

13 rows in set (0.00 sec)

## Feature 3: Login with email and password

```syntax
SELECT * FROM students WHERE email ="kasi@Freshschools.com" and password = "12345678";
```

|  id | name | email                 | mobile_no  | password | gender | dob  | created_date        |
| --: | :--- | :-------------------- | :--------- | :------- | :----- | :--- | :------------------ |
|  12 | Kasi | kasi@Freshschools.com | 9876543210 | 12345678 | M      | NULL | 2022-03-02 12:17:32 |

1 row in set (0.00 sec)

## Feature 4: Update Password

```syntax
update students set password = "Kasi@2004" where email = "kasi@Freshschools.com";
```

Query OK, 1 row affected (0.01 sec)
Rows matched: 1 Changed: 1 Warnings: 0

```syntax
SELECT * FROM students WHERE email ="kasi@Freshschools.com" and password = "Kasi@2004";
```

| id  | name | email                 | mobile_no  | password  | gender | dob  | created_date        |
| :-- | :--- | :-------------------- | :--------- | :-------- | :----- | :--- | :------------------ |
| 12  | Kasi | kasi@Freshschools.com | 9876543210 | Kasi@2004 | M      | NULL | 2022-03-02 12:17:32 |

1 row in set (0.00 sec)

## Feature 5: Enroll Student into Class

```syntax
insert into student_class (student_id,class,status) value ("1","12","ACTIVE"),("2","11","ACTIVE"),("3","10","ACTIVE"),("4","9","INACTIVE"),("5","8","ACTIVE"),("6","7","INACTIVE"),("7","6","ACTIVE"),("8","5","INACTIVE"),("9","5","ACTIVE"),("10","4","INACTIVE"),("11","3","ACTIVE"),("12","2","INACTIVE"),("13","1","ACTIVE");
```

Query OK, 13 rows affected (0.01 sec)
Records: 13 Duplicates: 0 Warnings: 0

```syntax
SELECT * FROM student_class;
```

| id  | student_id | class | status   |
| :-- | :--------- | :---- | :------- |
| 1   | 1          | 12    | ACTIVE   |
| 2   | 2          | 11    | ACTIVE   |
| 3   | 3          | 10    | ACTIVE   |
| 4   | 4          | 9     | INACTIVE |
| 5   | 5          | 8     | ACTIVE   |
| 6   | 6          | 7     | INACTIVE |
| 7   | 7          | 6     | ACTIVE   |
| 8   | 8          | 5     | INACTIVE |
| 9   | 9          | 5     | ACTIVE   |
| 10  | 10         | 4     | INACTIVE |
| 11  | 11         | 3     | ACTIVE   |
| 12  | 12         | 2     | INACTIVE |
| 13  | 13         | 1     | ACTIVE   |

13 rows in set (0.00 sec)

## Feature 6: Find Students who are enrolled in the given class ( question: Find Students who are studying in 5th standard)

```syntax
select student_id,name,class,gender,email,mobile_no FROM students join student_class on students.id = student_class.student_id where class ="5";
```

| student_id | name    | class | gender | email                    | mobile_no  |
| :--------- | :------ | :---- | :----- | :----------------------- | :--------- |
| 8          | Riyas   | 5     | M      | riyas@Freshschools.com   | 9876543210 |
| 9          | Saranya | 5     | F      | saranya@Freshschools.com | 9876543210 |

2 rows in set (0.00 sec)
