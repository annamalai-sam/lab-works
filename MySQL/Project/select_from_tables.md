```syntax
SELECT * FROM admin_details;
```

| user_id | password |
| :-----: | :------: |
|    1    | passw@01 |
|    2    | passw@02 |

2 rows in set (0.00 sec)

```syntax
SELECT * FROM application_result_checking_details;
```

| check_id | user_id |    checked_time     |
| :------: | :-----: | :-----------------: |
|    1     |    3    | 2022-03-22 13:43:57 |
|    2     |    4    | 2022-03-22 13:43:57 |
|    3     |    5    | 2022-03-22 13:43:57 |

3 rows in set (0.00 sec)

```syntax
SELECT * FROM application_status;
```

| user_id |    result    |
| :-----: | :----------: |
|    3    |   pending    |
|    4    |   selected   |
|    5    |   pending    |
|    6    |   selected   |
|    7    |   pending    |
|    8    |   selected   |
|    9    |   selected   |
|   10    | not selected |
|   11    | not selected |
|   12    |   pending    |

10 rows in set (0.00 sec)

```syntax
SELECT * FROM faq;
```

| faq_id |                     question                      | answer |     mail      | name  |
| :----: | :-----------------------------------------------: | :----: | :-----------: | :---: |
|   1    |              What is the course fee?              |  NULL  | test1@abc.com | test1 |
|   2    |       What is the duration of the program?        |  NULL  | test2@abc.com | test2 |
|   3    |                  Can I reapply?                   |  NULL  | test3@abc.com | test3 |
|   4    | What is expected of me during the FWSA programme? |  NULL  | test4@abc.com | test4 |

4 rows in set (0.01 sec)

```syntax
SELECT * FROM roles;
```

| role_id |   name    |
| :-----: | :-------: |
|    1    |   admin   |
|    2    | applicant |

2 rows in set (0.01 sec)

```syntax
SELECT * FROM users;
```

| user_id | role_id | first_name | last_name |       email       | contact_number |    date_of_birth    | Gender | parent_name | parent_contact_number |     enroll_time     | address     |
| :-----: | ------: | :--------: | :-------: | :---------------: | :------------: | :-----------------: | :----: | :---------: | :-------------------: | :-----------------: | :---------- |
|    1    |       1 |    anna    |   malai   |   test1@abc.com   |   9876543102   | 2006-03-01 00:00:00 |  Male  |    malai    |      9876543210       | 2022-03-22 12:57:35 | madurai     |
|    2    |       1 |   chith    |    raj    |   test2@abc.com   |   8765432109   | 2006-03-01 00:00:00 | Female |     raj     |      9876543210       | 2022-03-22 12:57:35 | tirunelveli |
|    3    |       2 |    test    |    one    |  testone@abc.com  |   9776543201   | 2006-03-01 00:00:00 |  Male  |     one     |      9876543210       | 2022-03-22 12:57:35 | madurai     |
|    4    |       2 |    test    |    two    |  testtwo@abc.com  |   9366543201   | 2006-03-01 00:00:00 | Female |     two     |      9876543210       | 2022-03-22 12:57:35 | chennai     |
|    5    |       2 |    test    |   three   | testthree@abc.com |   9575543201   | 2006-03-01 00:00:00 |  Male  |    three    |      9876543210       | 2022-03-22 12:57:35 | trichy      |
|    6    |       2 |    test    |   four    | testfour@abc.com  |   9826583201   | 2006-03-01 00:00:00 | Female |    four     |      9876543210       | 2022-03-22 12:57:35 | coimbatore  |
|    7    |       2 |    test    |   five    | testfive@abc.com  |   9176503201   | 2006-03-01 00:00:00 |  Male  |    five     |      9876543210       | 2022-03-22 12:57:35 | trichy      |
|    8    |       2 |    test    |    six    |  testsix@abc.com  |   9676543501   | 2006-03-01 00:00:00 | Female |     six     |      9876543210       | 2022-03-22 12:57:35 | coimbatore  |
|    9    |       2 |    test    |   seven   | testseven@abc.com |   9077543201   | 2006-03-01 00:00:00 |  Male  |    seven    |      9876543210       | 2022-03-22 12:57:35 | tirunelveli |
|   10    |       2 |    test    |   eight   | testeight@abc.com |   9478543201   | 2006-03-01 00:00:00 | Female |    eight    |      9876543210       | 2022-03-22 12:57:35 | madurai     |
|   11    |       2 |    test    |   nine    | testnine@abc.com  |   9676583201   | 2006-03-01 00:00:00 |  Male  |    nine     |      9876543210       | 2022-03-22 12:57:35 | tirunelveli |
|   12    |       2 |    test    |    ten    |  testten@abc.com  |   9976543401   | 2006-03-01 00:00:00 | Female |     ten     |      9876543210       | 2022-03-22 12:57:35 | chennai     |
