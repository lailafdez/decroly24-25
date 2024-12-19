DROP DATABASE AC2;
CREATE DATABASE AC2;
USE AC2;

CREATE TABLE Members (
id_members INT PRIMARY KEY,
name VARCHAR (40) NOT NULL,
email VARCHAR (80) NOT NULL,
phone_number VARCHAR (13)
);

CREATE TABLE Instructors (
id_instructors INT PRIMARY KEY,
name VARCHAR (40) NOT NULL
);

CREATE TABLE Tipos (
id_types INT PRIMARY KEY,
type_name VARCHAR (40) NOT NULL
);

CREATE TABLE Classes (
id_classes INT PRIMARY KEY,
class_name VARCHAR (40) NOT NULL,
duration_mins DATE,
id_types INT,
foreign key (id_types) references Types(id_types)
);

CREATE TABLE Class_Schedule (
id_classSchedule INT PRIMARY KEY,
Start_time DATETIME NOT NULL,
End_time DATETIME NOT NULL,
id_classes INT,
id_instructors INT,
foreign key (id_classes) references Classes (id_classes),
foreign key (id_instructors) references Instructors (id_instructors)
);

CREATE TABLE Members_SignUps (
id_membersSignUps INT,
no_show boolean, 
id_members INT,
id_classSchedule INT,
foreign key (id_members) references Members (id_members),
foreign key (id_class_schedule) references Class_Schedule (id_class_schedule)
);




