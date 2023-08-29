
use goservice_db;
select * from usuarios;

drop table agendamentos;

drop table prestadores_servicos;

drop table servico;
drop table usuarios;
select * from agendamentos;
insert into usuarios (dtype, nome, email, perfil, senha, habilitado)
value ( 
	"Administrador",
	"Gabriel Braga",
    "gabriel.braga@soulcode.com",	
    "ADMIN",
    "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK",
    1
); # 123456
-- Populando tabela de usuários com senhas criptografadas
INSERT INTO usuarios (dtype,nome, email, senha, habilitado, perfil)
VALUES
    ('Prestador','João Silva', 'joao@example.com', '$2a$10$vbhL7HD45LVd0ImrSyBNz.ABr7FmNBEyXcVOE6sl5hZNslSPrJL2K', 1, 'PRESTADOR'), #senha: senha123
    ('Prestador', 'Maria Santos', 'maria@example.com', '$2a$10$vbhL7HD45LVd0ImrSyBNz.ABr7FmNBEyXcVOE6sl5hZNslSPrJL2K', 1, 'PRESTADOR'),  #senha: senha456
    ('Prestador','Carlos Almeida', 'carlos@example.com', '$2a$10$vbhL7HD45LVd0ImrSyBNz.ABr7FmNBEyXcVOE6sl5hZNslSPrJL2K', 1, 'PRESTADOR'),  #senha: senha789
    ('Prestador','Ana Oliveira', 'ana@example.com', '$2a$10$vbhL7HD45LVd0ImrSyBNz.ABr7FmNBEyXcVOE6sl5hZNslSPrJL2K', 1, 'PRESTADOR');  #senha: senha987	



drop database goservice_db;
create database goservice_db;

use goservice_db;

describe usuarios;
describe prestadores_servicos;

drop table usuarios;

delete from usuarios where id = 7;

-- CONSULTAS
select * from usuarios;
select * from servicos;
select * from prestadores_servicos;
select * from agendamentos;

delete from prestadores_servicos where servico_id = 20;
delete from servicos where id = 20;

SELECT s.* FROM servicos s
JOIN prestadores_servicos ps ON s.id = ps.servico_id
JOIN usuarios u ON u.id = ps.prestador_id
WHERE u.email = "leonardo@mail.com";

-- INSERT ADMIN
insert into usuarios (dtype, nome, email, perfil, senha, habilitado)
value ("Administrador", "Gabriel Braga", "gabriel.braga@soulcode.com", "ADMIN", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1); # 123456

-- POPULATE

INSERT INTO servicos (categoria, descricao, nome) 
VALUES 
    ('Limpeza', 'Serviço de limpeza residencial', 'Limpeza Residencial'),
    ('Treinamento', 'Treinamento corporativo em liderança', 'Treinamento em Liderança'),
    ('Saúde', 'Consulta médica de clínico geral', 'Consulta Clínico Geral'),
    ('Desenvolvimento', 'Desenvolvimento de aplicativo móvel', 'Desenvolvimento de App'),
    ('Design', 'Design de logotipo para empresas', 'Design de Logotipo'),
    ('Limpeza', 'Limpeza de escritórios comerciais', 'Limpeza Comercial'),
    ('Treinamento', 'Treinamento em habilidades de comunicação', 'Treinamento em Comunicação'),
    ('Saúde', 'Sessão de fisioterapia para reabilitação', 'Fisioterapia de Reabilitação'),
    ('Desenvolvimento', 'Desenvolvimento de site institucional', 'Desenvolvimento de Site Institucional'),
    ('Design', 'Design de interface de usuário para aplicativos', 'Design de Interface de Aplicativo');

select * from usuarios;
select * from servicos;
select * from prestadores_servicos;
-- Populando a tabela prestadores_servicos com IDs de prestadores e serviços
INSERT INTO prestadores_servicos (prestador_id, servico_id)
VALUES
    (4, 1),
    (4, 3),
    (4, 5),
    (5, 2),
    (5, 4),
    (6, 3),
    (6, 6),
    (6, 8),
    (7, 1),
    (7, 2),
    (7, 3),
    (7, 4),
    (7, 5),
    (7, 6),
    (7, 7),
    (7, 8),
    (7, 9),
    (7, 10);

INSERT INTO prestadores_servicos (servico_id, prestador_id)
VALUES
    (11, 11),
    (13, 12),
    (15, 11),
    (16, 12),
    (17, 11),
    (18, 12),
    (20, 11),
    (21, 12),
    (22, 11),
    (11, 12),
    (13, 11),
    (15, 12),
    (16, 11),
    (17, 12),
    (18, 11),
    (20, 12),
    (21, 11),
    (22, 12),
    (11, 11),
    (13, 12),
    (15, 11),
    (16, 12),
    (17, 11),
    (18, 12),
    (20, 11),
    (21, 12),
    (22, 11),
    (11, 12),
    (13, 11),
    (15, 12);

