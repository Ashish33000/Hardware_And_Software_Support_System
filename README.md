# -airy-car-1402
This is the query resolve system helps any organisation to listen to their employee's query like is it a software related problem or a hardware related problem , then the problem will assign to the expert like any engineer of any perticular field. Then the engineer will resolve the query of any employee working in the same organisation and update the query status like is it resolve or not.

Features

Tasks of HOD(Head of department)-: HOD can register any new engineer. Able see all registered engineer. Able to delete an engineer. Able to see all raised problem.
 Able to assign raised problem an engineer.

Tasks of engineer -: Able to see new assigned complains by HOD. Able to update complain status.Able to see progress works. Able to change the password.

Tasks of employee :- Can create a new account. Able login into the system. Able to register a new complain.Able to check the status. Able to see complain history. Able to change password.

Technologies used: Core java, JDBC, MYSQL

EER Diagerm

<img src="https://user-images.githubusercontent.com/87129673/208494755-6ff23be1-a54a-4bde-a250-693da8a5063f.png" alt="">
Tables in databases;
mysql> select * from employee;
+-----+-------+----------+-----------+----------+
| eid | name  | address  | email     | password |
+-----+-------+----------+-----------+----------+
|   1 | Aman  | pune     | aman@123  | 12345    |
|   2 | Rohit | Patna    | rohit@123 | 1234     |
|   3 | Rahul | delhi    | rahul@123 | 123456   |
|   4 | Rahul | delhi    | rahul@123 | 123456   |
|   5 | Rohan | banglore | rohan@123 | 12345    |
+-----+-------+----------+-----------+----------+
mysql> select * from engineer;
+-----+--------+---------+------------+----------+----------+
| eid | name   | address | email      | password | category |
+-----+--------+---------+------------+----------+----------+
|   4 | Ashish | pune    | ashish@123 | 1234566  | software |
|   6 | Bhanu  | chennai | bhanu@123  | 123456   | software |
+-----+--------+---------+------------+----------+----------+
2 rows in set (0.01 sec)
mysql> select * from hod;
+-----+------+---------+----------+----------+
| hid | name | address | email    | password |
+-----+------+---------+----------+----------+
|   1 | Amit | Delhi   | Amit@123 | 1234     |
+-----+------+---------+----------+----------+
1 row in set (0.01 sec)
mysql> select * from employee;
+-----+-------+----------+-----------+----------+
| eid | name  | address  | email     | password |
+-----+-------+----------+-----------+----------+
|   1 | Aman  | pune     | aman@123  | 12345    |
|   2 | Rohit | Patna    | rohit@123 | 1234     |
|   3 | Rahul | delhi    | rahul@123 | 123456   |
|   4 | Rahul | delhi    | rahul@123 | 123456   |
|   5 | Rohan | banglore | rohan@123 | 12345    |
+-----+-------+----------+-----------+----------+
5 rows in set (0.00 sec)
Console Snapshots;
    <img src="https://user-images.githubusercontent.com/87129673/208497801-e1e8b39d-9254-44f9-aeb4-6fea2a3c06c3.PNG" alt="">
    <img src="https://user-images.githubusercontent.com/87129673/208497830-d7587154-55ea-4a6e-a33f-f1b485af183c.PNG" alt="">
    <img src="https://user-images.githubusercontent.com/87129673/208497837-203e23d1-e726-45d9-9e43-90946c426f4c.PNG" alt="">
    <img src="https://user-images.githubusercontent.com/87129673/208497846-749c836d-7e88-49ea-a794-6652d22279db.PNG" alt="">


