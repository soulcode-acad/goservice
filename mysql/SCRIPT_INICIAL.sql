-- INICIAIS
describe usuarios;
describe prestadores_servicos;

-- CONSULTAS
select * from usuarios;
select * from servicos;
select * from prestadores_servicos;
select * from agendamentos;

-- INSERT ADMIN
insert into usuarios (dtype, nome, email, perfil, senha, habilitado)
value ("Administrador", "admin", "admin@mail.com", "ADMIN", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1); # 123456

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


INSERT INTO usuarios (nome, email, senha, habilitado, perfil, dtype)
VALUES
    ('Cliente 1', 'cliente1@example.com', "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, "CLIENTE", "Cliente"),
    ('Cliente 2', 'cliente2@example.com', "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, "CLIENTE", "Cliente"),
    ('Cliente 3', 'cliente3@example.com', "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, "CLIENTE", "Cliente"),
    ('Cliente 4', 'cliente4@example.com', "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, "CLIENTE", "Cliente"),
    ('Cliente 5', 'cliente5@example.com', "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, "CLIENTE", "Cliente"),
    ('Cliente 6', 'cliente6@example.com', "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, "CLIENTE", "Cliente"),
    ('Cliente 7', 'cliente7@example.com', "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, "CLIENTE", "Cliente"),
    ('Cliente 8', 'cliente8@example.com', "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, "CLIENTE", "Cliente"),
    ('Cliente 9', 'cliente9@example.com', "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, "CLIENTE", "Cliente"),
    ('Cliente 10', 'cliente10@example.com', "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, "CLIENTE", "Cliente");
    
    
INSERT INTO usuarios (nome, email, senha, habilitado, perfil, dtype)
VALUES
    ('Prestador 1', 'prestador1@example.com', "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, "PRESTADOR", "Prestador"),
    ('Prestador 2', 'prestador2@example.com', "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, "PRESTADOR", "Prestador"),
    ('Prestador 3', 'prestador3@example.com', "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, "PRESTADOR", "Prestador"),
    ('Prestador 4', 'prestador4@example.com', "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, "PRESTADOR", "Prestador"),
    ('Prestador 5', 'prestador5@example.com', "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, "PRESTADOR", "Prestador"),
    ('Prestador 6', 'prestador6@example.com', "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, "PRESTADOR", "Prestador"),
    ('Prestador 7', 'prestador7@example.com', "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, "PRESTADOR", "Prestador"),
    ('Prestador 8', 'prestador8@example.com', "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, "PRESTADOR", "Prestador"),
    ('Prestador 9', 'prestador9@example.com', "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, "PRESTADOR", "Prestador"),
    ('Prestador 10', 'prestador10@example.com', "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, "PRESTADOR", "Prestador");
