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
    ('Tecnologia', 'Desenvolvimento de aplicativos web modernos e interativos.', 'Desenvolvimento de Aplicativos Web'),
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

DROP TABLE prestadores_servicos;
DROP TABLE agendamentos;
DROP TABLE usuarios;

