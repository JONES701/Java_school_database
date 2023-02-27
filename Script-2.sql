
create table students1
(
prn int(8) primary key,
name varchar(50),
dob varchar(15),
branch varchar(30),
phone varchar(10),
address varchar(150),
email varchar(30),
passwd varchar(30),
DS_marks int(3),
OS_marks int(3),
Java_marks int(3),
EM_marks int(3)
);/*DDL command */

insert into students1
values(20701,'Rajesh Patil','10/02/2002','IT','9884057610','2/4 Kirti vihar jamshedpur','rajesh112@gmail.com','kick28io',50,48,80,66),
(20702,'Pratik Sharma','10/03/2002','IT','9834557610','2/4 Kirti vihar kanpur','pratik72@gmail.com','kick24io',53,47,90,66),
(20703,'Yuvraj Salaria','03/01/2002','IT','9784059610','2/4 nirikshan vihar agra','yuvrajhh2@gmail.com','kick30io',60,58,80,70),
(20704,'Priya K','01/06/2002','IT','9882067690','2/4 vikranti vihar kolkata','prim99@gmail.com','kick27io',70,66,89,66),
(20705,'Pritesh Rathi','02/10/2002','IT','7884951610','2/4 aila vihar nagpur','pritesh112@gmail.com','kick29io',63,58,79,66);/*DML command*/

/* host:
   user: root
	password: Kolkata@023
	port: 3306
	database: SIT_Project_sem4
*/

select * from students1;

 

