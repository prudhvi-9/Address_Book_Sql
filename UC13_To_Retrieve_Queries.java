mysql> select * from address_book;
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+------------------------+---------+
| firstname | lastname | addressbookname | address                   | city      | state      | zip    | phonenumber | email                  | type    |
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+------------------------+---------+
| Sai       | Kiran    | AddressBook1    | Surya colony              | Hyderabad | Telangana  | 600001 |   123456789 | saikiran@gmail.com     | Friends |
| Hari      | Sharma   | AddressBook1    | plotno:99,Shiva colony    | Pune      | Maharastra | 600009 |   723496788 | harisharma@gmail.com   | Friends |
| Rohit     | Rao      | AddressBook2    | plotno:11,Pramod colony   | Hyderabad | Telangana  | 600039 |   723451756 | rohitrao@gmail.com     | Family  |
| Shiva     | Sai      | AddressBook2    | plotno:19,Kiran colony    | Hyderabad | Telangana  | 600029 |   723451723 | shivasai@gmail.com     | Family  |
| suhas     | Yadav    | AddressBook3    | plotno:94,Vayapuri colony | Pune      | Maharastra | 600019 |   723456779 | suhasyadav@gmail.com   | Work    |
| prasad    | Kumar    | AddressBook3    | sri colony                | Pune      | Maharastra | 600022 |   134456789 | prasadkumar@gmail.com  | Work    |
| Neeraj    | Rathod   | AddressBook2    | Teja colony               | Chennai   | Tamil Nadu | 700022 |   945456789 | neerajrathod@gmail.com | Family  |
| Neeraj    | Rathod   | AddressBook1    | Teja colony               | Chennai   | Tamil Nadu | 700022 |   945456789 | neerajrathod@gmail.com | Freinds |
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+------------------------+---------+
8 rows in set (0.01 sec)

mysql>  select * from address_book where city='Pune' or state='Maharastra';
+-----------+----------+-----------------+---------------------------+------+------------+--------+-------------+-----------------------+---------+
| firstname | lastname | addressbookname | address                   | city | state      | zip    | phonenumber | email                 | type    |
+-----------+----------+-----------------+---------------------------+------+------------+--------+-------------+-----------------------+---------+
| Hari      | Sharma   | AddressBook1    | plotno:99,Shiva colony    | Pune | Maharastra | 600009 |   723496788 | harisharma@gmail.com  | Friends |
| suhas     | Yadav    | AddressBook3    | plotno:94,Vayapuri colony | Pune | Maharastra | 600019 |   723456779 | suhasyadav@gmail.com  | Work    |
| prasad    | Kumar    | AddressBook3    | sri colony                | Pune | Maharastra | 600022 |   134456789 | prasadkumar@gmail.com | Work    |
+-----------+----------+-----------------+---------------------------+------+------------+--------+-------------+-----------------------+---------+
3 rows in set (0.00 sec)

mysql>  select count(*) from address_book where state='Telangana';
+----------+
| count(*) |
+----------+
|        3 |
+----------+
1 row in set (0.01 sec)

mysql>  select count(*) from address_book where state='Maharastra';
+----------+
| count(*) |
+----------+
|        3 |
+----------+
1 row in set (0.00 sec)

mysql>  select count(*) from address_book where city='Pune';
+----------+
| count(*) |
+----------+
|        3 |
+----------+
1 row in set (0.00 sec)

mysql>  select count(*) from address_book where city='Hyderabad';
+----------+
| count(*) |
+----------+
|        3 |
+----------+
1 row in set (0.00 sec)

mysql>  select count(*) from address_book where city='Chennai';
+----------+
| count(*) |
+----------+
|        2 |
+----------+
1 row in set (0.00 sec)

mysql> select * from address_book;
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+------------------------+---------+
| firstname | lastname | addressbookname | address                   | city      | state      | zip    | phonenumber | email                  | type    |
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+------------------------+---------+
| Sai       | Kiran    | AddressBook1    | Surya colony              | Hyderabad | Telangana  | 600001 |   123456789 | saikiran@gmail.com     | Friends |
| Hari      | Sharma   | AddressBook1    | plotno:99,Shiva colony    | Pune      | Maharastra | 600009 |   723496788 | harisharma@gmail.com   | Friends |
| Rohit     | Rao      | AddressBook2    | plotno:11,Pramod colony   | Hyderabad | Telangana  | 600039 |   723451756 | rohitrao@gmail.com     | Family  |
| Shiva     | Sai      | AddressBook2    | plotno:19,Kiran colony    | Hyderabad | Telangana  | 600029 |   723451723 | shivasai@gmail.com     | Family  |
| suhas     | Yadav    | AddressBook3    | plotno:94,Vayapuri colony | Pune      | Maharastra | 600019 |   723456779 | suhasyadav@gmail.com   | Work    |
| prasad    | Kumar    | AddressBook3    | sri colony                | Pune      | Maharastra | 600022 |   134456789 | prasadkumar@gmail.com  | Work    |
| Neeraj    | Rathod   | AddressBook2    | Teja colony               | Chennai   | Tamil Nadu | 700022 |   945456789 | neerajrathod@gmail.com | Family  |
| Neeraj    | Rathod   | AddressBook1    | Teja colony               | Chennai   | Tamil Nadu | 700022 |   945456789 | neerajrathod@gmail.com | Freinds |
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+------------------------+---------+
8 rows in set (0.00 sec)

mysql> select * from address_book where city ='Hyderabad' ORDER by firstname ASC;
+-----------+----------+-----------------+-------------------------+-----------+-----------+--------+-------------+--------------------+---------+
| firstname | lastname | addressbookname | address                 | city      | state     | zip    | phonenumber | email              | type    |
+-----------+----------+-----------------+-------------------------+-----------+-----------+--------+-------------+--------------------+---------+
| Rohit     | Rao      | AddressBook2    | plotno:11,Pramod colony | Hyderabad | Telangana | 600039 |   723451756 | rohitrao@gmail.com | Family  |
| Sai       | Kiran    | AddressBook1    | Surya colony            | Hyderabad | Telangana | 600001 |   123456789 | saikiran@gmail.com | Friends |
| Shiva     | Sai      | AddressBook2    | plotno:19,Kiran colony  | Hyderabad | Telangana | 600029 |   723451723 | shivasai@gmail.com | Family  |
+-----------+----------+-----------------+-------------------------+-----------+-----------+--------+-------------+--------------------+---------+
3 rows in set (0.00 sec)

mysql> select * from address_book where city ='Pune' ORDER by firstname ASC;
+-----------+----------+-----------------+---------------------------+------+------------+--------+-------------+-----------------------+---------+
| firstname | lastname | addressbookname | address                   | city | state      | zip    | phonenumber | email                 | type    |
+-----------+----------+-----------------+---------------------------+------+------------+--------+-------------+-----------------------+---------+
| Hari      | Sharma   | AddressBook1    | plotno:99,Shiva colony    | Pune | Maharastra | 600009 |   723496788 | harisharma@gmail.com  | Friends |
| prasad    | Kumar    | AddressBook3    | sri colony                | Pune | Maharastra | 600022 |   134456789 | prasadkumar@gmail.com | Work    |
| suhas     | Yadav    | AddressBook3    | plotno:94,Vayapuri colony | Pune | Maharastra | 600019 |   723456779 | suhasyadav@gmail.com  | Work    |
+-----------+----------+-----------------+---------------------------+------+------------+--------+-------------+-----------------------+---------+
3 rows in set (0.00 sec)

mysql> select * from address_book where city ='Chennai' ORDER by firstname ASC;
+-----------+----------+-----------------+-------------+---------+------------+--------+-------------+------------------------+---------+
| firstname | lastname | addressbookname | address     | city    | state      | zip    | phonenumber | email                  | type    |
+-----------+----------+-----------------+-------------+---------+------------+--------+-------------+------------------------+---------+
| Neeraj    | Rathod   | AddressBook2    | Teja colony | Chennai | Tamil Nadu | 700022 |   945456789 | neerajrathod@gmail.com | Family  |
| Neeraj    | Rathod   | AddressBook1    | Teja colony | Chennai | Tamil Nadu | 700022 |   945456789 | neerajrathod@gmail.com | Freinds |
+-----------+----------+-----------------+-------------+---------+------------+--------+-------------+------------------------+---------+
2 rows in set (0.00 sec)

mysql> select count(*) from address_book where type='Family';
+----------+
| count(*) |
+----------+
|        3 |
+----------+
1 row in set (0.00 sec)

mysql> select count(*) from address_book where type='Freinds';
+----------+
| count(*) |
+----------+
|        1 |
+----------+
1 row in set (0.00 sec)

mysql> select count(*) from address_book where type='Work';
+----------+
| count(*) |
+----------+
|        2 |
+----------+
1 row in set (0.00 sec)