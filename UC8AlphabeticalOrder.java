mysql> select * from address_book;
+-----------+----------+---------------------------+-----------+------------+--------+-------------+----------------------+
| firstname | lastname | address                   | city      | state      | zip    | phonenumber | email                |
+-----------+----------+---------------------------+-----------+------------+--------+-------------+----------------------+
| Sai       | Kiran    | Surya colony              | Hyderabad | Telangana  | 600001 |   123456789 | saikiran@gmail.com   |
| Hari      | Sharma   | plotno:99,Shiva colony    | Pune      | Maharastra | 600009 |   723496788 | harisharma@gmail.com |
| Rohit     | Rao      | plotno:11,Pramod colony   | Hyderabad | Telangana  | 600039 |   723451756 | rohitrao@gmail.com   |
| Shiva     | Sai      | plotno:19,Kiran colony    | Hyderabad | Telangana  | 600029 |   723451723 | shivasai@gmail.com   |
| suhas     | Yadav    | plotno:94,Vayapuri colony | Pune      | Maharastra | 600019 |   723456779 | suhasyadav@gmail.com |
+-----------+----------+---------------------------+-----------+------------+--------+-------------+----------------------+
5 rows in set (0.00 sec)


mysql> select * from address_book where city ='Hyderabad' ORDER by firstname ASC;
+-----------+----------+-------------------------+-----------+-----------+--------+-------------+--------------------+
| firstname | lastname | address                 | city      | state     | zip    | phonenumber | email              |
+-----------+----------+-------------------------+-----------+-----------+--------+-------------+--------------------+
| Rohit     | Rao      | plotno:11,Pramod colony | Hyderabad | Telangana | 600039 |   723451756 | rohitrao@gmail.com |
| Sai       | Kiran    | Surya colony            | Hyderabad | Telangana | 600001 |   123456789 | saikiran@gmail.com |
| Shiva     | Sai      | plotno:19,Kiran colony  | Hyderabad | Telangana | 600029 |   723451723 | shivasai@gmail.com |
+-----------+----------+-------------------------+-----------+-----------+--------+-------------+--------------------+
3 rows in set (0.00 sec)

mysql> select * from address_book where city ='Pune' ORDER by firstname ASC;
+-----------+----------+---------------------------+------+------------+--------+-------------+----------------------+
| firstname | lastname | address                   | city | state      | zip    | phonenumber | email                |
+-----------+----------+---------------------------+------+------------+--------+-------------+----------------------+
| Hari      | Sharma   | plotno:99,Shiva colony    | Pune | Maharastra | 600009 |   723496788 | harisharma@gmail.com |
| suhas     | Yadav    | plotno:94,Vayapuri colony | Pune | Maharastra | 600019 |   723456779 | suhasyadav@gmail.com |
+-----------+----------+---------------------------+------+------------+--------+-------------+----------------------+
2 rows in set (0.00 sec)