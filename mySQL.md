# MySQL-Query Syntax

```syntax
SHOW DATABASES;
```

### MySQL Statement to list databases.

```syntax
USE database_name;
```

### MySQL Statement to select the database.

```syntax
SHOW TABLES;
```

### MySQL Statement to list the table from selected databases.

```syntax
CREATE database_name;
```

### MySQL Statement to Create new database.

```syntax
CREATE TABLE table_name ( column_name data_type constraints,column_name data_type constraints,...);
```

### MySQL Statement to create new table.

```syntax
DESC table_name;
```

### MySQL Statement to show structure of the table.

```syntax
INSERT INTO table_name VALUES (value1,value2,...);
```

### MySQL Statement to insert value into table.

```syntax
INSERT INTO table_name (column_name1,column_name2,...) VALUES (value1,value2,...);
```

### MySQL Statement to insert value into table using unorder column name.

```syntax
SELECT * FROM table_name;
```

### MySQL Statement to show table.

```syntax
CREATE TABLE table_name (column_name1 data_type constraints, column_name2 data_type constraints, foregin key(column_name) references another_table_name(primary key column name of another_table_name));
```

### MySQL Statement to create new child table with foregin key using parent table primary key.

```syntax
ALTER TABLE old_table_name RENAME TO new_table_name;
```

### MySQL Statement to rename table.

```syntax
ALTER TABLE table_name RENAME COLUMN old_column_name TO new_column_name;
```

### MySQL Statement to rename column.
