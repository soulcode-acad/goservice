-- POPULATE

-- SERVIÇOS
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

-- CLIENTES
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
    
-- PRESTADORES
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
    
-- PRESTADORES RELACIONADOS COM SERVIÇOS
INSERT INTO prestadores_servicos (prestador_id, servico_id)
VALUES
    (13, 1), (13, 2),
    (14, 3), (14, 4),
    (15, 5), (15, 6),
    (16, 7), (16, 8),
    (17, 9), (17, 10),
    (18, 1), (18, 2),
    (19, 3), (19, 4),
    (20, 5), (20, 6),
    (21, 7), (21, 8),
    (22, 9), (22, 10),
    (23, 1), (23, 2);