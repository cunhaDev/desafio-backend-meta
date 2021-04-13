create table cliente(

	id bigint not null auto_increment,
	nome varchar(255) not null,
	sobre_nome varchar(255) not null,
	cpf varchar(255) not null,
	data_nasc varchar(255) not null,
	endereco varchar(255) not null,
	
	primary key(id)

);