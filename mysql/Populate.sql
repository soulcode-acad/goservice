select * from usuarios;
 select * from servicos;
 
insert into usuarios (dtype, nome, email, perfil, senha, habilitado)
value ("Administrador", "Henrique", "henrique@mail.com", "ADMIN", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1); # 123456


insert into usuarios (dtype, nome, email, perfil, senha, habilitado)
value ("Administrador", "Nicole", "nicole@mail.com", "ADMIN", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1); # 123456



INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Administrador", "Vitor", "vitor@mail.com", "ADMIN", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Administrador", "Luiza", "luiza@mail.com", "ADMIN", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Administrador", "Gabrielf", "gabrielf@mail.com", "ADMIN", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

SELECT * FROM servicos;

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
    
insert into usuarios (dtype, nome, email, perfil, senha, habilitado)
value ("Cliente", "João", "joao@mail.com", "Cliente", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1); # 123456
    
-- Cliente 2
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Cliente", "Maria", "maria@mail.com", "Cliente", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

-- Cliente 3
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Cliente", "Pedro", "pedro@mail.com", "Cliente", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

-- Cliente 4
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Cliente", "Ana", "ana@mail.com", "Cliente", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

-- Cliente 5
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Cliente", "Rafael", "rafael@mail.com", "Cliente", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

-- Cliente 6
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Cliente", "Camila", "camila@mail.com", "Cliente", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

-- Cliente 7
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Cliente", "Lucas", "lucas@mail.com", "Cliente", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

-- Cliente 8
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Cliente", "Mariana", "mariana@mail.com", "Cliente", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

-- Cliente 9
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Cliente", "Gustavo", "gustavo@mail.com", "Cliente", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

-- Cliente 10
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Cliente", "Isabela", "isabela@mail.com", "Cliente", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

-- Cliente 10
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Prestador", "Marco", "marco@mail.com", "PRESTADOR", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

-- Prestador 1
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Prestador", "Renata", "renata@mail.com", "PRESTADOR", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

-- Prestador 2
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Prestador", "Fernando", "fernando@mail.com", "PRESTADOR", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

-- Prestador 3
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Prestador", "Carla", "carla@mail.com", "PRESTADOR", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

-- Prestador 4
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Prestador", "Leonardo", "leonardo@mail.com", "PRESTADOR", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

-- Prestador 5
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Prestador", "Juliana", "juliana@mail.com", "PRESTADOR", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

-- Prestador 6
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Prestador", "Ricardo", "ricardo@mail.com", "PRESTADOR", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

-- Prestador 7
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Prestador", "Larissa", "larissa@mail.com", "PRESTADOR", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

-- Prestador 8
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Prestador", "Alexandre", "alexandre@mail.com", "PRESTADOR", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

-- Prestador 9
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Prestador", "Patrícia", "patricia@mail.com", "PRESTADOR", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);


-- Prestador 24
INSERT INTO prestadores_servicos (servico_id, prestador_id)
VALUES (1, 24), (2, 24);

-- Prestador 25
INSERT INTO prestadores_servicos (servico_id, prestador_id)
VALUES (3, 25), (4, 25);

-- Prestador 26
INSERT INTO prestadores_servicos (servico_id, prestador_id)
VALUES (5, 26), (6, 26);

-- Prestador 27
INSERT INTO prestadores_servicos (servico_id, prestador_id)
VALUES (7, 27), (8, 27);

-- Prestador 28
INSERT INTO prestadores_servicos (servico_id, prestador_id)
VALUES (9, 28), (10, 28);

-- Prestador 29
INSERT INTO prestadores_servicos (servico_id, prestador_id)
VALUES (1, 29), (2, 29);

-- Prestador 30
INSERT INTO prestadores_servicos (servico_id, prestador_id)
VALUES (3, 30), (4, 30);

-- Prestador 31
INSERT INTO prestadores_servicos (servico_id, prestador_id)
VALUES (5, 31), (6, 31);

-- Prestador 32
INSERT INTO prestadores_servicos (servico_id, prestador_id)
VALUES (7, 32), (8, 32);

-- Prestador 33
INSERT INTO prestadores_servicos (servico_id, prestador_id)
VALUES (9, 33), (10, 33);


