-- Inserir serviços
INSERT INTO servicos (categoria, descricao, nome) VALUES 
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

    -- Inserir enderecos
INSERT INTO enderecos (cidade, logradouro, numero, uf) VALUES
	('São Paulo', 'Avenida Paulista', '123', 'SP'),
	('Rio de Janeiro', 'Rua Copacabana', '456', 'RJ'),
	('Belo Horizonte', 'Avenida Belo Horizonte', '789', 'MG'),
	('Porto Alegre', 'Rua Porto Alegre', '101', 'RS'),
	('Salvador', 'Avenida Salvador', '222', 'BA'),
	('Recife', 'Rua Recife', '333', 'PE'),
	('Brasília', 'Quadra 123', '444', 'DF'),
	('Curitiba', 'Rua Curitiba', '555', 'PR'),
	('Fortaleza', 'Avenida Fortaleza', '666', 'CE');		
 select * from usuarios;
 
INSERT INTO enderecos (id) VALUES 
	(10),
	(11),
	(12),
	(13),
	(14),
	(15),
	(16),
	(17),
    (18);
    -- Inserir clientes
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado, endereco_id) VALUES 
	("Cliente", "Ana Silva", "ana.silva@email.com", "CLIENTE", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, 1),
	("Cliente", "Luiz Santos", "luiz.santos@email.com", "CLIENTE", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, 2),
	("Cliente", "Mariana Oliveira", "mariana.oliveira@email.com", "CLIENTE", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, 3),
	("Cliente", "Rafaela Rodrigues", "rafaela.rodrigues@email.com", "CLIENTE", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, 4),
	("Cliente", "Carlos Lima", "carlos.lima@email.com", "CLIENTE", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, 10),
	("Cliente", "Juliana Fernandes", "juliana.fernandes@email.com", "CLIENTE", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, 11),
	("Cliente", "Pedro Souza", "pedro.souza@email.com", "CLIENTE", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, 12),
	("Cliente", "Isabela Almeida", "isabela.almeida@email.com", "CLIENTE", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, 13),
	("Cliente", "Gustavo Ferreira", "gustavo.ferreira@email.com", "CLIENTE", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, 14);

    
    -- Inserir prestadores
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado, endereco_id) VALUES 
    ("Prestador", "Fernanda Martins", "fernanda.martins@email.com", "PRESTADOR", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, 5),
    ("Prestador", "Antônio Pereira", "antonio.pereira@email.com", "PRESTADOR", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, 6),
    ("Prestador", "Luciana Alves", "luciana.alves@email.com", "PRESTADOR", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, 7),
    ("Prestador", "Ricardo Oliveira", "ricardo.oliveira@email.com", "PRESTADOR", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, 8),
    ("Prestador", "Carolina Souza", "carolina.souza@email.com", "PRESTADOR", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, 9),
    ("Prestador", "Eduardo Ferreira", "eduardo.ferreira@email.com", "PRESTADOR", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, 15),
    ("Prestador", "Isabel Ramos", "isabel.ramos@email.com", "PRESTADOR", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, 16),
    ("Prestador", "Paulo Silva", "paulo.silva@email.com", "PRESTADOR", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, 17);
    
    -- Inserir administrador
INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado, endereco_id) VALUES 
	("Administrador", "Squad 4", "adm@mail.com", "ADMIN", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1, 18);
    
    -- Inserir registros na tabela prestadores_servicos
INSERT INTO prestadores_servicos (prestador_id, servico_id) VALUES
    (10, 1),
    (10, 2),
    (10, 3),
    (10, 4),
    (10, 5),
    (10, 6),
    (10, 7),
    (10, 8),
    (10, 9),
    (10, 10),
	(11, 2),
    (11, 3),
    (11, 4),
	(11, 9),
    (11, 10),
	(12, 3),
    (12, 5),
    (12, 6),
    (13, 2),
	(13, 4),
    (13, 7),
    (13, 8),
	(14, 5),
    (14, 9),
	(14, 10),
    (15, 1),
    (15, 2),
    (15, 6),
    (16, 3),
    (16, 4),
    (16, 7),
    (16, 8),
	(17, 2),
    (17, 3),
    (17, 5),
    (17, 6),
    (17, 8);
    
    -- Inserir registros na tabela agendamentos

INSERT INTO agendamentos (data, data_hora_registro, hora, status_agendamento, cliente_id, prestador_id, servico_id) VALUES 
  ('2023-09-05', '2023-09-05 13:24:04.130556', '18:26:00.000000', 'AGUARDANDO_CONFIRMACAO', 1, 10, 1),
  ('2023-09-05', '2023-09-05 13:24:04.130556', '18:26:00.000000', 'AGUARDANDO_CONFIRMACAO', 2, 10, 2),
  ('2023-09-05', '2023-09-05 13:24:04.130556', '18:26:00.000000', 'AGUARDANDO_CONFIRMACAO', 3, 10, 3),
  ('2023-09-05', '2023-09-05 13:24:04.130556', '18:26:00.000000', 'AGUARDANDO_CONFIRMACAO', 4, 10, 4),
  ('2023-09-05', '2023-09-05 13:24:04.130556', '18:26:00.000000', 'AGUARDANDO_CONFIRMACAO', 5, 10, 5),
  ('2023-09-05', '2023-09-05 13:24:04.130556', '18:26:00.000000', 'AGUARDANDO_CONFIRMACAO', 6, 10, 6),
  ('2023-09-05', '2023-09-05 13:24:04.130556', '18:26:00.000000', 'AGUARDANDO_CONFIRMACAO', 7, 10, 7),
  ('2023-09-05', '2023-09-05 13:24:04.130556', '18:26:00.000000', 'AGUARDANDO_CONFIRMACAO', 8, 10, 8),
  ('2023-09-05', '2023-09-05 13:24:04.130556', '18:26:00.000000', 'AGUARDANDO_CONFIRMACAO', 9, 10, 9),
  ('2023-09-05', '2023-09-05 13:24:04.130556', '18:26:00.000000', 'AGUARDANDO_CONFIRMACAO', 2, 10, 10),
  ('2023-09-06', '2023-09-05 14:30:00.000000', '15:45:00.000000', 'CONFIRMADO', 2, 11, 2),
  ('2023-09-07', '2023-09-05 15:45:00.000000', '10:00:00.000000', 'CONCLUIDO', 3, 12, 3),
  ('2023-09-08', '2023-09-05 16:45:00.000000', '14:00:00.000000', 'CANCELADO_PELO_CLIENTE', 4, 13, 4),
  ('2023-09-09', '2023-09-05 17:45:00.000000', '16:30:00.000000', 'CANCELADO_PELO_PRESTADOR', 5, 14, 5),
  ('2023-09-10', '2023-09-05 18:45:00.000000', '12:15:00.000000', 'AGUARDANDO_CONFIRMACAO', 6, 15, 6),
  ('2023-09-11', '2023-09-05 19:45:00.000000', '13:45:00.000000', 'CONFIRMADO', 7, 16, 7),
  ('2023-09-12', '2023-09-05 20:45:00.000000', '17:00:00.000000', 'CONCLUIDO', 8, 17, 8),
  ('2023-09-13', '2023-09-05 21:45:00.000000', '08:30:00.000000', 'CANCELADO_PELO_CLIENTE', 9, 10, 9),
  ('2023-09-14', '2023-09-05 22:45:00.000000', '09:15:00.000000', 'CANCELADO_PELO_PRESTADOR', 1, 11, 10),
  ('2023-09-05', '2023-09-05 13:24:04.130556', '18:26:00.000000', 'AGUARDANDO_CONFIRMACAO', 1, 15, 2),
  ('2023-09-06', '2023-09-05 14:30:00.000000', '15:45:00.000000', 'CONFIRMADO', 2, 17, 3),
  ('2023-09-07', '2023-09-05 15:45:00.000000', '10:00:00.000000', 'CONCLUIDO', 3, 13, 4),
  ('2023-09-08', '2023-09-05 16:45:00.000000', '14:00:00.000000', 'CANCELADO_PELO_CLIENTE', 4, 15, 6),
  ('2023-09-09', '2023-09-05 17:45:00.000000', '16:30:00.000000', 'CANCELADO_PELO_PRESTADOR', 5, 10, 2),
  ('2023-09-10', '2023-09-05 18:45:00.000000', '12:15:00.000000', 'AGUARDANDO_CONFIRMACAO', 6, 16, 8),
  ('2023-09-11', '2023-09-05 19:45:00.000000', '13:45:00.000000', 'CONFIRMADO', 7, 11, 9),
  ('2023-09-12', '2023-09-05 20:45:00.000000', '17:00:00.000000', 'CONCLUIDO', 8, 13, 2),
  ('2023-09-13', '2023-09-05 21:45:00.000000', '08:30:00.000000', 'CANCELADO_PELO_CLIENTE', 9, 15, 6),
  ('2023-09-14', '2023-09-05 22:45:00.000000', '09:15:00.000000', 'CANCELADO_PELO_PRESTADOR', 1, 17, 2);