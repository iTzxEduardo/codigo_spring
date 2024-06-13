INSERT INTO areas (id_area, nome_area) VALUES 
(1, 'Tecnologia da Informação'),
(2, 'Eletrônica'),
(3, 'Mecânica');

INSERT INTO blocos (idbloco, nome_bloco) VALUES
(1, 'Bloco A'),
(2, 'Bloco B'),
(3, 'Bloco C');

INSERT INTO cargos (id, nome_cargo) VALUES
(1, 'Administrador'),
(2, 'Professor'),
(3, 'Instrutor');

INSERT INTO categorias (id_categoria, nome_categoria) VALUES
(1, 'Periféricos'),
(2, 'Eletrônicos'),
(3, 'Material de Usinagem');

INSERT INTO salas (id_sala, nome_sala, id_area, idbloco, descricao_sala) VALUES
(1, 'Sala 15A', 1, 2, 'Sala equipada com recursos audiovisuais para aulas teóricas e práticas, localizada no segundo bloco do campus.'),
(2, 'Sala 8B', 2, 1, 'Espaço moderno voltado para disciplinas de tecnologia da informação, situada no primeiro bloco do campus.'),
(3, 'Sala 11C', 3, 3, 'Laboratório de ciências equipado com instrumentos de última geração, localizado no terceiro bloco do campus.');


INSERT INTO estoque (id_estoque, data_registro_material, nome_material, observacao, quantidade, id_area, id_categoria) VALUES
(1, '08/06/2024', 'Caneta BIC AZUL', 'Em bom estado', 35, 1, 1),
(2, '10/05/2020', 'Placa de Metal 25x10', 'Placa para fresar', 50, 3, 3),
(3, '29/11/2023', 'Fios diversos', 'Fios para aulas', 100, 2, 2);

INSERT INTO responsaveis (id_responsavel, email, foto, nome_responsavel, senha, id_cargo, idsala) VALUES
(1, 'adm@senai.com', '', 'Administrador', '123', 1, 1),
(2, 'rafa@senai.com', '', 'Rafael Moura', '123', 2, 2),
(3, 'eduardo@senai.com', '', 'Eduardo', '123', 3, 3),
(4, 'heitor@senai.com', '', 'Heitor', '123', 3, 3);

INSERT INTO patrimonio (id_patrimonio, data_registro_patrimonio, nome_patrimonio, status_patrimonio, id_area, id_bloco, id_categoria, idsala) VALUES
(1, '20/10/2023', 'Computador', 'Ativo', 1, 1, 1, 1),
(2, '15/07/2022', 'Cadeira', 'Ativo', 2, 2, 2, 2),
(3, '16/03/2024', 'Escada', 'Inativo', 2, 3, 2, 3);