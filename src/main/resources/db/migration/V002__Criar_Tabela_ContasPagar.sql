create table contaspagar (
    id int not null primary key auto_increment,
    data date not null,
    idcliente int not null,
    valor decimal(12,2) not null
    );