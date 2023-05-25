mysql> select * from address_book;
+-----------+----------+---------------------------+-----------+------------+--------+-------------+----------------------+
| firstname | lastname | address                   | city      | state      | zip    | phonenumber | email                |
+-----------+----------+---------------------------+-----------+------------+--------+-------------+----------------------+
| Hari      | Sharma   | plotno:99,Shiva colony    | Pune      | Maharastra | 600009 |   723496788 | harisharma@gmail.com |
| Rohit     | Rao      | plotno:11,Pramod colony   | Hyderabad | Telangana  | 600039 |   723451756 | rohitrao@gmail.com   |
| Shiva     | Sai      | plotno:19,Kiran colony    | Hyderabad | Telangana  | 600029 |   723451723 | shivasai@gmail.com   |
| suhas     | Yadav    | plotno:94,Vayapuri colony | Pune      | Maharastra | 600019 |   723456779 | suhasyadav@gmail.com |
+-----------+----------+---------------------------+-----------+------------+--------+-------------+----------------------+
4 rows in set (0.01 sec)

mysql> select count(*) from address_book where state='Telangana';
+----------+
| count(*) |
+----------+
|        2 |
+----------+
1 row in set (0.00 sec)

mysql> select count(*) from address_book where state='Telangana' or state='Maharastra';
+----------+
| count(*) |
+----------+
|        4 |
+----------+
1 row in set (0.00 sec)

mysql> select count(*) from address_book where city='Hyderabad';
+----------+
| count(*) |
+----------+
|        2 |
+----------+
1 row in set (0.00 sec)
