# Customer_card
This repository contains a simple web application for displays customer details in cards. 
(Technologies: Spring boot and Thymeleaf)

Features:
  - Dynamic customer cards displaying customer profile, name, address, phone number, email and updated time.
  - filter and search option for easily access the specific customer.

Other Technologies:
  - HTML/CSS
  - Boostrap
  - Maven
  - Java
  - MySql

Instructions:
  - After clone the repo you'll change the database name and password in application.properties file(card/src/main/resources/application.properties)
  - And your db must have the table with a name 'user' and all the columns are created as follows
 (id int primary key auto_increment,
 username varchar(20),
 useraddress nvarchar(30),
 userphone nvarchar(25),
 usermail varchar(20),
 userprofileimg nvarchar(255),
 dateupdated datetime);

  - Then you can access the application in your browser at 'http://localhost:8080/home'

Author: Surya Prakash
Contact: suryamdk5@gmail.com

