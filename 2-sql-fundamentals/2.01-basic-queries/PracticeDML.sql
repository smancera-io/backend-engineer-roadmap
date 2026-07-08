-- Active: 1783470162528@@127.0.0.1@3306@practice_sql
CREATE DATABASE practice_sql;

CREATE TABLE employee (
    id INT AUTO_INCREMENT,
    name VARCHAR(50),
    department VARCHAR(50),
    salary DECIMAL(10,2),
    city VARCHAR(50),
    entry_date DATE,
    PRIMARY KEY(id)
);