mysql> select * from address_book;
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+-----------------------+---------+
| firstname | lastname | addressbookname | address                   | city      | state      | zip    | phonenumber | email                 | type    |
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+-----------------------+---------+
| Sai       | Kiran    | AddressBook1    | Surya colony              | Hyderabad | Telangana  | 600001 |   123456789 | saikiran@gmail.com    | Friends |
| Hari      | Sharma   | AddressBook1    | plotno:99,Shiva colony    | Pune      | Maharastra | 600009 |   723496788 | harisharma@gmail.com  | Friends |
| Rohit     | Rao      | AddressBook2    | plotno:11,Pramod colony   | Hyderabad | Telangana  | 600039 |   723451756 | rohitrao@gmail.com    | Family  |
| Shiva     | Sai      | AddressBook2    | plotno:19,Kiran colony    | Hyderabad | Telangana  | 600029 |   723451723 | shivasai@gmail.com    | Family  |
| suhas     | Yadav    | AddressBook3    | plotno:94,Vayapuri colony | Pune      | Maharastra | 600019 |   723456779 | suhasyadav@gmail.com  | Work    |
| prasad    | Kumar    | AddressBook3    | sri colony                | Pune      | Maharastra | 600022 |   134456789 | prasadkumar@gmail.com | Work    |
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+-----------------------+---------+
6 rows in set (0.00 sec)

mysql> select count(*) from address_book where type='Family';
+----------+
| count(*) |
+----------+
|        2 |
+----------+
1 row in set (0.01 sec)

mysql> select count(*) from address_book where type='Work';
+----------+
| count(*) |
+----------+
|        2 |
+----------+
1 row in set (0.00 sec)

mysql> select count(*) from address_book where type='Friends';
+----------+
| count(*) |
+----------+
|        2 |
+----------+
1 row in set (0.00 sec)
