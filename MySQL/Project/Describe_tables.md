```syntax
USE Freshschool;
```

Database changed

```syntax
SHOW TABLES;
```

|        Tables_in_freshschool        |
| :---------------------------------: |
|            admin_details            |
| application_result_checking_details |
|         application_status          |
|                 faq                 |
|                roles                |
|                users                |

6 rows in set (0.02 sec)

```syntax
DESC admin_details;
```

|  Field   |    Type     | Null | Key | Default | Extra |
| :------: | :---------: | :--: | :-: | :-----: | :---: |
| user_id  |  smallint   |  NO  | PRI |  NULL   |       |
| password | varchar(10) |  NO  | UNI |  NULL   |       |

3 rows in set (0.00 sec)

```syntax
DESC application_result_checking_details;
```

|    Field     |   Type    | Null | Key |      Default      |       Extra       |
| :----------: | :-------: | :--: | :-: | :---------------: | :---------------: |
|   check_id   |    int    |  NO  | PRI |       NULL        |  auto_increment   |
|   user_id    | smallint  | YES  | MUL |       NULL        |                   |
| checked_time | timestamp |  NO  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

```syntax
DESC application_status;
```

|  Field  |    Type     | Null | Key | Default | Extra |
| :-----: | :---------: | :--: | :-: | :-----: | :---: |
| user_id |  smallint   |  NO  | PRI |  NULL   |       |
| result  | varchar(10) | YES  |     | pending |       |

9 rows in set (0.00 sec)

```syntax
desc faq;
```

|  Field   |    Type    | Null | Key | Default |     Extra      |
| :------: | :--------: | :--: | :-: | :-----: | :------------: |
|  faq_id  |    int     |  NO  | PRI |  NULL   | auto_increment |
| question | mediumtext |  NO  |     |  NULL   |                |
|  answer  | mediumtext | YES  |     |  NULL   |                |

2 rows in set (0.00 sec)

```syntax
desc roles;
```

|  Field  |    Type     | Null | Key | Default |     Extra      |
| :-----: | :---------: | :--: | :-: | :-----: | :------------: |
| role_id |  smallint   |  NO  | PRI |  NULL   | auto_increment |
|  name   | varchar(20) |  NO  | UNI |  NULL   |                |

2 rows in set (0.00 sec)

mysql>

```syntax
desc users;
```

|         Field         |    Type     | Null | Key |      Default      |       Extra       |
| :-------------------: | :---------: | :--: | :-: | :---------------: | :---------------: |
|        user_id        |  smallint   |  NO  | PRI |       NULL        |  auto_increment   |
|        role_id        |  smallint   | YES  | MUL |       NULL        |                   |
|      first_name       | varchar(20) |  NO  |     |       NULL        |                   |
|       last_name       | varchar(20) |  NO  |     |       NULL        |                   |
|         email         | varchar(50) |  NO  | UNI |       NULL        |                   |
|    contact_number     |   bigint    |  NO  | UNI |       NULL        |                   |
|     date_of_birth     |  timestamp  |  NO  |     |       NULL        |                   |
|        Gender         | varchar(10) | YES  |     |       NULL        |                   |
|      parent_name      | varchar(20) | YES  |     |       NULL        |                   |
| parent_contact_number |   bigint    | YES  |     |       NULL        |                   |
|      enroll_time      |  timestamp  |  NO  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
|        address        | mediumtext  | YES  |     |       NULL        |                   |

12 rows in set (0.00 sec)
