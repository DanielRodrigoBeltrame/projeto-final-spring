INSERT INTO person (id, name, birth_date, identification_document, email)
VALUES
  ('1f6a0b16-1d38-4dd2-a6c7-5e4b7d6c1a24', 'João Silva', '1990-01-15', '123456789', 'joao.silva@example.com'),
  ('59c6e792-4bb3-47d9-8a5b-4c13d3ec94a9', 'Maria Santos', '1985-06-20', '987654321', 'maria.santos@example.com');

INSERT INTO people_skills (id, observation, date_skill, person_id)
VALUES
  ('9f531c83-3455-47ca-ae6d-af4a34e1815e', 'Excelente em programação', '2023-01-10', '1f6a0b16-1d38-4dd2-a6c7-5e4b7d6c1a24'),
  ('33a7c1c7-2c17-4f0f-a3a4-3e5c3e60c18c', 'Boas habilidades de comunicação', '2023-03-25', '59c6e792-4bb3-47d9-8a5b-4c13d3ec94a9');

INSERT INTO skill (id, description, observation, people_skills_id)
VALUES
  ('2a6fbb03-3c3b-4f85-8ea6-4563521a4684', 'Programação em Python', 'Python 3.5 e superior', '9f531c83-3455-47ca-ae6d-af4a34e1815e'),
  ('75a845ef-0ab5-4df0-8e86-7803f2841f0e', 'Habilidades de Comunicação', 'Apresentações eficazes', '33a7c1c7-2c17-4f0f-a3a4-3e5c3e60c18c');
