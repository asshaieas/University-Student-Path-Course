-- ------------------------------------------------------------
-- Database: Company
-- Purpose: Managing employee information including ID, name, salary, and email
-- Author: [Abdul Baset Saleh]
-- ------------------------------------------------------------

-- Selecting the database to work with
USE company;

-- ------------------------------------------------------------
-- Table: employee_info
-- Purpose: Storing employee details with unique ID, name, salary, and email
-- ------------------------------------------------------------
CREATE TABLE employee_info (
    employee_id INT PRIMARY KEY -- Unique identifier for each employee
);

-- ------------------------------------------------------------
-- Adding columns to store employee details
-- VARCHAR(225): Stores employee name and email
-- DOUBLE: Stores employee salary
-- ------------------------------------------------------------
ALTER TABLE employee_info 
    ADD COLUMN employee_name VARCHAR(225), 
    ADD COLUMN employee_salary DOUBLE,
    ADD COLUMN employee_email VARCHAR(225);

-- ------------------------------------------------------------
-- Inserting a single row into the table
-- Note: Providing values for all columns
-- ------------------------------------------------------------
INSERT INTO employee_info 
VALUES (1, "Abdul Baset Saleh", 7000.21, "abdulbaset@gmail.ss");

-- ------------------------------------------------------------
-- Inserting a row without providing an email
-- Note: The employee_email field will be NULL for Mona
-- ------------------------------------------------------------
INSERT INTO employee_info (employee_id, employee_name, employee_salary) 
VALUES (2, "Mona", 70010.21);

-- ------------------------------------------------------------
-- Verifying if data was inserted successfully
-- ------------------------------------------------------------
SELECT * FROM employee_info;

-- ------------------------------------------------------------
-- Inserting multiple rows in a single query
-- Best practice: Bulk insertion improves performance
-- ------------------------------------------------------------
INSERT INTO employee_info 
VALUES 
    (3, "Mohammed", 1234.1312, "moh@email.com"), 
    (4, "Nada", 1432.12, "nada@nada.com"),
    (5, "Ali", 312.12, "ali@ali.com");

-- Checking the table after bulk insertion
SELECT * FROM employee_info;

-- ------------------------------------------------------------
-- Using WHERE clause for filtering data
-- ------------------------------------------------------------

-- Retrieve employees with an ID greater than or equal to 2
SELECT * FROM employee_info WHERE employee_id >= 2;

-- Retrieve all employees except the one with ID = 2
SELECT * FROM employee_info WHERE employee_id != 2;

-- Retrieve all employees who do not have an email (NULL values)
SELECT * FROM employee_info WHERE employee_email IS NULL;

-- ------------------------------------------------------------
-- Updating data in the table
-- Purpose: Assigning an email to Mona (employee_id = 2)
-- ------------------------------------------------------------
UPDATE employee_info 
SET employee_email = "mona@mona.com" 
WHERE employee_id = 2;

-- Checking the update
SELECT * FROM employee_info;

-- ------------------------------------------------------------
-- Deleting rows from the table
-- Purpose: Removing employee with ID = 4
-- Note: Always use WHERE to avoid deleting all rows by mistake!
-- ------------------------------------------------------------
DELETE FROM employee_info WHERE employee_id = 4;

-- Checking the table after deletion
SELECT * FROM employee_info;

-- ------------------------------------------------------------
-- Sorting data using ORDER BY
-- ------------------------------------------------------------

-- Sorting employees by email in ascending order (A-Z)
SELECT * FROM employee_info ORDER BY employee_email ASC;

-- Sorting employees by salary in descending order (highest to lowest)
SELECT * FROM employee_info ORDER BY employee_salary DESC;

-- ------------------------------------------------------------
-- Grouping data using GROUP BY
-- Purpose: Displaying distinct salary groups
-- Note: GROUP BY is often used with aggregate functions like COUNT, SUM, AVG
-- ------------------------------------------------------------
SELECT employee_salary FROM employee_info GROUP BY employee_salary;
