-- Active: 1783470162528@@127.0.0.1@3306@practice_sql
/* Create database */
CREATE DATABASE practice_sql;

/* Select table to work with it */
USE practice_sql;

/* Create table 'employee' */
CREATE TABLE employee (
    id INT AUTO_INCREMENT,
    name VARCHAR(50),
    department VARCHAR(50),
    salary DECIMAL(10,2),
    city VARCHAR(50),
    entry_date DATE,
    PRIMARY KEY(id)
);