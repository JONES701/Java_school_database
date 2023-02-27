create table teacher1
(
id int(8) primary key,
name varchar(50),
dob varchar(15),
branch varchar(30),
phone varchar(10),
address varchar(150),
email varchar(30),
passwd varchar(30)

);/*DDL command */

insert into teacher1
values(10771,'Rajesh Singh','10/02/1987','IT','9884057610','2/4 Kirti vihar jamshedpur','rajesh112@gmail.com','kick28io'),
(10772,'Pratik Sharma','10/03/1983','IT','9834557610','11/20 Kirti vihar kanpur','pratik7062@gmail.com','kick24io'),
(10773,'Vikrant Sharma','03/01/1978','IT','9784059610','10/5 nirikshan vihar agra','vikhh2@gmail.com','kick30io'),
(10774,'Priya Kunjan','01/06/1980','IT','9882067690','2/8 vikranti vihar kolkata','prims919@gmail.com','kick27io'),
(10775,'Pritesh Rathi','02/10/1977','IT','7884951610','34A, aila vihar nagpur','pritesh112@gmail.com','kick29io');/*DML command*/

/* host:
   user: root
	password: Kolkata@023
	port: 3306
	database: SIT_Project_sem4
*/

select * from teacher1;

