`select * from player_can_bat;`

| Tshirt_number | name      |
| :------------ | :-------- |
| 7             | M S Dhoni |
| 8             | Jadeja    |
| 18            | Kholi     |
| 33            | Pandya    |
| 45            | Rohit     |

`select * from player_can_bowl;`

| Tshirt_number | name        |
| :------------ | :---------- |
| 4             | Natarajan   |
| 8             | Jadeja      |
| 15            | Bhuvneshwar |
| 33            | Pandya      |
| 99            | Ashwin      |

`select * from player_can_bat as bat join player_can_bowl as bowl on bat.Tshirt_number = bowl.Tshirt_number;`

| Tshirt_number | name   | Tshirt_number | name   |
| :------------ | :----- | :------------ | :----- |
| 8             | Jadeja | 8             | Jadeja |
| 33            | Pandya | 33            | Pandya |

`select * from player_can_bat as bat right join player_can_bowl as bowl on bat.Tshirt_number = bowl.Tshirt_number;`
| Tshirt_number | name | Tshirt_number | name |
|:---------------|:--------|:---------------|:-------------|
| NULL | NULL | 4 | Natarajan |
| 8 | Jadeja | 8 | Jadeja |
| NULL | NULL | 15 | Bhuvneshwar |
| 33 | Pandya | 33 | Pandya |
| NULL | NULL | 99 | Ashwin |

`select * from player_can_bat as bat left join player_can_bowl as bowl on bat.Tshirt_number = bowl.Tshirt_number;`

| Tshirt_number | name      | Tshirt_number | name   |
| :------------ | :-------- | :------------ | :----- |
| 7             | M S Dhoni | NULL          | NULL   |
| 8             | Jadeja    | 8             | Jadeja |
| 18            | Kholi     | NULL          | NULL   |
| 33            | Pandya    | 33            | Pandya |
| 45            | Rohit     | NULL          | NULL   |

`select * from player_can_bat as bat right join player_can_bowl as bowl on bat.Tshirt_number = bowl.Tshirt_number where bat.Tshirt_number is null;`

| Tshirt_number | name | Tshirt_number | name        |
| :------------ | :--- | :------------ | :---------- |
| NULL          | NULL | 4             | Natarajan   |
| NULL          | NULL | 15            | Bhuvneshwar |
| NULL          | NULL | 99            | Ashwin      |

`select * from player_can_bat as bat left join player_can_bowl as bowl on bat.Tshirt_number = bowl.Tshirt_number where bowl.Tshirt_number is null;`

| Tshirt_number | name      | Tshirt_number | name |
| :------------ | :-------- | :------------ | :--- |
| 7             | M S Dhoni | NULL          | NULL |
| 18            | Kholi     | NULL          | NULL |
| 45            | Rohit     | NULL          | NULL |

`select * from player_can_bat as bat right join player_can_bowl as bowl on bat.Tshirt_number = bowl.Tshirt_number where bat.Tshirt_number is null union all select * from player_can_bat as bat left join player_can_bowl as bowl on bat.Tshirt_number = bowl.Tshirt_number where bowl.Tshirt_number is null;`

| Tshirt_number | name      | Tshirt_number | name        |
| :------------ | :-------- | :------------ | :---------- |
| NULL          | NULL      | 4             | Natarajan   |
| NULL          | NULL      | 15            | Bhuvneshwar |
| NULL          | NULL      | 99            | Ashwin      |
| 7             | M S Dhoni | NULL          | NULL        |
| 18            | Kholi     | NULL          | NULL        |
| 45            | Rohit     | NULL          | NULL        |

`select * from player_can_bat as bat right join player_can_bowl as bowl on bat.Tshirt_number = bowl.Tshirt_number where bat.Tshirt_number is null union all select * from player_can_bat as bat left join player_can_bowl as bowl on bat.Tshirt_number = bowl.Tshirt_number where bowl.Tshirt_number is null union all select * from player_can_bat as bat join player_can_bowl as bowl on bat.Tshirt_number = bowl.Tshirt_number;`

| Tshirt_number | name      | Tshirt_number | name        |
| :------------ | :-------- | :------------ | :---------- |
| NULL          | NULL      | 4             | Natarajan   |
| NULL          | NULL      | 15            | Bhuvneshwar |
| NULL          | NULL      | 99            | Ashwin      |
| 7             | M S Dhoni | NULL          | NULL        |
| 18            | Kholi     | NULL          | NULL        |
| 45            | Rohit     | NULL          | NULL        |
| 8             | Jadeja    | 8             | Jadeja      |
| 33            | Pandya    | 33            | Pandya      |
