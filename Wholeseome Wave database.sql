CREATE TABLE `patients` (
  `ACCOUNT_NUM` int(8) DEFAULT NULL,
  `FIRST_NAME` varchar(45),
  `LAST_NAME` varchar(45),
  `STREET` varchar(150),
  `APARTMENT` varchar(5),
  `CITY` varchar(45),
  `STATE_CODE` char(2),
  `ZIP_CODE` int(5),
  `PHONE` varchar(12),
  `EMAIL` varchar(45),
  `FAMILY_SIZE` int,
  `BALANCE` decimal(8,2),
  `PASSWORD` char(8)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `providers` (
  `PROVIDER_NUM` int(8),
  `PASSCODE` char(6),
  `NAME` varchar(150),
  `TYPE` varchar(45)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `purchases` (
  `PURCHASE_NUM` int,
  `ACCOUNT_NUM` int(8),
  `DATE` date,
  `AMOUNT` double(8,2)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into PATIENTS
values 
(50012345, 'Kathryn','Smith','555 Pacific Ave','3A','Long Beach','CA',90805, '
(530)555-5678','none@juno.com',5,150, 'ygbwM8TY');
insert into PATIENTS
values 
(50012346, 'Alan','Rodriguez','908 Freemont St.','','Los Angeles','CA',19810, '
(999)444-3333','mine@none.com',7,210, 'Vt3QGv3b');
insert into PATIENTS
values 
(50012347, 'Anastasya','Masson','3104 Doctors Drive','','Los Angeles','CA',90017, '310-341-3870','a.masson779@gmail.com',2,60, 'ffZyNSeT');
insert into PATIENTS
values 
(50012348, 'Marilyn','Adkins','3788 Atha Drive','509','Bakersfield','CA',93301, '661-627-9529','marilynadkins@yahoo.com',4,120, 'XaHfXxf5');
insert into PATIENTS
values 
(50012349, 'Josefina','Parsons','4285 Jett Lane','','Burbank','CA',91504, '310-709-6683','mixter999@boo.email',3,90, 'XmJGLAS6');
insert into PATIENTS
values 
(50012350, 'Levi','Martinez','4849 Center Avenue','','Fresno','CA',93721, '559-451-5619','martinez@fake.com',3,90, 'yDLTp2ad');

insert into PROVIDERS
values (10012345, 'Sb9874','Dr. Wilkens','Physician');
insert into PROVIDERS
values (10012378, 'Xdd578','ABC Nutrition','Class');
insert into PROVIDERS
values (10059786, 'Yzv907','Lakisha Jones','Social Worker');
insert into PROVIDERS
values (10036754, 'Gtr456','Cooking 101','Class');

insert into PURCHASES
values (59786,50012345, '11/2/2017',5);
insert into PURCHASES
values (59787,50012346, '11/2/2017',9);
insert into PURCHASES
values (59788,50012347, '11/2/2017',8.76);
insert into PURCHASES
values (59789,50012345, '11/2/2017',5.54);
insert into PURCHASES
values (59790,50012345, '11/2/2017',3.29);
insert into PURCHASES
values (59791,50012348, '11/7/2017',3.29);
insert into PURCHASES
values (59792,50012349, '11/8/2017',8.77);
insert into PURCHASES
values (59793,50012350, '11/9/2017',9.99);
insert into PURCHASES
values (59794,50012346, '11/9/2017',10.25);
insert into PURCHASES
values (59795,50012347, '11/9/2017',14.78);
insert into PURCHASES
values (59796,50012348, '11/12/2017',3.56);
insert into PURCHASES
values (59797,50012347, '11/13/2017',11.39);
insert into PURCHASES
values (59798,50012349, '11/13/2017',1.14);
insert into PURCHASES
values (59799,50012348, '11/15/2017',8.56);
insert into PURCHASES
values (59800,50012346, '11/23/2017',11.43);
insert into PURCHASES
values (59801,50012346, '11/23/2017',7.51);
insert into PURCHASES
values (59802,50012349, '11/23/2017',8.2);
insert into PURCHASES
values (59803,50012348, '11/23/2017',11.31);
insert into PURCHASES
values (59804,50012350, '11/23/2017',13.06);