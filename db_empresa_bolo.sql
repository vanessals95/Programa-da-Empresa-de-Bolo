create database db_empresa_bolo

use db_empresa_bolo

create table produto_cadastrado (
	codigo_produto int not null primary key,
	descricao_produto varchar(30) not null,
	quantidade_produto int not null,
	preco_produto decimal(5,2) not null,
	data_validade_produto date not null 
)

create table produto_compra (
	cod int not null primary key,
	quantidade int not null,
	descricao varchar(30) null,
	preco decimal(5,2) null
)