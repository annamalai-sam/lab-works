```syntax
create table student_phone_number(student_name VARCHAR(40), phone_number int not null ) PARTITION BY HASH(phone_number) PARTITIONS 2;
```
```syntax
 insert into student_phone_number values("Aswath","9876"),("Haiden","123456");
```
```syntax
 SELECT PARTITION_NAME, TABLE_ROWS   FROM INFORMATION_SCHEMA.PARTITIONS  WHERE TABLE_SCHEMA = 'sample_partition' AND TABLE_NAME = 'student_phone_number';
```
| PARTITION_NAME | TABLE_ROWS |
|:---------------|:-----------|
| p0             |          2 |
| p1             |          0 |


```syntax
 select * from student_phone_number;
```
| student_name | phone_number |
|:-------------|:-------------|
| Aswath       |         9876 |
| Haiden       |       123456 |

```syntax
 alter table student_phone_number truncate partition p0;
```
```syntax
 select * from student_phone_number;
```