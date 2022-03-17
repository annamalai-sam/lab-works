```syntax
USE Freshschool;
```

Database changed

```syntax
SHOW TABLES;
```

| Tables_in_freshschool |
| :-------------------: |
|      admin_list       |
|        answer         |
|        queries        |
|    student_details    |
|    student_result     |
|         user          |

6 rows in set (0.02 sec)

```syntax
DESC admin_list;
```

|     Field      |    Type     | Null | Key | Default |     Extra      |
| :------------: | :---------: | :--: | :-: | :-----: | :------------: |
|    user_id     |     int     | YES  | UNI |  NULL   |                |
|    admin_id    |     int     |  NO  | PRI |  NULL   | auto_increment |
|    password    |     int     |  NO  |     |  NULL   |                |
|      name      | varchar(20) |  NO  |     |  NULL   |                |
| contact_number |     int     |  NO  |     |  NULL   |                |
| date_of_birth  |    date     |  NO  |     |  NULL   |                |
|    address     | mediumtext  |  NO  |     |  NULL   |                |

7 rows in set (0.01 sec)

```syntax
DESC answer;
```

|  Field   |    Type    | Null | Key | Default | Extra |
| :------: | :--------: | :--: | :-: | :-----: | :---: |
| query_id |    int     |  NO  | MUL |  NULL   |       |
|  answer  | mediumtext |  NO  |     |  NULL   |       |

2 rows in set (0.00 sec)

```syntax
DESC queries;
```

|  Field   |    Type     | Null | Key | Default |     Extra      |
| :------: | :---------: | :--: | :-: | :-----: | :------------: |
| query_id |     int     |  NO  | PRI |  NULL   | auto_increment |
|   name   | varchar(25) |  NO  |     |  NULL   |                |
|   mail   | varchar(50) |  NO  | UNI |  NULL   |                |
|  query   | mediumtext  |  NO  |     |  NULL   |                |

4 rows in set (0.01 sec)

```syntax
DESC student_details;
```

|         Field         |    Type     | Null | Key |      Default      |       Extra       |
| :-------------------: | :---------: | :--: | :-: | :---------------: | :---------------: |
|        user_id        |     int     | YES  | UNI |       NULL        |                   |
|      student_id       |     int     |  NO  | PRI |       NULL        |  auto_increment   |
|         name          | varchar(20) |  NO  |     |       NULL        |                   |
|    contact_number     |     int     |  NO  |     |       NULL        |                   |
|     date_of_birth     |  timestamp  |  NO  |     |       NULL        |                   |
|      parent_name      | varchar(20) |  NO  |     |       NULL        |                   |
|      parent_mail      | varchar(50) | YES  |     |       NULL        |                   |
| parent_contact_number |     int     |  NO  |     |       NULL        |                   |
|        address        | mediumtext  |  NO  |     |       NULL        |                   |
|      enroll_time      |  timestamp  |  NO  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

9 rows in set (0.00 sec)

```syntax
DESC student_details;
```

|         Field         |    Type     | Null | Key | Default |     Extra      |
| :-------------------: | :---------: | :--: | :-: | :-----: | :------------: |
|        user_id        |     int     | YES  | UNI |  NULL   |                |
|      student_id       |     int     |  NO  | PRI |  NULL   | auto_increment |
|         name          | varchar(20) |  NO  |     |  NULL   |                |
|    contact_number     |     int     |  NO  |     |  NULL   |                |
|     date_of_birth     |    date     |  NO  |     |  NULL   |                |
|      parent_name      | varchar(20) |  NO  |     |  NULL   |                |
|      parent_mail      | varchar(50) | YES  |     |  NULL   |                |
| parent_contact_number |     int     |  NO  |     |  NULL   |                |
|        address        | mediumtext  |  NO  |     |  NULL   |                |

9 rows in set (0.00 sec)

```syntax
DESC user;
```

|   Field   |    Type     | Null | Key | Default |     Extra      |
| :-------: | :---------: | :--: | :-: | :-----: | :------------: |
|  user_id  |     int     |  NO  | PRI |  NULL   | auto_increment |
|   mail    | varchar(50) | YES  |     |  NULL   |                |
| user_type | varchar(10) |  NO  |     |  NULL   |                |

3 rows in set (0.00 sec)
