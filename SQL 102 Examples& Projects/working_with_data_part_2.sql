-- Step 1: Using the 'USE' statement to select the database
USE company;

-- Step 2: Creating a table without defining a primary key
CREATE TABLE user (
    user_id INT NOT NULL,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    age INT CHECK (age > 0) -- Ensures age is a positive number
);

-- Step 3: Adding a PRIMARY KEY to an existing table using ALTER TABLE
ALTER TABLE user ADD PRIMARY KEY (user_id);

-- Tip: If 'user_id' should auto-increment, use:
-- ALTER TABLE user MODIFY COLUMN user_id INT AUTO_INCREMENT;

-----------------------------------------------------------
-- LIKE Operator Examples
-----------------------------------------------------------
-- Check if the table contains data before using LIKE
SELECT * FROM employee_info;

-- Finds employees whose name starts with 'A'
SELECT * FROM employee_info WHERE employee_name LIKE 'A%';

-- Finds employees whose name starts with 'A' and has exactly 3 letters (A__)
SELECT * FROM employee_info WHERE employee_name LIKE 'A__';

-- Finds employees whose name ends with 'i'
SELECT * FROM employee_info WHERE employee_name LIKE '%i';

-----------------------------------------------------------
-- DISTINCT Keyword: Removes duplicate values
-----------------------------------------------------------
SELECT DISTINCT employee_name FROM employee_info;

-----------------------------------------------------------
-- AS Keyword: Renaming columns temporarily
-----------------------------------------------------------
SELECT employee_name AS employee_username FROM employee_info;

-----------------------------------------------------------
-- Operators: Arithmetic, Logical, Comparison
-----------------------------------------------------------
-- Comparison Operators
SELECT 1 > 2; -- Returns 0 (False)
SELECT 2 < 3; -- Returns 1 (True)

-- Logical Operators
SELECT 1 AND 1; -- Returns 1 (True)
SELECT 1 IN (1, 3, 4); -- Returns 1 (True)
SELECT (5 * 2) AND (5 % 2); -- Returns 1 (True)

-----------------------------------------------------------
-- Copying Data from One Table to Another
-----------------------------------------------------------
-- Creates a new table and copies records where employee_id >= 3
CREATE TABLE copy_of_employee_info AS
SELECT * FROM employee_info WHERE employee_id >= 3;

-- Verify the copied data
SELECT * FROM copy_of_employee_info;
