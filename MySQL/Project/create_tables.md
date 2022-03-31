## "roles" table creating.

```sql
CREATE TABLE roles (
role_id bigint AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(20) NOT NULL UNIQUE
);
```

## "users" table creating.

```sql
CREATE TABLE users (
user_id bigint AUTO_INCREMENT PRIMARY KEY,
role_id bigint NOT NULL,
password VARCHAR(10),
first_name VARCHAR(20) NOT NULL,
last_name VARCHAR(20) NOT NULL,
email VARCHAR(50) UNIQUE NOT NULL,
contact_number BIGINT NOT NULL UNIQUE,
date_of_birth TIMESTAMP NOT NULL,
Gender VARCHAR(10),
parent_name VARCHAR(20),
parent_contact_number BIGINT,
enroll_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
address varchar(255),
CHECK (gender IN ('Female' , 'Male')),
CHECK (date_of_birth <= '2006-04-01 00:00:00'),
FOREIGN KEY (role_id)
REFERENCES roles (role_id)
);
```

## "faq" table creating.

```sql
CREATE TABLE queries (
    queries_id bigint AUTO_INCREMENT PRIMARY KEY,
    question varchar(255) NOT NULL,
    answer varchar(255) NOT NULL,
    mail varchar(50) NOT NULL,
    name varchar(20) NOT NULL
);
```

## "application_status" table creating.

```sql
    user_id bigint UNIQUE not null,
    result VARCHAR(10) CHECK (result in ('selected','not selected','pending')) default "pending",
    FOREIGN KEY (user_id)
        REFERENCES  users(user_id)
        ON UPDATE CASCADE ON DELETE CASCADE
);
```

## "application_result_checking_details" table creating.

```sql
    check_id bigint AUTO_INCREMENT PRIMARY KEY,
    user_id bigint not null,
    checked_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
    ON UPDATE CASCADE ON DELETE CASCADE
);
```
