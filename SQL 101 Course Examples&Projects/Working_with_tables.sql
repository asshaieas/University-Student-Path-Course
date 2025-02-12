USE company;

-- Step 1: Create the 'employees' table  
-- This table stores employee details, including ID, salary, and bonus.
CREATE TABLE employees (
    employee_ID INT PRIMARY KEY,       -- Unique identifier for each employee  
    employee_Salary DOUBLE,            -- Employee's salary  
    employee_bonus DOUBLE              -- Employee's bonus  
);

-- Step 2: Display all records from the 'employees' table  
-- This helps verify if the table was created successfully.  
SELECT * FROM employees;

-- Step 3: Show the structure (columns) of the 'employees' table  
-- This command provides metadata about the table, including column names and types.
SHOW COLUMNS FROM employees;

-- Step 4: Add a new column 'employee_email'  
-- Adding an email column to store employees' email addresses.  
ALTER TABLE employees ADD COLUMN employee_email VARCHAR(225);

-- Step 5: Verify if the new column was added successfully  
SHOW COLUMNS FROM employees;

-- Step 6: Modify the data type of 'employee_ID'  
-- Converting 'employee_ID' from INT to CHAR(225).  
-- NOTE: Be cautious when changing data types, as it can affect data integrity.  
ALTER TABLE employees MODIFY COLUMN employee_ID CHAR(225);
SHOW COLUMNS FROM employees;

-- Step 7: Drop the 'employee_bonus' column  
-- Removing the bonus column from the table.  
-- NOTE: This action is irreversible unless you have a backup.  
ALTER TABLE employees DROP COLUMN employee_bonus;
SHOW COLUMNS FROM employees;

-- Step 8: Show all tables in the current database  
-- This command lists all tables under the 'company' database.  
SHOW TABLES;

-- Step 9: Rename the 'employees' table  
-- Here, we rename 'employees' to 'tableRename'.  
ALTER TABLE employees RENAME TO tableRename;
SHOW TABLES;

-- Step 10: Revert the table name back to 'employees'  
-- This restores the original table name.  
RENAME TABLE tableRename TO employees;
SHOW TABLES;

-- Step 11: Drop (delete) the 'employees' table  
-- WARNING: This permanently deletes the table and all its data.  
-- Uncomment the next line if you intend to execute this command.  
-- DROP TABLE employees;

SHOW TABLES;
