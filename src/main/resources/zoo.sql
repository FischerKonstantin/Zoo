DROP TABLE IF EXISTS animal;
DROP TABLE IF EXISTS caretaker CASCADE;
DROP TABLE IF EXISTS cell CASCADE;



CREATE TABLE caretaker (
id SERIAL,
first_name varchar(300),
surname varchar(300),
care_id INTEGER,
PRIMARY KEY (care_id)
);

CREATE TABLE cell (
id SERIAL,
number INTEGER,
PRIMARY KEY (number)
);

CREATE TABLE animal (
id SERIAL,
name varchar(300) not null,
view varchar(300) not null,
age INTEGER,
care_id_2 INTEGER,
cell_id_2 INTEGER,
PRIMARY KEY (id),
FOREIGN KEY (care_id_2) REFERENCES caretaker(care_id) ON DELETE RESTRICT,
FOREIGN KEY (cell_id_2) REFERENCES cell(number) ON DELETE RESTRICT
);



INSERT INTO caretaker (first_name, surname, care_id) VALUES
('Константин', 'Фишер', 1),
('Иван', 'Петров', 2),
('Петр','Иванов', 3),
('Василий','Сидоров', 4);

INSERT INTO cell (number) VALUES (1), (2), (3);

INSERT INTO animal (name, view, age, care_id_2, cell_id_2) VALUES
('Нора', 'Собака', 3, 1, 1),
('Фрося', 'Собака', 2, 1, 1),
('Миша', 'Медведь', 3, 2, 2),
('Барсик', 'Кот', 5, 3, 3);