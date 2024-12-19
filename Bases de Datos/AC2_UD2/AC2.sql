DROP DATABASE AC2;
CREATE DATABASE AC2;
USE AC2;

CREATE TABLE Libros (
ISBN INT PRIMARY KEY,
Nombre_Libro VARCHAR (80) NOT NULL,
Autor VARCHAR (40) NOT NULL,
Fecha_Reserva_Libro DATETIME NOT NULL
);

CREATE TABLE Usuarios (
id_Usuario INT PRIMARY KEY,
Nombre VARCHAR (40) NOT NULL,
Direccion VARCHAR (80) NOT NULL,
Sexo Varchar (10),
Fecha_Reserva_Libro DATETIME NOT NULL,
foreign key (Fecha_Reserva_Libro) references Libros (Fecha_Reserva_Libro)
);

CREATE TABLE Solicitudes (
num_Solicitud INT PRIMARY KEY,
Nombre VARCHAR (40) NOT NULL,
Autor VARCHAR (80) NOT NULL,
id_Usuario INT NOT NULL,
ISBN INT NOT NULL,
foreign key (id_Usuario) references Usuarios (id_Usuario),
foreign key (ISBN) references Libros (ISBN)
);

