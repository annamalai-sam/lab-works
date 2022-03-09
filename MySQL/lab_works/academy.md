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
| :-: | --------: | :------- |
| 37  |         1 | 1        |
| 38  |         2 | 1        |
| 39  |         3 | 1        |
| 40  |         4 | 1        |
| 41  |         5 | 1        |
| 42  |         6 | 1        |
| 43  |         1 | 2        |
| 44  |         2 | 2        |
| 45  |         3 | 2        |
| 46  |         4 | 2        |
| 47  |         5 | 2        |
| 48  |         6 | 2        |
| 49  |         1 | 3        |
| 50  |         2 | 3        |
| 51  |         3 | 3        |
| 52  |         4 | 3        |
| 53  |         5 | 3        |
| 54  |         6 | 3        |

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
