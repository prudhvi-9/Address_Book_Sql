mysql> alter table address_book add addressbookname varchar(30) after lastname;
Query OK, 0 rows affected (0.06 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select * from address_book;
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+----------------------+------+
| firstname | lastname | addressbookname | address                   | city      | state      | zip    | phonenumber | email                | type |
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+----------------------+------+
| Sai       | Kiran    | NULL            | Surya colony              | Hyderabad | Telangana  | 600001 |   123456789 | saikiran@gmail.com   | NULL |
| Hari      | Sharma   | NULL            | plotno:99,Shiva colony    | Pune      | Maharastra | 600009 |   723496788 | harisharma@gmail.com | NULL |
| Rohit     | Rao      | NULL            | plotno:11,Pramod colony   | Hyderabad | Telangana  | 600039 |   723451756 | rohitrao@gmail.com   | NULL |
| Shiva     | Sai      | NULL            | plotno:19,Kiran colony    | Hyderabad | Telangana  | 600029 |   723451723 | shivasai@gmail.com   | NULL |
| suhas     | Yadav    | NULL            | plotno:94,Vayapuri colony | Pune      | Maharastra | 600019 |   723456779 | suhasyadav@gmail.com | NULL |
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+----------------------+------+
5 rows in set (0.00 sec)

mysql> update address_book set addressbookname='AddressBook1',type='Friends'
    -> where firstname ='Sai' or lastname='Sharma';
Query OK, 2 rows affected (0.01 sec)
Rows matched: 2  Changed: 2  Warnings: 0

mysql> select * from address_book;
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+----------------------+---------+
| firstname | lastname | addressbookname | address                   | city      | state      | zip    | phonenumber | email                | type    |
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+----------------------+---------+
| Sai       | Kiran    | AddressBook1    | Surya colony              | Hyderabad | Telangana  | 600001 |   123456789 | saikiran@gmail.com   | Friends |
| Hari      | Sharma   | AddressBook1    | plotno:99,Shiva colony    | Pune      | Maharastra | 600009 |   723496788 | harisharma@gmail.com | Friends |
| Rohit     | Rao      | NULL            | plotno:11,Pramod colony   | Hyderabad | Telangana  | 600039 |   723451756 | rohitrao@gmail.com   | NULL    |
| Shiva     | Sai      | NULL            | plotno:19,Kiran colony    | Hyderabad | Telangana  | 600029 |   723451723 | shivasai@gmail.com   | NULL    |
| suhas     | Yadav    | NULL            | plotno:94,Vayapuri colony | Pune      | Maharastra | 600019 |   723456779 | suhasyadav@gmail.com | NULL    |
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+----------------------+---------+
5 rows in set (0.00 sec)
       
mysql> update address_book set addressbookname='AddressBook1',type='Family'
    -> where firstname ='Rohit' or lastname='Sai';
Query OK, 2 rows affected (0.01 sec)
Rows matched: 2  Changed: 2  Warnings: 0

mysql> select * from address_book;
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+----------------------+---------+
| firstname | lastname | addressbookname | address                   | city      | state      | zip    | phonenumber | email                | type    |
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+----------------------+---------+
| Sai       | Kiran    | AddressBook1    | Surya colony              | Hyderabad | Telangana  | 600001 |   123456789 | saikiran@gmail.com   | Friends |
| Hari      | Sharma   | AddressBook1    | plotno:99,Shiva colony    | Pune      | Maharastra | 600009 |   723496788 | harisharma@gmail.com | Friends |
| Rohit     | Rao      | AddressBook1    | plotno:11,Pramod colony   | Hyderabad | Telangana  | 600039 |   723451756 | rohitrao@gmail.com   | Family  |
| Shiva     | Sai      | AddressBook1    | plotno:19,Kiran colony    | Hyderabad | Telangana  | 600029 |   723451723 | shivasai@gmail.com   | Family  |
| suhas     | Yadav    | NULL            | plotno:94,Vayapuri colony | Pune      | Maharastra | 600019 |   723456779 | suhasyadav@gmail.com | NULL    |
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+----------------------+---------+
5 rows in set (0.00 sec)


mysql> update address_book set addressbookname='AddressBook2'
    -> where firstname ='Rohit' or lastname='Sai';
Query OK, 2 rows affected (0.01 sec)
Rows matched: 2  Changed: 2  Warnings: 0

mysql> select * from address_book;
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+----------------------+---------+
| firstname | lastname | addressbookname | address                   | city      | state      | zip    | phonenumber | email                | type    |
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+----------------------+---------+
| Sai       | Kiran    | AddressBook1    | Surya colony              | Hyderabad | Telangana  | 600001 |   123456789 | saikiran@gmail.com   | Friends |
| Hari      | Sharma   | AddressBook1    | plotno:99,Shiva colony    | Pune      | Maharastra | 600009 |   723496788 | harisharma@gmail.com | Friends |
| Rohit     | Rao      | AddressBook2    | plotno:11,Pramod colony   | Hyderabad | Telangana  | 600039 |   723451756 | rohitrao@gmail.com   | Family  |
| Shiva     | Sai      | AddressBook2    | plotno:19,Kiran colony    | Hyderabad | Telangana  | 600029 |   723451723 | shivasai@gmail.com   | Family  |
| suhas     | Yadav    | NULL            | plotno:94,Vayapuri colony | Pune      | Maharastra | 600019 |   723456779 | suhasyadav@gmail.com | NULL    |
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+----------------------+---------+
5 rows in set (0.00 sec)

mysql> update address_book set addressbookname='AddressBook3',type='Work'
    -> where firstname ='suhas';
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from address_book;
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+----------------------+---------+
| firstname | lastname | addressbookname | address                   | city      | state      | zip    | phonenumber | email                | type    |
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+----------------------+---------+
| Sai       | Kiran    | AddressBook1    | Surya colony              | Hyderabad | Telangana  | 600001 |   123456789 | saikiran@gmail.com   | Friends |
| Hari      | Sharma   | AddressBook1    | plotno:99,Shiva colony    | Pune      | Maharastra | 600009 |   723496788 | harisharma@gmail.com | Friends |
| Rohit     | Rao      | AddressBook2    | plotno:11,Pramod colony   | Hyderabad | Telangana  | 600039 |   723451756 | rohitrao@gmail.com   | Family  |
| Shiva     | Sai      | AddressBook2    | plotno:19,Kiran colony    | Hyderabad | Telangana  | 600029 |   723451723 | shivasai@gmail.com   | Family  |
| suhas     | Yadav    | AddressBook3    | plotno:94,Vayapuri colony | Pune      | Maharastra | 600019 |   723456779 | suhasyadav@gmail.com | Work    |
+-----------+----------+-----------------+---------------------------+-----------+------------+--------+-------------+----------------------+---------+
5 rows in set (0.00 sec)


mysql>  insert into address_book(firstname,lastname,addressbookname,address,city,state,zip,phonenumber,email,type)values('prasad','Kumar','AddressBook3','sri colony','Pune','Maharastra',600022,134456789,'prasadkumar@gmail.com','Work');
Query OK, 1 row affected (0.00 sec)

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