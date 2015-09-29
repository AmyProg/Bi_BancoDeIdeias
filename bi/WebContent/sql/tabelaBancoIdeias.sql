create database if not exists bi_db;
use bi_db;


create table user(
id int(11) NOT NULL auto_increment,
nome varchar(45)  not null,
email varchar(45) not null,
primary key(id)
);
