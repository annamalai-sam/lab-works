```syntax
CREATE TABLE student_address ( student_name VARCHAR(40) NOT NULL, city_name VARCHAR(20) NOT NULL, pincode INT NOT NULL)PARTITION BY LIST(pincode) ( PARTITION east_side VALUES IN (101, 102, 103),PARTITION west_side VALUES IN (104,105, 106), PARTITION north_side VALUES IN (107,108,109 ), PARTITION south_side VALUES IN ( 110, 111, 112));
```

```syntax
desc table student_address;
```

| id  | select_type | table           | partitions                                | type | possible_keys | key  | key_len | ref  | rows | filtered | Extra |
| :-- | :---------- | :-------------- | :---------------------------------------- | :--- | :------------ | :--- | :------ | :--- | :--- | :------- | :---- |
| 1   | SIMPLE      | student_address | east_side,west_side,north_side,south_side | ALL  | NULL          | NULL | NULL    | NULL | 1    | 100.00   | NULL  |

```syntax
insert into student_address values("Aswath","Ramanathapuram","101"),("Annamalai","Madurai","104"),("Haiden","Tirunelveli","107"),("Santhanu","Theni","110");
```

```syntax
select * from student_address;
```

| student_name | city_name      | pincode |
| :----------- | :------------- | :------ |
| Aswath       | Ramanathapuram | 101     |
| Annamalai    | Madurai        | 104     |
| Haiden       | Tirunelveli    | 107     |
| Santhanu     | Theni          | 110     |

```syntax
alter table student_address drop partition east_side;
```

```syntax
select * from student_address;
```

| student_name | city_name   | pincode |
| :----------- | :---------- | :------ |
| Annamalai    | Madurai     | 104     |
| Haiden       | Tirunelveli | 107     |
| Santhanu     | Theni       | 110     |

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
