Enter password: *************
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 21
Server version: 8.0.33 MySQL Community Server - GPL

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.
mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| employee           |
| information_schema |
| mysql              |
| payroll_service    |
| performance_schema |
| sys                |
+--------------------+
6 rows in set (0.00 sec)

mysql> create database Address_Book_Service;
Query OK, 1 row affected (0.01 sec)

mysql> show databases;
+----------------------+
| Database             |
+----------------------+
| address_book_service |
| employee             |
| information_schema   |
| mysql                |
| payroll_service      |
| performance_schema   |
| sys                  |
+----------------------+
7 rows in set (0.00 sec)