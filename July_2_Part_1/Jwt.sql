drop database if exists jwtHexaNew;

create database jwtHexaNew;

use JwtHexaNew;

Create Table Employ
(
  eid INT Primary Key Auto_increment,
  name varchar(50),
  gender ENUM('MALE','FEMALE'),
  email varchar(100),
  password varchar(255),
  roles varchar(100)
);