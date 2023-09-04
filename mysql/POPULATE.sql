USE goservice_squad9;

-- CONSULTAS
select * from usuarios;
select * from servicos;
select * from prestadores_servicos;
select * from agendamentos;

-- INSERT ADMINS

INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUE ("Administrador", "Aline Sassaki", "aline.sassaki@soulcode.com", "ADMIN", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1); # 123456

INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUE ("Administrador", "Gabriela Godoy", "gabriela.godoy@soulcode.com", "ADMIN", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1); # 123456

INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUE ("Administrador", "Gustavo Quilante", "gustavo.quilante@soulcode.com", "ADMIN", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1); # 123456

INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUE ("Administrador", "Ludmila Souza", "ludmila.souza@soulcode.com", "ADMIN", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1); # 123456

-- POPULATE SERVICOS
INSERT INTO servicos (categoria, descricao, nome)
VALUES
    ('Tecnologia', 'Desenvolvimento de aplicativos web moder nos e interativos.', 'Desenvolvimento de Aplicativos Web'),
    ('Tecnologia', 'Desenvolvimento de software personalizado para atender às suas necessidades.', 'Desenvolvimento de Software Personalizado'),
    ('Tecnologia', 'Consultoria em Tecnologia da Informação para orientar seus projetos.', 'Consultoria em Tecnologia da Informação'),
    ('Desenvolvimento de Sites', 'Criação de sites responsivos e otimizados para dispositivos móveis.', 'Criação de Sites Responsivos'),
    ('Desenvolvimento de Sites', 'Design de sites modernos e atraentes para sua presença online.', 'Design de Sites Modernos'),
    ('Desenvolvimento de Aplicativos para Celular', 'Desenvolvimento de apps Android de alta qualidade.', 'Desenvolvimento de Apps Android'),
    ('Desenvolvimento de Aplicativos para Celular', 'Desenvolvimento de apps iOS que proporcionam uma excelente experiência do usuário.', 'Desenvolvimento de Apps iOS'),
    ('Cloud', 'Configuração de servidores em nuvem para escalabilidade e desempenho.', 'Configuração de Servidores em Nuvem'),
    ('Cloud', 'Migração para a nuvem com segurança e eficiência.', 'Migração para a Nuvem'),
    ('Banco de Dados', 'Administração de bancos de dados para garantir a integridade e o desempenho dos dados.', 'Administração de Bancos de Dados'),
    ('Banco de Dados', 'Otimização de consultas SQL para melhorar o desempenho do banco de dados.', 'Otimização de Consultas SQL'),
    ('Redes', 'Configuração de redes locais para conectividade confiável.', 'Configuração de Redes Locais'),
    ('Redes', 'Implementação de VPN para garantir a segurança das comunicações.', 'Implementação de VPN'),
    ('Segurança da Informação', 'Análise de vulnerabilidades e recomendações para fortalecer sua segurança online.', 'Análise de Vulnerabilidades'),
    ('Segurança da Informação', 'Implantação de firewalls para proteção contra ameaças cibernéticas.', 'Implantação de Firewalls');


-- INSERT PRESTADORES

INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Prestador", "Ana Silva", "ana.silva@goservice.com", "PRESTADOR", "$2y$10$RbFS8j4i5WnDttzonNuK4eu/3u57vXer4otfZVNN855.JWu.H55ty", 1), #prestador123
	   ("Prestador", "Carlos Mendes", "carlos.mendes@goservice.com", "PRESTADOR", "$2y$10$RbFS8j4i5WnDttzonNuK4eu/3u57vXer4otfZVNN855.JWu.H55ty", 1),
       ("Prestador", "Mariana Santos", "mariana.santos@goservice.com", "PRESTADOR", "$2y$10$RbFS8j4i5WnDttzonNuK4eu/3u57vXer4otfZVNN855.JWu.H55ty", 1),
	   ("Prestador", "Ricardo Oliveira", "ricardo.oliveira@goservice.com", "PRESTADOR", "$2y$10$RbFS8j4i5WnDttzonNuK4eu/3u57vXer4otfZVNN855.JWu.H55ty", 1),
       ("Prestador", "Paula Fernandes", "paula.fernandes@goservice.com", "PRESTADOR", "$2y$10$RbFS8j4i5WnDttzonNuK4eu/3u57vXer4otfZVNN855.JWu.H55ty", 1),
       ("Prestador", "Fernando Gonçalves", "fernando.goncalves@goservice.com", "PRESTADOR", "$2y$10$RbFS8j4i5WnDttzonNuK4eu/3u57vXer4otfZVNN855.JWu.H55ty", 1),
       ("Prestador", "Isabel Soares", "isabel.soares@goservice.com", "PRESTADOR", "$2y$10$RbFS8j4i5WnDttzonNuK4eu/3u57vXer4otfZVNN855.JWu.H55ty", 1),
       ("Prestador", "Lucas Alves", "lucas.alves@goservice.com", "PRESTADOR", "$2y$10$RbFS8j4i5WnDttzonNuK4eu/3u57vXer4otfZVNN855.JWu.H55ty", 1),
       ("Prestador", "Amanda Pereira", "amanda.pereira@goservice.com", "PRESTADOR", "$2y$10$RbFS8j4i5WnDttzonNuK4eu/3u57vXer4otfZVNN855.JWu.H55ty", 1),
       ("Prestador", "Pedro Rocha", "pedro.rocha@goservice.com", "PRESTADOR", "$2y$10$RbFS8j4i5WnDttzonNuK4eu/3u57vXer4otfZVNN855.JWu.H55ty", 1),
       ("Prestador", "Camila Santos", "camila.santos@goservice.com", "PRESTADOR", "$2y$10$RbFS8j4i5WnDttzonNuK4eu/3u57vXer4otfZVNN855.JWu.H55ty", 1),
       ("Prestador", "Rafael Pereira", "rafael.pereira@goservice.com", "PRESTADOR", "$2y$10$RbFS8j4i5WnDttzonNuK4eu/3u57vXer4otfZVNN855.JWu.H55ty", 1),
       ("Prestador", "Juliana Fernandes", "juliana.fernandes@goservice.com", "PRESTADOR", "$2y$10$RbFS8j4i5WnDttzonNuK4eu/3u57vXer4otfZVNN855.JWu.H55ty", 1),
	   ("Prestador", "Thiago Oliveira", "thiago.oliveira@@goservice.com", "PRESTADOR", "$2y$10$RbFS8j4i5WnDttzonNuK4eu/3u57vXer4otfZVNN855.JWu.H55ty", 1),
       ("Prestador", "Larissa Gonçalves", "larissa.goncalves@goservice.com", "PRESTADOR", "$2y$10$RbFS8j4i5WnDttzonNuK4eu/3u57vXer4otfZVNN855.JWu.H55ty", 1);

-- INSERT CLIENTES

INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES ("Cliente", "João da Silva", "joao.silva@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1), #cliente123
       ("Cliente", "Maria Santos", "maria.santos@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
       ("Cliente", "Carlos Ferreira", "carlos.ferreira@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
       ("Cliente", "Ana Oliveira", "ana.oliveira@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
	   ("Cliente", "Pedro Rodrigues", "pedro.rodrigues@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
	   ("Cliente", "Mariana Almeida", "mariana.almeida@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
       ("Cliente", "Paulo Ribeiro", "paulo.ribeiro@gmail.comm", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
	   ("Cliente", "Camila Lima", "camila.lima@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
	   ("Cliente", "Ricardo Sousa", "ricardo.sousa@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
       ("Cliente", "Fernanda Silva", "fernanda.silva@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
	   ("Cliente", "Luciana Santos", "luciana.santos@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
	   ("Cliente", "Rafael Pereira", "rafael.pereira@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
	   ("Cliente", "Juliana Fernandes", "juliana.fernandes@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
	   ("Cliente", "Thiago Oliveira", "thiago.oliveira@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
	   ("Cliente", "Larissa Gonçalves", "larissa.goncalves@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwmy", 1);

INSERT INTO usuarios (dtype, nome, email, perfil, senha, habilitado)
VALUES 
  ("Cliente", "Isabela Santos", "isabela.santos@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
  ("Cliente", "Gustavo Lima", "gustavo.lima@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
  ("Cliente", "Luana Oliveira", "luana.oliveira@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
  ("Cliente", "Rafaela Souza", "rafaela.souza@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
  ("Cliente", "Eduardo Pereira", "eduardo.pereira@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
  ("Cliente", "Fernando Silva", "fernando.silva@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
  ("Cliente", "Roberto Santos", "roberto.santos@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
  ("Cliente", "Carla Ferreira", "carla.ferreira@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
  ("Cliente", "André Oliveira", "andre.oliveira@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
  ("Cliente", "Mariana Silva", "mariana.silva@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
  ("Cliente", "Felipe Lima", "felipe.lima@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
  ("Cliente", "Patrícia Souza", "patricia.souza@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
  ("Cliente", "Thiago Rodrigues", "thiago.rodrigues@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
  ("Cliente", "Camila Pereira", "camila.pereira@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
  ("Cliente", "Lucas Fernandes", "lucas.fernandes@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1),
  ("Cliente", "Renata Oliveira", "renata.oliveira@gmail.com", "CLIENTE", "$2y$10$p4EGF5amLX3FrffrNXvWuuXr7/PXCbIXw1AAcoJhqFlDgfVlFwUwm", 1);

-- POPULATE PRESTADOR/SERVICOS

INSERT INTO prestadores_servicos (servico_id, prestador_id)
VALUES
	(1, 5),
    (2, 6),
    (3, 7),
    (4, 8),
    (5, 9),
    (6, 10),
    (7, 11),
    (8, 12),
    (9, 13),
    (10, 14),
    (11, 15),
    (12, 16),
    (13, 17),
    (14, 18),
    (15, 19);

-- POPULATE AGENDAMENTOS

INSERT INTO agendamentos (cliente_id, prestador_id, servico_id, status_agendamento, data, hora,  data_hora_registro)
	VALUES 
    (20, 5, 1, 'AGUARDANDO_CONFIRMACAO', '2023-09-04', '10:00:00', NOW()),
    (21, 5, 1, 'CONFIRMADO', '2023-09-05', '11:00:00', NOW()),
    (22, 5, 1, 'CONCLUIDO', '2023-09-06', '12:00:00', NOW()),
    (23, 5, 1, 'CANCELADO_PELO_CLIENTE', '2023-09-07', '13:00:00', NOW()),
    (24, 5, 1, 'CANCELADO_PELO_PRESTADOR', '2023-09-08', '14:00:00', NOW());
    
INSERT INTO agendamentos (cliente_id, prestador_id, servico_id, status_agendamento, data, hora,  data_hora_registro)
	VALUES
    (25, 6, 2, 'AGUARDANDO_CONFIRMACAO', '2023-02-04', '10:00:00', NOW()),
    (26, 6, 2, 'CONFIRMADO', '2023-02-05', '11:00:00', NOW()),
    (27, 6, 2, 'CONCLUIDO', '2023-02-06', '12:00:00', NOW()),
    (28, 6, 2, 'CANCELADO_PELO_CLIENTE', '2023-02-07', '13:00:00', NOW()),
    (29, 6, 2, 'CANCELADO_PELO_PRESTADOR', '2023-02-08', '14:00:00', NOW()),
    --
	(30, 7, 3, 'AGUARDANDO_CONFIRMACAO', '2023-03-04', '10:00:00', NOW()),
    (31, 7, 3, 'CONFIRMADO', '2023-03-05', '11:00:00', NOW()),
    (32, 7, 3, 'CONCLUIDO', '2023-03-06', '12:00:00', NOW()),
    (33, 7, 3, 'CANCELADO_PELO_CLIENTE', '2023-03-07', '13:00:00', NOW()),
    (34, 7, 3, 'CANCELADO_PELO_PRESTADOR', '2023-03-08', '14:00:00', NOW()),
    --
    (30, 7, 3, 'AGUARDANDO_CONFIRMACAO', '2023-03-04', '10:00:00', NOW()),
    (31, 7, 3, 'CONFIRMADO', '2023-03-05', '11:00:00', NOW()),
    (32, 7, 3, 'CONCLUIDO', '2023-03-06', '12:00:00', NOW()),
    (33, 7, 3, 'CANCELADO_PELO_CLIENTE', '2023-03-07', '13:00:00', NOW()),
    (34, 7, 3, 'CANCELADO_PELO_PRESTADOR', '2023-03-08', '14:00:00', NOW()),
    --
    (35, 8, 4, 'AGUARDANDO_CONFIRMACAO', '2023-04-04', '10:00:00', NOW()),
    (36, 8, 4, 'CONFIRMADO', '2023-04-05', '11:00:00', NOW()),
    (37, 8, 4, 'CONCLUIDO', '2023-04-06', '12:00:00', NOW()),
    (38, 8, 4, 'CANCELADO_PELO_CLIENTE', '2023-04-07', '13:00:00', NOW()),
    (39, 8, 4, 'CANCELADO_PELO_PRESTADOR', '2023-04-08', '14:00:00', NOW()),
    --
    (40, 9, 5, 'AGUARDANDO_CONFIRMACAO', '2023-05-04', '10:00:00', NOW()),
    (41, 9, 5, 'CONFIRMADO', '2023-05-05', '11:00:00', NOW()),
    (42, 9, 5, 'CONCLUIDO', '2023-05-06', '12:00:00', NOW()),
    (43, 9, 5, 'CANCELADO_PELO_CLIENTE', '2023-05-07', '13:00:00', NOW()),
    (44, 9, 5, 'CANCELADO_PELO_PRESTADOR', '2023-05-08', '14:00:00', NOW()),
    --
    (45, 10, 6, 'AGUARDANDO_CONFIRMACAO', '2023-06-04', '10:00:00', NOW()),
    (46, 10, 6, 'CONFIRMADO', '2023-06-05', '11:00:00', NOW()),
    (47, 10, 6, 'CONCLUIDO', '2023-06-06', '12:00:00', NOW()),
    (48, 10, 6, 'CANCELADO_PELO_CLIENTE', '2023-06-07', '13:00:00', NOW()),
    (49, 10, 6, 'CANCELADO_PELO_PRESTADOR', '2023-06-08', '14:00:00', NOW()),
    --
    (50, 11, 7, 'AGUARDANDO_CONFIRMACAO', '2023-04-04', '10:00:00', NOW()),
    (20, 11, 7, 'CONFIRMADO', '2023-04-05', '11:00:00', NOW()),
    (21, 11, 7, 'CONCLUIDO', '2023-04-06', '12:00:00', NOW()),
    (22, 11, 7, 'CANCELADO_PELO_CLIENTE', '2023-04-07', '13:00:00', NOW()),
    (23, 11, 7, 'CANCELADO_PELO_PRESTADOR', '2023-04-08', '14:00:00', NOW()),
    --
    (24, 12, 8, 'AGUARDANDO_CONFIRMACAO', '2023-07-04', '10:00:00', NOW()),
    (25, 12, 8, 'CONFIRMADO', '2023-07-05', '11:00:00', NOW()),
    (26, 12, 8, 'CONCLUIDO', '2023-07-06', '12:00:00', NOW()),
    (27, 12, 8, 'CANCELADO_PELO_CLIENTE', '2023-07-07', '13:00:00', NOW()),
    (28, 12, 8, 'CANCELADO_PELO_PRESTADOR', '2023-07-08', '14:00:00', NOW()),
    --
    (29, 13, 9, 'AGUARDANDO_CONFIRMACAO', '2023-08-04', '10:00:00', NOW()),
    (30, 13, 9, 'CONFIRMADO', '2023-08-05', '11:00:00', NOW()),
    (31, 13, 9, 'CONCLUIDO', '2023-08-06', '12:00:00', NOW()),
    (32, 13, 9, 'CANCELADO_PELO_CLIENTE', '2023-08-07', '13:00:00', NOW()),
    (33, 13, 9, 'CANCELADO_PELO_PRESTADOR', '2023-08-08', '14:00:00', NOW()),
    --
    (34, 14, 10, 'AGUARDANDO_CONFIRMACAO', '2023-10-04', '10:00:00', NOW()),
    (35, 14, 10, 'CONFIRMADO', '2023-10-05', '11:00:00', NOW()),
    (36, 14, 10, 'CONCLUIDO', '2023-10-06', '12:00:00', NOW()),
    (37, 14, 10, 'CANCELADO_PELO_CLIENTE', '2023-10-07', '13:00:00', NOW()),
    (38, 14, 10, 'CANCELADO_PELO_PRESTADOR', '2023-10-08', '14:00:00', NOW()),
    --
    (39, 15, 11, 'AGUARDANDO_CONFIRMACAO', '2023-11-04', '10:00:00', NOW()),
    (40, 15, 11, 'CONFIRMADO', '2023-11-05', '11:00:00', NOW()),
    (41, 15, 11, 'CONCLUIDO', '2023-11-06', '12:00:00', NOW()),
    (42, 15, 11, 'CANCELADO_PELO_CLIENTE', '2023-11-07', '13:00:00', NOW()),
    (43, 15, 11, 'CANCELADO_PELO_PRESTADOR', '2023-11-08', '14:00:00', NOW()),
    --
    (44, 16, 12, 'AGUARDANDO_CONFIRMACAO', '2023-01-04', '10:00:00', NOW()),
    (45, 16, 12, 'CONFIRMADO', '2023-01-05', '11:00:00', NOW()),
    (46, 16, 12, 'CONCLUIDO', '2023-01-06', '12:00:00', NOW()),
    (47, 16, 12, 'CANCELADO_PELO_CLIENTE', '2023-01-07', '13:00:00', NOW()),
    (48, 16, 12, 'CANCELADO_PELO_PRESTADOR', '2023-01-08', '14:00:00', NOW()),
    --
	(49, 17, 13, 'AGUARDANDO_CONFIRMACAO', '2023-12-04', '10:00:00', NOW()),
    (50, 17, 13, 'CONFIRMADO', '2023-12-05', '11:00:00', NOW()),
    (20, 17, 13, 'CONCLUIDO', '2023-12-06', '12:00:00', NOW()),
    (21, 17, 13, 'CANCELADO_PELO_CLIENTE', '2023-12-07', '13:00:00', NOW()),
    (22, 17, 13, 'CANCELADO_PELO_PRESTADOR', '2023-12-08', '14:00:00', NOW()),
    --
	(23, 18, 14, 'AGUARDANDO_CONFIRMACAO', '2023-09-15', '10:00:00', NOW()),
    (24, 18, 14, 'CONFIRMADO', '2023-08-06', '11:00:00', NOW()),
    (25, 18, 14, 'CONCLUIDO', '2023-07-11', '12:00:00', NOW()),
    (26, 18, 14, 'CANCELADO_PELO_CLIENTE', '2023-01-12', '13:00:00', NOW()),
    (27, 18, 14, 'CANCELADO_PELO_PRESTADOR', '2023-01-23', '14:00:00', NOW()),
    --
	(28, 19, 15, 'AGUARDANDO_CONFIRMACAO', '2023-12-14', '10:00:00', NOW()),
    (29, 19, 15, 'CONFIRMADO', '2023-11-15', '11:00:00', NOW()),
    (30, 19, 15, 'CONCLUIDO', '2023-05-16', '12:00:00', NOW()),
    (31, 19, 15, 'CANCELADO_PELO_CLIENTE', '2023-04-17', '13:00:00', NOW()),
    (32, 19, 15, 'CANCELADO_PELO_PRESTADOR', '2023-06-25', '14:00:00', NOW());


