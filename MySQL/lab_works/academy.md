```syntax
create database academy;
```

Query OK, 1 row affected (0.01 sec)

```syntax
use academy;
```

Database changed

```syntax
create table user(id int primary key auto_increment, name varchar(30) not null);
```

Query OK, 0 rows affected (0.03 sec)

```syntax
create table batch(id int primary key auto_increment, name varchar(30) not null);
```

Query OK, 0 rows affected (0.03 sec)

```syntax
create table courses(id int primary key auto_increment, name varchar(30) not null);
```

Query OK, 0 rows affected (0.03 sec)

```syntax
create table batch_user(id int primary key auto_increment, user_id int not null unique,batch_id int not null,foreign key(batch_id) references batch(id),foreign key(user_id) references user(id));
```

Query OK, 0 rows affected (0.06 sec)

```syntax
create table batch_courses(id int primary key auto_increment, course_id int not null,batch_id int not null,foreign key(batch_id) references batch(id),foreign key(course_id) references courses(id));
```

Query OK, 0 rows affected (0.06 sec)

```syntax
insert into user(name) values("Annamalai"),("Aswath"),("Haiden"),("Santhanu"),("Venkat"),("Musaraf"),("Suguram");
```

Query OK, 7 rows affected (0.02 sec)
Records: 7 Duplicates: 0 Warnings: 0

```syntax
insert into courses(name) values("HTML"),("CSS"),("JS"),("MySQL"),("Java"),("Ruby");
```

Query OK, 6 rows affected (0.01 sec)
Records: 6 Duplicates: 0 Warnings: 0

insert into batch(name) values("batch01"),("batch02"),("batch03");
Query OK, 3 rows affected (0.01 sec)
Records: 3 Duplicates: 0 Warnings: 0

```syntax
select * from user;
```

| id  | name      |
| :-- | :-------- |
| 1   | Annamalai |
| 2   | Aswath    |
| 3   | Haiden    |
| 4   | Santhanu  |
| 5   | Venkat    |
| 6   | Musaraf   |
| 7   | Suguram   |

7 rows in set (0.01 sec)

```syntax
select * from courses;
```

| id  | name  |
| :-- | :---- |
| 1   | HTML  |
| 2   | CSS   |
| 3   | JS    |
| 4   | MySQL |
| 5   | Java  |
| 6   | Ruby  |

6 rows in set (0.01 sec)

```syntax
select * from batch;
```

| id  | name    |
| :-- | :------ |
| 1   | batch01 |
| 2   | batch02 |
| 3   | batch03 |

```syntax
insert into batch_courses(batch_id,course_id) values(1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(2,1),(2,2),(2,3),(2,4),(2,5),(2,6),(3,1),(3,2),(3,3),(3,4),(3,5),(3,6);
```

Query OK, 18 rows affected (0.01 sec)
Records: 18 Duplicates: 0 Warnings: 0

```syntax
select * from batch_courses;
```

| id  | course_id | batch_id |
| :-- | :-------- | :------- |
| 1   | 1         | 1        |
| 2   | 2         | 1        |
| 3   | 3         | 1        |
| 4   | 4         | 1        |
| 5   | 5         | 1        |
| 6   | 6         | 1        |
| 7   | 1         | 2        |
| 8   | 2         | 2        |
| 9   | 3         | 2        |
| 10  | 4         | 2        |
| 11  | 5         | 2        |
| 12  | 6         | 2        |
| 13  | 1         | 3        |
| 14  | 2         | 3        |
| 15  | 3         | 3        |
| 16  | 4         | 3        |
| 17  | 5         | 3        |
| 18  | 6         | 3        |

18 rows in set (0.00 sec)

```syntax
insert into batch_user(batch_id,user_id) values(1,1),(1,2),(2,3),(2,4),(3,5),(3,6),(3,7);
```

Query OK, 7 rows affected (0.01 sec)
Records: 7 Duplicates: 0 Warnings: 0

```syntax
select * from batch_user;
```

| id  | user_id | batch_id |
| :-- | :------ | :------- |
| 1   | 1       | 1        |
| 2   | 2       | 1        |
| 3   | 3       | 2        |
| 4   | 4       | 2        |
| 5   | 5       | 3        |
| 6   | 6       | 3        |
| 7   | 7       | 3        |

7 rows in set (0.00 sec)

# Take user_name,student_id and batch_name

```syntax
select user.name as user_name,user.id as user_id,batch.name as batch_name from batch,user,batch_user where user.id = batch_user.user_id and batch.id = batch_user.batch_id;
```

| user_name | user_id | batch_name |
| --------- | ------- | ---------- |
| Annamalai | 1       | batch01    |
| Aswath    | 2       | batch01    |
| Haiden    | 3       | batch02    |
| Santhanu  | 4       | batch02    |
| Venkat    | 5       | batch03    |
| Musaraf   | 6       | batch03    |
| Suguram   | 7       | batch03    |

# Take user id, username,batch id, batch name, courses id,courses name for who learn HTML only

```syntax
select user.id as user_id,user.name as user_name,batch_user.batch_id,batch.name as batch_name,courses.name as course_name,courses.id as course_id from courses,batch,user,batch_courses,batch_user where batch_user.user_id = user.id and batch_user.batch_id = batch.id and batch_courses.batch_id = batch.id and batch_courses.course_id  = courses.id and batch_courses.course_id = 1;
```

| user_id | user_name | batch_id | batch_name | course_name | course_id |
| ------- | --------- | -------- | ---------- | ----------- | --------- |
| 1       | Annamalai | 1        | batch01    | HTML        | 1         |
| 2       | Aswath    | 1        | batch01    | HTML        | 1         |
| 3       | Haiden    | 2        | batch02    | HTML        | 1         |
| 4       | Santhanu  | 2        | batch02    | HTML        | 1         |
| 5       | Venkat    | 3        | batch03    | HTML        | 1         |
| 6       | Musaraf   | 3        | batch03    | HTML        | 1         |
| 7       | Suguram   | 3        | batch03    | HTML        | 1         |

7 rows in set (0.00 sec)

# Take user id, username,batch id, batch name, courses id,courses name for who name is Suguram

```syntax
select user.id as user_id,user.name as user_name,batch_user.batch_id,batch.name as batch_name,courses.name as course_name,courses.id as course_id from courses,batch,user,batch_courses,batch_user where batch_user.user_id = user.id and batch_user.batch_id = batch.id and batch_courses.batch_id = batch.id and batch_courses.course_id  = courses.id and user.name = "Suguram";
```

| user_id | user_name | batch_id | batch_name | course_name | course_id |
| ------- | --------- | -------- | ---------- | ----------- | --------- |
| 7       | Suguram   | 3        | batch03    | HTML        | 1         |
| 7       | Suguram   | 3        | batch03    | CSS         | 2         |
| 7       | Suguram   | 3        | batch03    | JS          | 3         |
| 7       | Suguram   | 3        | batch03    | MySQL       | 4         |
| 7       | Suguram   | 3        | batch03    | Java        | 5         |
| 7       | Suguram   | 3        | batch03    | Ruby        | 6         |

6 rows in set (0.00 sec)
