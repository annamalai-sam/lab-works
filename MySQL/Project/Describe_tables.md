```syntax
USE Freshschool;
```

Database changed

```syntax
SHOW TABLES;
```

| Tables_in_freshschool |
| :-------------------: |
|     admin_details     |
|         roles         |
|    student_details    |
|    student_result     |
|         user          |

6 rows in set (0.02 sec)

```syntax
DESC user;
```

|     Field      |    Type     | Null | Key | Default |     Extra      |
| :------------: | :---------: | :--: | :-: | :-----: | :------------: |
|    user_id     |  smallint   |  NO  | PRI |  NULL   | auto_increment |
|    role_id     |  smallint   |  NO  | MUL |  NULL   |                |
|      mail      | varchar(50) |  NO  | UNI |  NULL   |                |
|   first_name   | varchar(20) |  NO  |     |  NULL   |                |
|   last_name    | varchar(20) |  NO  |     |  NULL   |                |
| contact_number |     int     |  NO  | UNI |  NULL   |                |
| date_of_birth  |  timestamp  |  NO  |     |  NULL   |                |
|     Gender     | varchar(10) | YES  |     |  NULL   |                |
|    address     | mediumtext  |  NO  |     |  NULL   |                |

3 rows in set (0.00 sec)

```syntax
DESC admin_details;
```

|  Field   |    Type    | Null | Key | Default |     Extra      |
| :------: | :--------: | :--: | :-: | :-----: | :------------: |
| user_id  |  smallint  | YES  | UNI |  NULL   |                |
| admin_id |  smallint  |  NO  | PRI |  NULL   | auto_increment |
| password | varchar(8) |  NO  |     |  NULL   |                |

```syntax
DESC student_details;
```

|         Field         |    Type     | Null | Key |      Default      |       Extra       |
| :-------------------: | :---------: | :--: | :-: | :---------------: | :---------------: |
|        user_id        |  smallint   |  NO  | UNI |       NULL        |                   |
|      student_id       |  smallint   |  NO  | PRI |       NULL        |  auto_increment   |
|      parent_name      | varchar(20) |  NO  |     |       NULL        |                   |
| parent_contact_number |     int     |  NO  |     |       NULL        |                   |
|      enroll_time      |  timestamp  |  NO  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

9 rows in set (0.00 sec)

```syntax
desc student_result;
```

|   Field    |    Type     | Null | Key | Default | Extra |
| :--------: | :---------: | :--: | :-: | :-----: | :---: |
| student_id |  smallint   |  NO  | PRI |  NULL   |       |
|   result   | varchar(10) | YES  |     |  NULL   |       |

2 rows in set (0.00 sec)

```syntax
desc roles;
```

|   Field    |    Type     | Null | Key | Default |     Extra      |
| :--------: | :---------: | :--: | :-: | :-----: | :------------: |
|  role_id   |  smallint   |  NO  | PRI |  NULL   | auto_increment |
| roles_type | varchar(20) |  NO  | UNI |  NULL   |                |

2 rows in set (0.00 sec)

mysql>
