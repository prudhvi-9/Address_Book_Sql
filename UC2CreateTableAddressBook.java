
mysql> create table address_book(firstname varchar(40),lastname varchar(40),address varchar(300),city varchar(25),state varchar(20),zip integer(6),phonenumber integer(10),email varchar(250));
Query OK, 0 rows affected, 2 warnings (0.03 sec)


mysql> desc address_book;
+-------------+--------------+------+-----+---------+-------+
| Field       | Type         | Null | Key | Default | Extra |
+-------------+--------------+------+-----+---------+-------+
| firstname   | varchar(40)  | YES  |     | NULL    |       |
| lastname    | varchar(40)  | YES  |     | NULL    |       |
| address     | varchar(300) | YES  |     | NULL    |       |
| city        | varchar(25)  | YES  |     | NULL    |       |
| state       | varchar(20)  | YES  |     | NULL    |       |
| zip         | int          | YES  |     | NULL    |       |
| phonenumber | int          | YES  |     | NULL    |       |
| email       | varchar(250) | YES  |     | NULL    |       |
+-------------+--------------+------+-----+---------+-------+
8 rows in set (0.00 sec)