# MySQL-labworks

```syntax
SHOW DATABASES;
```

```syntax
USE database_name;
```

```syntax
SHOW TABLES;
```

CREATE database_name;

DESC table_name;

CREATE TABLE table_name ( column_name data_type constraints,column_name data_type constraints,...);

INSERT INTO table_name VALUES (value1,value2,...);

INSERT INTO table_name (column_name1,column_name2,...) VALUES (value1,value2,...);

SELECT \* FROM table_name;

CREATE TABLE table_name (column_name1 data_type constraints, column_name2 data_type constraints, foregin key(column_name) references another_table_name(primary key column name of another_table_name));

ALTER TABLE old_table_name RENAME TO new_table_name;

ALTER TABLE table_name RENAME COLUMN old_column_name TO new_column_name;
