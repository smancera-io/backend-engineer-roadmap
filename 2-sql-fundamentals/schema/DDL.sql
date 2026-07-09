-- Active: 1783470162528@@127.0.0.1@3306@practice_sql
/* Create database */
CREATE DATABASE practice_sql;

/* Select table to work with it */
USE practice_sql;

CREATE TABLE city (
    id INT AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL UNIQUE,
    PRIMARY KEY (id)
);

CREATE TABLE client_type (
    id INT AUTO_INCREMENT,
    name VARCHAR(30) NOT NULL UNIQUE,
    PRIMARY KEY (id)
);

CREATE TABLE task_status (
    id INT AUTO_INCREMENT,
    name VARCHAR(30) NOT NULL UNIQUE,
    PRIMARY KEY (id)
);

CREATE TABLE task_priority (
    id INT AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL UNIQUE,
    PRIMARY KEY (id)
);

CREATE TABLE developer_level (
    id INT AUTO_INCREMENT,
    name VARCHAR(30) NOT NULL UNIQUE,
    base_salary DECIMAL(10, 2) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE developer_specialty (
    id INT AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL UNIQUE,
    PRIMARY KEY (id)
);

CREATE TABLE proyect_role (
    id INT AUTO_INCREMENT,
    name VARCHAR(30) NOT NULL UNIQUE,
    PRIMARY KEY (id)
);

CREATE TABLE proyect_status (
    id INT AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL UNIQUE,
    PRIMARY KEY (id)
);

CREATE TABLE person (
    id INT AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    birth_date DATE NOT NULL,
    phone_number VARCHAR(30) NOT NULL UNIQUE,
    email VARCHAR(50) NOT NULL UNIQUE,
    city INT NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_person_city FOREIGN KEY (city) REFERENCES city (id)
);

CREATE TABLE developer (
    id INT NOT NULL,
    level INT NOT NULL,
    specialty INT NOT NULL,
    hire_date DATE NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_developer_id FOREIGN KEY (id) REFERENCES person (id),
    CONSTRAINT fk_developer_level FOREIGN KEY (level) REFERENCES developer_level (id),
    CONSTRAINT fk_developer_specialty FOREIGN KEY (specialty) REFERENCES developer_specialty (id)
);

CREATE TABLE developer_level_history (
    id INT AUTO_INCREMENT,
    developer INT NOT NULL,
    level INT NOT NULL,
    salary DECIMAL(10, 2) NOT NULL,
    start_timestamp TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    end_timestamp DATE NULL DEFAULT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (developer) REFERENCES developer (id),
    FOREIGN KEY (level) REFERENCES developer_level (id)
);

CREATE TABLE client (
    id INT NOT NULL,
    type INT NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_client_id FOREIGN KEY (id) REFERENCES person (id),
    CONSTRAINT fk_client_type FOREIGN KEY (type) REFERENCES client_type (id)
);

CREATE TABLE proyect (
    id INT AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    description TEXT NOT NULL,
    budget DECIMAL(10, 2),
    start_date DATE NOT NULL,
    estimated_completion_date DATE,
    status INT NOT NULL,
    client INT NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_proyect_status FOREIGN KEY (status) REFERENCES proyect_status (id),
    CONSTRAINT fk_proyect_client FOREIGN KEY (client) REFERENCES client (id)
);

CREATE TABLE assignment (
    id INT AUTO_INCREMENT,
    proyect INT NOT NULL,
    developer INT NOT NULL,
    role INT NOT NULL,
    assignment_date DATE,
    PRIMARY KEY (id),
    CONSTRAINT fk_assignment_proyecy FOREIGN KEY (proyect) REFERENCES proyect (id),
    CONSTRAINT fk_assignment_developer FOREIGN KEY (developer) REFERENCES developer (id),
    CONSTRAINT fk_assignment_role FOREIGN KEY (role) REFERENCES proyect_role (id)
);

CREATE TABLE task (
    id INT AUTO_INCREMENT,
    description TEXT NOT NULL,
    status INT NOT NULL,
    priority INT NOT NULL,
    start_date DATE NOT NULL,
    estimated_completion_date DATE,
    proyect INT NOT NULL,
    developer INT NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_task_status FOREIGN KEY (status) REFERENCES task_status (id),
    CONSTRAINT fk_task_priority FOREIGn KEY (priority) REFERENCES task_priority (id),
    CONSTRAINT fk_task_proyect FOREIGN KEY (proyect) REFERENCES proyect (id),
    CONSTRAINT fk_task_developer FOREIGN KEY (developer) REFERENCES developer (id)
);