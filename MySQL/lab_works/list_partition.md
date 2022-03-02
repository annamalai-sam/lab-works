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
