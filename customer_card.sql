create database displaycard;
use displaycard;

create table user 
(id int primary key auto_increment,
 username varchar(20),
 useraddress nvarchar(30),	
 userphone nvarchar(25),
 usermail varchar(20),
 userprofileimg nvarchar(255),
 dateupdated datetime);
 
 describe user;
 
 insert into user(username,useraddress,userphone,usermail,userprofileimg,dateupdated) values
 ('Jhon Smith', '1, Madakkulam, Madurai', '8907654312,7890654532', 'jhon@gmail.com', 'C:\Users\surya\OneDrive\Documents\sample_user.jpg','2023-08-28 14:30:00'),
 ('Emily Johnson','2, Madakkulam, Madurai', '8907654312,7890654532', 'emily@gmail.com', 'https://www.google.com/images/branding/googlelogo/2x/googlelogo_light_color_272x92dp.png','2023-08-28 14:30:00'),
('Michael Williams', '3, Madakkulam, Madurai', '8907654312,7890654532', 'michael@gmail.com', 'https://www.google.com/images/branding/googlelogo/2x/googlelogo_light_color_272x92dp.png','2023-08-28 14:30:00'),
('Sarah Miller', '4, Madakkulam, Madurai', '8907654312,7890654532', 'sarah@gmail.com', 'https://www.google.com/images/branding/googlelogo/2x/googlelogo_light_color_272x92dp.png','2023-08-28 14:30:00'),
('Michael Williams', '3, Madakkulam, Madurai', '8907654312,7890654532', 'michael@gmail.com', 'https://www.google.com/images/branding/googlelogo/2x/googlelogo_light_color_272x92dp.png','2023-08-28 14:30:00');

select * from user;

update user set userprofileimg = '' where id=1;

insert into user(username,useraddress,userphone,usermail,userprofileimg,dateupdated) values
('Olivia Taylor', '23,Chennai,Tamil Nadu', '8854456788,9799922434', 'olivia@gmail.com','','2023-08-28 14:30:00'),
('Adams', ',32,Chennai,Tamil Nadu', '8854456788,9799922434', 'adams@gmail.com','','2023-08-28 14:30:00'),
('Jones', '33,Chennai,Tamil Nadu', '8854456788,9799922434', 'jones@gmail.com','','2023-08-28 14:30:00'),
('Jane Smith', '27,Chennai,Tamil Nadu', '8854456788,9799922434', 'smith@gmail.com','','2023-08-28 14:30:00'),
('Jessica Lee', '34,Chennai,Tamil Nadu', '8854456788,9799922434', 'lee@gmail.com','','2023-08-28 14:30:00'),
('David Miller', '46,Chennai,Tamil Nadu', '8854456788,9799922434', 'david@gmail.com','','2023-08-28 14:30:00'),
('Zafar', '65,Chennai,Tamil Nadu', '8854456788,9799922434', 'zafar@gmail.com','','2023-08-28 14:30:00'),
('Hills', '74,Chennai,Tamil Nadu', '8854456788,9799922434', 'hills@gmail.com','','2023-08-28 14:30:00');