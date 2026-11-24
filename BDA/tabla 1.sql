USE recaudacion;
create table vehiculos(
matricula varchar(7)  primary key,
marcaModelo varchar(50),
impuesto decimal(6,2) not null default 50.00,
check(impuesto>=10.00)
);