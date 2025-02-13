-- Step 1: Selecting the database
USE company;

-- Step 2: Exploring Aggregate Functions

-----------------------------------------------------------
-- 1. AVG() - Calculates the average value of a numeric column
-----------------------------------------------------------
-- Finds the average salary from the employee_info table
SELECT AVG(employee_salary) AS average_salary FROM employee_info;

-- Tip: Use WHERE to calculate the average for a subset of data
SELECT AVG(employee_salary) AS avg_salary_for_dept
FROM employee_info
WHERE department = 'Sales';

-----------------------------------------------------------
-- 2. MAX() - Retrieves the maximum value
-----------------------------------------------------------
-- Finds the highest salary in the company
SELECT MAX(employee_salary) AS max_salary FROM employee_info;

-- Tip: Use GROUP BY to find the highest salary by department
SELECT department, MAX(employee_salary) AS max_salary
FROM employee_info
GROUP BY department;

-----------------------------------------------------------
-- 3. MIN() - Retrieves the minimum value
-----------------------------------------------------------
-- Finds the lowest salary among employees with IDs greater than 2
SELECT MIN(employee_salary) AS min_salary FROM employee_info
WHERE employee_id > 2;

-- Tip: MIN() is useful for finding the earliest date in date fields
SELECT MIN(hire_date) AS first_hire_date FROM employee_info;

-----------------------------------------------------------
-- 4. SUM() - Calculates the sum of a numeric column
-----------------------------------------------------------
-- Calculates the total sum of all employee salaries
SELECT SUM(employee_salary) AS total_salary FROM employee_info;

-- Tip: Use GROUP BY to get total salaries by department
SELECT department, SUM(employee_salary) AS total_salary
FROM employee_info
GROUP BY department;

-----------------------------------------------------------
-- 5. COUNT() - Counts the number of rows
-----------------------------------------------------------
-- Counts the total number of employees
SELECT COUNT(employee_id) AS total_employees FROM employee_info;

-- Tip: COUNT(*) counts all rows, COUNT(column) counts non-NULL values
SELECT COUNT(*) AS all_rows FROM employee_info;
SELECT COUNT(employee_email) AS email_count FROM employee_info;

