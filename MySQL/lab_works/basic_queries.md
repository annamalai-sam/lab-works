```syntax
SHOW DATABASES;
```

| Database           |
| :----------------- |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
| world              |

5 rows in set (0.00 sec)

```syntax
CREATE DATABASE lab_works;
```

Query OK, 1 row affected (0.01 sec)

```syntax
USE lab_works;
```

Database changed

```syntax
SHOW TABLES;
```

Empty set (0.01 sec)

```syntax
CREATE TABLE Blazers(Id INT AUTO_INCREMENT PRIMARY KEY,  Name VARCHAR(25) NOT NULL,Age INT NOT NULL);
```

Query OK, 0 rows affected (0.06 sec)

```syntax
SHOW TABLES;
```

| Tables_in_lab_works |
| :------------------ |
| blazers             |

1 row in set (0.01 sec)

```syntax
DESC Blazers;
```

| Field | Type        | Null | Key | Default | Extra          |
| :---- | :---------- | :--- | :-- | :------ | :------------- |
| Id    | int         | NO   | PRI | NULL    | auto_increment |
| Name  | varchar(25) | NO   |     | NULL    |                |
| Age   | int         | NO   |     | NULL    |                |

3 rows in set (0.01 sec)

```syntax
DESC TABLE Blazers;
```

| id  | select_type | table   | partitions | type | possible_keys | key  | key_len | ref  | rows | filtered | Extra |
| :-- | :---------- | :------ | :--------- | :--- | :------------ | :--- | :------ | :--- | :--- | :------- | :---- |
| 1   | SIMPLE      | Blazers | NULL       | ALL  | NULL          | NULL | NULL    | NULL | 1    | 100.00   | NULL  |

1 row in set, 1 warning (0.01 sec)

```syntax
INSERT INTO Blazers (Name,Age) VALUES("Annamalai","18");
```

Query OK, 1 row affected (0.01 sec)

```syntax
INSERT INTO Blazers (Name,Age) VALUES ("Haiden","20"),("Santhanu","19"),("Aswath","18"),("Riyas","19"),("Rishi","20"),("Jerusheya","19"),("Saranya","18"),("Swetha","18");
```

Query OK, 8 rows affected (0.01 sec)
Records: 8 Duplicates: 0 Warnings: 0

```syntax
SELECT * FROM Blazers;
```

| Id  | Name      | Age |
| :-- | :-------- | :-- |
| 1   | Annamalai | 18  |
| 2   | Haiden    | 20  |
| 3   | Santhanu  | 19  |
| 4   | Aswath    | 18  |
| 5   | Riyas     | 19  |
| 6   | Rishi     | 20  |
| 7   | Jerusheya | 19  |
| 8   | Saranya   | 18  |
| 9   | Swetha    | 18  |

9 rows in set (0.00 sec)

```syntax
SELECT Name,Age FROM Blazers;
```

| Name      | Age |
| :-------- | :-- |
| Annamalai | 18  |
| Haiden    | 20  |
| Santhanu  | 19  |
| Aswath    | 18  |
| Riyas     | 19  |
| Rishi     | 20  |
| Jerusheya | 19  |
| Saranya   | 18  |
| Swetha    | 18  |

9 rows in set (0.00 sec)

```syntax
SELECT Id FROM Blazers;
```

| Id  |
| :-- |
| 1   |
| 2   |
| 3   |
| 4   |
| 5   |
| 6   |
| 7   |
| 8   |
| 9   |

9 rows in set (0.00 sec)

mysql>
