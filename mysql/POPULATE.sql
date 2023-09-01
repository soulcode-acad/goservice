use goservice_squad8;

insert into usuarios (dtype, nome, email, perfil, senha, habilitado)
value ("Administrador", "Admin", "admin@admin.com", "ADMIN", "$2a$10$r3r9V682sIhE/61jZjqkauT.08pxrBx.GE1T.yEogN5r8Ly2S8eTK", 1);

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
    
select * from servicos;

INSERT INTO usuarios (dtype, id, email, habilitado, nome, senha, perfil)
VALUES
  ('Cliente', 17, 'lucas_cliente@gmail.com', 1, 'Lucas Cliente', '$2a$12$ReOFGbhcS/v.8JtV0I8U9OY6FlQECLMR0i1HJNuUv3iKBCPU2N6dC', 'CLIENTE'),
  ('Cliente', 18, 'julia_cliente@gmail.com', 1, 'Julia Cliente', '$2a$12$5JdihEHcOAGl.vH6yBk0T.XGpGvsrF.noWPC77TyK9XmchJqPGavW', 'CLIENTE'),
  ('Cliente', 19, 'andre_cliente@gmail.com', 1, 'Andre Cliente', '$2a$12$cBcqgPVQlVV8JjKkZ10Bl.TUYXw.8v54sxqEIKkkAKNBaiZ82BSJu', 'CLIENTE'),
  ('Cliente', 20, 'maria_cliente@gmail.com', 1, 'Maria Cliente', '$2a$12$6BDhY4bCeZTz2Eajl7VoQe05A4tqRUfWujHlL.KeyngZnmQWXVxCC', 'CLIENTE'),
  ('Cliente', 21, 'pedro_cliente@gmail.com', 1, 'Pedro Cliente', '$2a$12$RrKrOOYvteIMXAzJKd9mf.CPX5BzubOVUXMzkTpqrt2ZBdJ.RVxSi', 'CLIENTE'),
  ('Cliente', 22, 'camila_cliente@gmail.com', 1, 'Camila Cliente', '$2a$12$RrJlhx3/gDOAniwMzdMo8OA4iNSRjBFobJCWtd4sgGLEUUhnSXOgS', 'CLIENTE'),
  ('Cliente', 23, 'ricardo_cliente@gmail.com', 1, 'Ricardo Cliente', '$2a$12$/pd3mss64uQ8SPf8i8UiVukqnEehJZNKsBPjzlKTuP4MhrK63QTQy', 'CLIENTE'),
  ('Cliente', 24, 'sofia_cliente@gmail.com', 1, 'Sofia Cliente', '$2a$12$lOI4UWqwVPg3JTq8iZCzxeQiIYOVasw.9BL1O.2szSOG2QnlWt.AS', 'CLIENTE'),
  ('Cliente', 25, 'fernando_cliente@gmail.com', 1, 'Fernando Cliente', '$2a$12$LXak9pt7zvAIQSYzHMxsCOswJpF3AJw1AXupQDrN6B7angMojItsy', 'CLIENTE'),
  ('Cliente', 26, 'larissa_cliente@gmail.com', 1, 'Larissa Cliente', '$2a$12$Fj5VAvAyp/d4a3OG4fBn3.6bKjORASPBuEkf/We1bcaJVV9BOvtpu', 'CLIENTE'),
  ('Cliente', 27, 'gustavo_cliente@gmail.com', 1, 'Gustavo Cliente', '$2a$12$6sRwMxaCH6jHzDxBwEUkH..1S9Mplon5pybIL2RNUei9VZKo5htYy', 'CLIENTE'),
  ('Cliente', 28, 'carolina_cliente@gmail.com', 1, 'Carolina Cliente', '$2a$12$8JKwRAY.KDufT/9n8LgIp.kFV/evQJBISSRkgDiyUNskbmQWieWSe', 'CLIENTE'),
  ('Cliente', 29, 'bruno_cliente@gmail.com', 1, 'Bruno Cliente', '$2a$12$9KSDGL.tnnhrlLrk2Oy6lerxfhUTnMbw9U9p/AYFCm.XO5eIDk4Hi', 'CLIENTE'),
  ('Cliente', 30, 'mariana_cliente@gmail.com', 1, 'Mariana Cliente', '$2a$12$7ASa6jS0gY9KQnwOwkL/JeZCu0QpKlq.aHrUgWUPcuRpWjPHa44Dm', 'CLIENTE');
  
  select * from usuarios;
  
  -- Inserir associação entre prestadores e serviços
INSERT INTO prestadores_servicos (prestador_id, servico_id)
VALUES
  (3, 1), (3, 2), (3, 3),
  (4, 2), (4, 3), (4, 4),
  (5, 3), (5, 4), (5, 5),
  (6, 4), (6, 5), (6, 6),
  (7, 5), (7, 6), (7, 7),
  (8, 6), (8, 7), (8, 8),
  (9, 7), (9, 8), (9, 9),
  (10, 8), (10, 9), (10, 10),
  (11, 9), (11, 10), (11, 1),
  (12, 10), (12, 1), (12, 2),
  (13, 1), (13, 2), (13, 3),
  (14, 2), (14, 3), (14, 4),
  (15, 3), (15, 4), (15, 5),
  (16, 4), (16, 5), (16, 6);
