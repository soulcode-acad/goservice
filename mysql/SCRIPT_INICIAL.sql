
drop database goservice_db;

create database goservice_db;

use goservice_db;

show tables;

drop table agendamentos;

drop table prestadores_servicos;

drop table servico;

select * from usuarios;

insert into usuarios (dtype, nome, email, perfil, senha, habilitado)
value ( 
	"Administrador",
	"Gabriel Braga",
    "gabriel.braga@soulcode.com",
    "ADMIN",
    "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK",
    1
); # 123456

update usuarios set habilitado = 0 where id in (1, 7, 9);

