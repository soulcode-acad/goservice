create database goservice_db;
use goservice_db;


-- CONSULTAS
select * from usuarios u inner join endereco  e on e.id = u.endereco_id;
select * from endereco;
select * from servicos;
select * from usuarios;
select * from prestadores;
select * from usuarios u JOIN endereco e ON e.id = u.endereco_id;
select * from prestadores_servicos;
select * from agendamentos;
select * from endereco;
update usuarios u set u.endereco_id  = 1 where u.id = 1;


select * from endereco;

-- INSERT ADMIN
insert into usuarios (dtype, nome, email, perfil, senha, habilitado)
value ("Administrador", "adm1", "adm1@email.com", "ADMIN", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1); # 123456

 -- alter table usuarios drop column cidade;
 -- alter table usuarios drop column logradouro;
 -- alter table usuarios drop column numero;
 -- alter table usuarios drop column uf;
 -- alter table usuarios drop column endereco;
 -- alter table usuarios drop column endereco_id;


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



