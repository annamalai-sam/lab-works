```syntax
CREATE TABLE students_age ( student_name VARCHAR(40),age INT NOT NULL)  PARTITION BY RANGE (age)( PARTITION minor_account_guys VALUES LESS THAN (18), PARTITION major_account_guys VALUES LESS THAN maxvalue);
```

```syntax
insert into students_age values("Aswath","17"),("Annamalai","18"),("Haiden","19");
```

```syntax
desc table students_age;
```

| id  | select_type | table        | partitions                            | type | possible_keys | key  | key_len | ref  | rows | filtered | Extra |
| :-- | :---------- | :----------- | :------------------------------------ | :--- | :------------ | :--- | :------ | :--- | :--- | :------- | :---- |
| 1   | SIMPLE      | students_age | minor_account_guys,major_account_guys | ALL  | NULL          | NULL | NULL    | NULL | 3    | 100.00   | NULL  |

```syntax
select * from students_age;
```

| student_name | age |
| :----------- | :-- |
| Aswath       | 17  |
| Annamalai    | 18  |
| Haiden       | 19  |

```syntax
ALTER TABLE students_age TRUNCATE PARTITION minor_account_guys;
```

```syntax
select * from students_age;
```

| student_name | age |
| :----------- | :-- |
| Annamalai    | 18  |
| Haiden       | 19  |
