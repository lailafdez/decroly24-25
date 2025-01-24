create database actividad1_ud3;
use actividad1_ud3;

create table Departamento (
ID_departamento int auto_increment primary key,
Nombre VARCHAR(50),
Ubicacion VARCHAR(50)
);

create table Empleado (
DNI_NIE VARCHAR(9) primary key,
Nombre VARCHAR(50),
Apellidos VARCHAR(50),
Fecha_de_nacimiento DATE,
ID_departamento int,
foreign key (ID_departamento) references Departamento (ID_departamento)
);

create table Coche (
Matriula VARCHAR(7) primary key,
Marca VARCHAR(40),
Modelo VARCHAR(40),
DNI_NIE VARCHAR(9),
foreign key (DNI_NIE) references Empleado (DNI_NIE)
);

insert into Empleado (DNI_NIE, Nombre, Apellidos, Fecha_de_nacimiento, ID_departamento) values ('24540355E', 'Pedro', 'Arza', '16-09-2003', 1),
('23456789E', 'Camilo', 'Arone', '29-02-2002', 1),
('98765432E', 'Laila', 'Fernandez', '12-09-2005', 1),
('13445782E', 'Aitor', 'Gutierrez', '25-12-2004', 1);
insert into Departamento (ID_departamento, Nombre, Ubicacion) values (1, 'Administracion', 'Edificio 2');
insert into Coche (Matricula, Marca, Modelo, DNI_NIE) values ('0033HXL', 'Renault', 'Clio', '24540355E'),
('1234FJZ');

update Empleado 
set Nombre = 'Carlos'
where DNI_NIE = '98765432E';

update Departamento 
set Nombre = 'IT'
where ID_departamento = 1;

update Coche
set Marca = 'Seat', Modelo = 'Ibiza'
where Matricula = '1234FJZ';

delete from Empleado
where DNI_NIE = '13445782E';

delete from Coche 
where Matricula = '123FJZ';

delete from Empleado;
delete from Departamento;
delete from Coche;