create database exercicio10;
use exercicio10;

create table clientes (
id_cliente int primary key auto_increment,
nome varchar(50)
);

insert into clientes (nome) values
('Carlos Lima'),
('Allison Pereira'),
('Pedro Rodrigues'),
('Fernando Marcos'),
('Gustavo Antonio');