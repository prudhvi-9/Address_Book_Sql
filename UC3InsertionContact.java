mysql> insert into address_book(firstname,lastname,address,city,state,zip,phonenumber,email)values('Sai','Kiran','Surya colony','Hyderabad','Telangana',600001,123456789,'saikiran@gmail.com');
Query OK, 1 row affected (0.01 sec)

mysql> select * from address_book;
+-----------+----------+--------------+-----------+-----------+--------+-------------+--------------------+
| firstname | lastname | address      | city      | state     | zip    | phonenumber | email              |
+-----------+----------+--------------+-----------+-----------+--------+-------------+--------------------+
| Sai       | Kiran    | Surya colony | Hyderabad | Telangana | 600001 |   123456789 | saikiran@gmail.com |
+-----------+----------+--------------+-----------+-----------+--------+-------------+--------------------+
1 row in set (0.00 sec)

mysql> insert into address_book(firstname,lastname,address,city,state,zip,phonenumber,email)values('Hari','Sharma','plotno:99,Shiva colony','Pune','Maharastra',600009,723496788,'harisharma@gmail.com');
Query OK, 1 row affected (0.01 sec)

mysql> select * from address_book;
+-----------+----------+------------------------+-----------+------------+--------+-------------+----------------------+
| firstname | lastname | address                | city      | state      | zip    | phonenumber | email                |
+-----------+----------+------------------------+-----------+------------+--------+-------------+----------------------+
| Hari      | Sharma   | plotno:99,Shiva colony | Pune      | Maharastra | 600009 |   723496788 | harisharma@gmail.com |
| Sai       | Kiran    | Surya colony           | Hyderabad | Telangana  | 600001 |   123456789 | saikiran@gmail.com   |
+-----------+----------+------------------------+-----------+------------+--------+-------------+----------------------+
2 rows in set (0.00 sec)