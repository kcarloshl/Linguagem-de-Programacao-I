create database dbtest;
use dbtest;

create table Clientes (
id_cliente int auto_increment,
nome varchar(50) not null,
primary key(id_cliente)
);
 
 insert into Clientes (nome) values
 ('Fernando'),
 ('Ana'),
 ('Carlos'),
 ('Pedro');
 
 select * from Clientes;