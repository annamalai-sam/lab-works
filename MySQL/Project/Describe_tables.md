```sql
USE Freshschool;
```

Database changed

```sql
SHOW TABLES;
```

|        Tables_in_freshschool        |
| :---------------------------------: |
| application_result_checking_details |
|         application_status          |
|               queries               |
|                roles                |
|                users                |

6 rows in set (0.02 sec)

```sql
DESC application_result_checking_details;
```

|    Field     |   Type    | Null | Key |      Default      |       Extra       |
| :----------: | :-------: | :--: | :-: | :---------------: | :---------------: |
|   check_id   |  bigint   |  NO  | PRI |       NULL        |  auto_increment   |
|   user_id    |  bigint   |  NO  | MUL |       NULL        |                   |
| checked_time | timestamp |  NO  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

3 rows in set (0.00 sec)

```sql
DESC application_status;
```

|  Field  |    Type     | Null | Key | Default | Extra |
| :-----: | :---------: | :--: | :-: | :-----: | :---: |
| user_id |  smallint   |  NO  | PRI |  NULL   |       |
| result  | varchar(10) | YES  |     | pending |       |

9 rows in set (0.00 sec)

```sql
desc queries;
```

|   Field    |     Type     | Null | Key | Default |     Extra      |
| :--------: | :----------: | :--: | :-: | :-----: | :------------: |
| queries_id |    bigint    |  NO  | PRI |  NULL   | auto_increment |
|  question  | varchar(255) |  NO  |     |  NULL   |                |
|   answer   | varchar(255) |  NO  |     |  NULL   |                |
|    mail    | varchar(50)  |  NO  |     |  NULL   |                |
|    name    | varchar(20)  |  NO  |     |  NULL   |                |

2 rows in set (0.00 sec)

```sql
desc roles;
```

|  Field  |    Type     | Null | Key | Default |     Extra      |
| :-----: | :---------: | :--: | :-: | :-----: | :------------: |
| role_id |  smallint   |  NO  | PRI |  NULL   | auto_increment |
|  name   | varchar(20) |  NO  | UNI |  NULL   |                |

2 rows in set (0.00 sec)

mysql>

```sql
desc users;
```

|         Field         |     Type     | Null | Key |      Default      |       Extra       |
| :-------------------: | :----------: | :--: | :-: | :---------------: | :---------------: |
|        user_id        |    bigint    |  NO  | PRI |       NULL        |  auto_increment   |
|        role_id        |    bigint    |  NO  | MUL |       NULL        |                   |
|       password        | varchar(10)  | YES  |     |       NULL        |                   |
|      first_name       | varchar(20)  |  NO  |     |       NULL        |                   |
|       last_name       | varchar(20)  |  NO  |     |       NULL        |                   |
|         email         | varchar(50)  |  NO  | UNI |       NULL        |                   |
|    contact_number     |    bigint    |  NO  | UNI |       NULL        |                   |
|     date_of_birth     |  timestamp   |  NO  |     |       NULL        |                   |
|        Gender         | varchar(10)  | YES  |     |       NULL        |                   |
|      parent_name      | varchar(20)  | YES  |     |       NULL        |                   |
| parent_contact_number |    bigint    | YES  |     |       NULL        |                   |
|      enroll_time      |  timestamp   |  NO  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
|        address        | varchar(255) | YES  |     |       NULL        |                   |

12 rows in set (0.00 sec)
