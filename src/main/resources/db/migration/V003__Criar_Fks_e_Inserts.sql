-- Chave estrangeira da tabela contaspagar para cliente.
Alter table contaspagar add constraint fk_contaspagar_cliente foreign key(idcliente) references contaspagar(id);


insert into cliente(nomecliente) values ("Giulia");
insert into cliente(nomecliente) values ("Lilian");
insert into cliente(nomecliente) values ("Magno");
insert into cliente(nomecliente) values ("João Vitor");
insert into cliente(nomecliente) values ("Júnior");


insert into contaspagar (idcliente, valor, data) values (1, 354.13, "2006-03-31");
insert into contaspagar (idcliente, valor, data) values (2, 278.67, "1976-08-15");
insert into contaspagar (idcliente, valor, data) values (3, 832.20, "1979-01-21");
insert into contaspagar (idcliente, valor, data) values (4, 431.64, "1994-11-16");
insert into contaspagar (idcliente, valor, data) values (5, 999.99, "2001-08-13");