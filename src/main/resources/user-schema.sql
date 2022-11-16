DROP TABLE IF EXISTS Persons;

CREATE TABLE Persons (
    Personid int NOT NULL AUTO_INCREMENT,
    FirstName varchar(255),
    LastName varchar(255) NOT NULL,
    Email varchar(100),
    Phone varchar(20),
    PRIMARY KEY (Personid)
);