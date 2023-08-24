CREATE DATABASE goservice_db;

use goservice_db;
drop database goservice_db;
select * from usuarios;

-- drop table agendamentos;
-- drop table prestadores_servicos;
-- drop table servico;


show TABLES;

insert into usuarios (dtype, nome, email, perfil, senha, habilitado)
value ( 
	"Administrador",
	"Gabriel Dantas",
    "gabrieljdantas26@gmail.com",
    "ADMIN",
    "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK",
    1
); # 123456

update usuarios set habilitado = 0 where id in (2, 3);


