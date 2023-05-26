mysql>  insert into address_book values('Neeraj','Rathod','AddressBook2','Teja colony','Chennai','Tamil Nadu',700022,945456789,'neerajrathod@gmail.com','Family'),('Neeraj','Rathod','AddressBook1','Teja colony','Chennai','Tamil Nadu',700022,945456789,'neerajrathod@gmail.com','Freinds');
Query OK, 2 rows affected (0.01 sec)
Records: 2  Duplicates: 0  Warnings: 0

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