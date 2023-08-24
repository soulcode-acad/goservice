create database goservice_db;

USE goservice_db;

SHOW TABLES;

SELECT * FROM usuarios;

DROP TABLE agendamentos;
DROP TABLE prestadores_servicos;
DROP TABLE  servico;

INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUE ( 
	"Administrador",
	"Lucas Kawasaki",
    "lucas.kawasaki@hotmail.com",
    "ADMIN",
    "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK",
    1
); # 123456